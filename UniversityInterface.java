import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniversityInterface {

    private final Department department;
    private final StudentCatalog studentCatalog;

    public UniversityInterface() {
        this.department = new Department();
        this.studentCatalog = new StudentCatalog();
    }

    public void openSession() {

        // open session
        int selectedTerm = 1;
        for(int j=0; j<4; j++) {
            List<Course> courses = department.getTermPlan(selectedTerm);
            for(int i=0; i<4; i++){
                Course selectedCourse = courses.get(i);   
                department.openSession(selectedCourse, 
                                        selectedTerm);
            }
            selectedTerm+=2;
        }
        System.out.println("Sessions are created!!");        
    }

    public void registerToSession(){

        System.out.println("please enter student Id");
        int studentNumber=1;
        System.out.println("login succesful");

        List<Session> openSessions =  department.getOpeningSessionsForStudent(studentNumber);
        openSessions.stream().forEach(session -> System.out.println(session));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the course id you want to choose(0,1,2,3), to sent draft to the advisor enter 5");
            int chosenCourse = scanner.nextInt();
            if(chosenCourse == 5)
                break;
            Student student = studentCatalog.getById(studentNumber);
            int chosenCourseCredit = openSessions.get(chosenCourse).getCourse().getCredit();
            Session session = openSessions.stream().filter(sess -> sess.getCourse().getId()==chosenCourse).collect(Collectors.toList()).get(0);

            if(student.getDraft().hasEnoughCredits(chosenCourseCredit)){
                department.registerStudentToSession(studentNumber, session);
                openSessions = openSessions.stream().filter(sess -> sess.getCourse().getId() != chosenCourse).collect(Collectors.toList());
                openSessions.stream().forEach(sess -> System.out.println(sess));
            }
            else{
                System.out.println("Not enough credits!!");
            }
            System.out.println("Remaining Credits: " + student.getDraft().getRemainingCredits());
            System.out.println("");
        }
        department.processDraftFor(studentNumber);

        scanner.close();
    }

}