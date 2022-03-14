public class Classroom {
    
    private int id;
    private int capacity;
    private String classroomName;
    
    public Classroom(int id, int capacity, String classroomName) {
        this.id = id;
        this.capacity = capacity;
        this.classroomName = classroomName;
    }

    public boolean isAvailable(int day, int startTime, int endTime) {
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    @Override
    public String toString() {
        return "Classroom [id=" + id + ", classroomName=" + classroomName + ", capacity=" + capacity + "]";
    }
    
}
