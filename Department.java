import java.util.ArrayList;
import java.util.List;

public class Department {
    
    private final EducationPlan educationPlan;
    private final ClassroomCatalog classroomCatalog;
    private final TermCatalog termCatalog;
    private final StudentCatalog studentCatalog;
    List<Faculty> faculties;

    public Department() {
        this.educationPlan = new EducationPlan();
        this.classroomCatalog = new ClassroomCatalog();
        this.termCatalog = new TermCatalog();
        this.studentCatalog = new StudentCatalog();
        faculties = new ArrayList<>() {
            {
                add(new Faculty(0, "Hasan", "Bulut"));
                add(new Faculty(1, "Oğuz", "Dikenelli"));
                add(new Faculty(2, "Vecdi", "Aytaç"));
            }
        };
    }

    public List<Course> getTermPlan(int termNumber) {
        return educationPlan.getTermReqs(termNumber);
    }

    public List<Classroom> getClassrooms() {
        return classroomCatalog.getClassrooms();
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void openSession(Course course,
                            int termNumber) {

        TermDetail termDetail = termCatalog.getCurrentTermFor(termNumber);
        Session session = new Session(course);
        termDetail.addSession(session);
    }

    public List<Session> getOpeningSessionsForStudent(int studentNumber){
        Student student=studentCatalog.getById(studentNumber);
        TermDetail termDetail= termCatalog.getCurrentTermFor(student.getCurrentTerm());
        return termDetail.getSessions();
        
    }

    public void registerStudentToSession(int studentNumber, Session session){
        Student student = studentCatalog.getById(studentNumber);
        student.getDraft().addToDraft(session);

    }
    public void processDraftFor(int studentNumber){
        Student student = studentCatalog.getById(studentNumber);
        student.approveDraft();
    }
}