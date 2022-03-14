import java.util.ArrayList;
import java.util.List;

public class EducationPlan {

    List<List<Course>> termRequirement = new ArrayList<>();

    public EducationPlan() {

        // Initialize Term Requirement
        for(int i = 0; i < 8; i++) {
            List<Course> courses = new ArrayList<>();
            for(int courseId = 0; courseId < 4; courseId++) {
                courses.add(new Course(courseId, String.format("Course %d - Term %d", courseId, i + 1),10));
            }

            termRequirement.add(courses);
        }
    }

    public List<Course> getTermReqs(int termNumber) {
        return termRequirement.get(termNumber - 1);
    }

}
