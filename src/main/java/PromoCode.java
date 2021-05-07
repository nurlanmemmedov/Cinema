import java.util.Date;
import java.util.List;

public class PromoCode {
    private int id;
    private String code;
    private Date startDate;
    private Date endDate;
    private List<Movie> movies;
    private boolean isForAll;
    private int maxUsedCount;
    private int useCountPerCustomer;
}
