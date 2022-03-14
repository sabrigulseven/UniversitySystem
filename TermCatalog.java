import java.util.ArrayList;
import java.util.List;

public class TermCatalog {
    
    List<TermDetail> termDetails = new ArrayList<>();

    public TermCatalog() {
        for(int i = 0; i < 8; i++) {
            TermDetail termDetail = new TermDetail("Active", i + 1, 2021);
            termDetails.add(termDetail);
        }
    }

    public TermDetail getCurrentTermFor(int termNumber) {
        for(TermDetail termDetail : termDetails) {
            if(termDetail.getTerm() == termNumber && termDetail.getStatus().equals("Active")) {
                return termDetail;
            }
        }
        return null;
    }
}
