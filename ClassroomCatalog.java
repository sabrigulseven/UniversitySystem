import java.util.ArrayList;
import java.util.List;

public class ClassroomCatalog {

    public List<Classroom> classrooms = new ArrayList<>();

    public ClassroomCatalog() {
        classrooms.add(new Classroom(0, 100, "B4"));
        classrooms.add(new Classroom(1, 150, "B5"));
        classrooms.add(new Classroom(2, 180, "B8"));
    } 

    public List<Classroom> getClassrooms() {
        return classrooms;
    }
}
