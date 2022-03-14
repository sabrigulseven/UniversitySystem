import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentCatalog {

    List<Student> students;

    public StudentCatalog() {
        students = new ArrayList<>(){
            {
                add(new Student(1, "Sabri Gülseven", 1));
                add(new Student(2, "Ali Yılmaz", 3));
                add(new Student(3, "Süleyman Çakır", 7));

            }
        };
    }
    public Student getById(int studentNumber){
        return students.stream().filter(student -> student.getNumber() == studentNumber).collect(Collectors.toList()).get(0);

    }
}