package bl_Gigasecond;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    LocalDate moment;
    LocalDateTime momentTime;
    
    public Gigasecond(LocalDate moment) {
        this.moment = moment;
    }

    public Gigasecond(LocalDateTime moment) {
        this.momentTime = moment;
    }

    public LocalDateTime getDateTime() {
        return momentTime != null ? momentTime.plusSeconds(1_000_000_000)
                : moment.atStartOfDay().plusSeconds(1_000_000_000);
    }
}
