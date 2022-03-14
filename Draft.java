import java.util.ArrayList;
import java.util.List;

public class Draft {
    private List<Session> sessions= new ArrayList<>();
    private int remainingCredits;

    public Draft() {
        this.remainingCredits = 30;
    }

    public boolean hasEnoughCredits(int credit){

        int tempRemainingCredits= remainingCredits-credit;
        if (tempRemainingCredits < 0)
            return false;
        remainingCredits -=credit;
        return true;
    }
    public void addToDraft(Session session){
        sessions.add(session);
    }

    public int getRemainingCredits() {
        return remainingCredits;
    }

    public void setRemainingCredits(int remainingCredits) {
        this.remainingCredits = remainingCredits;
    }
}
