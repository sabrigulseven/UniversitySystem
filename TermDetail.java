import java.util.ArrayList;
import java.util.List;

public class TermDetail {

    private String status;
    private int term;
    private int year;
    private List<Session> sessions = new ArrayList<>();

    public TermDetail(String status, int term, int year) {
        this.status = status;
        this.term = term;
        this.year = year;
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
    
}
