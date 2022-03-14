public class Session {
    
    private Course course;
    // private Classroom classroom;
    // private int day;
    // private int startTime;
    // private int endTime;
    
    // public Session(Course course, Classroom classroom, int day, int startTime, int endTime) {
    //     this.course = course;
    //     this.classroom = classroom;
    //     this.day = day;
    //     this.startTime = startTime;
    //     this.endTime = endTime;
    // }


    public Session(Course course) {
        this.course = course;
    }
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Session [course=" + course + "]";
    }

    // public Classroom getClassroom() {
    //     return classroom;
    // }

    // public void setClassroom(Classroom classroom) {
    //     this.classroom = classroom;
    // }

    // public int getDay() {
    //     return day;
    // }

    // public void setDay(int day) {
    //     this.day = day;
    // }

    // public int getStartTime() {
    //     return startTime;
    // }

    // public void setStartTime(int startTime) {
    //     this.startTime = startTime;
    // }

    // public int getEndTime() {
    //     return endTime;
    // }

    // public void setEndTime(int endTime) {
    //     this.endTime = endTime;
    // }

}
