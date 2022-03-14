public class Student {
    private int number;
    private String name;
    private int currentTerm;
    private int advisorId;
    private Draft draft=new Draft();

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCurrentTerm() {
        return currentTerm;
    }
    public void setCurrentTerm(int currentTerm) {
        this.currentTerm = currentTerm;
    }
    public int getAdvisorId() {
        return advisorId;
    }
    public void setAdvisorId(int advisorId) {
        this.advisorId = advisorId;
    }
    public Student(int number, String name, int currentTerm) {
        this.number = number;
        this.name = name;
        this.currentTerm = currentTerm;
    }
    public Draft getDraft() {
        return draft;
    }
    public void setDraft(Draft draft) {
        this.draft = draft;
    }

    public void approveDraft(){
        System.out.println("Draft forwarded to the advisor.");
        System.out.println("that's all for now :)");
    }
}
