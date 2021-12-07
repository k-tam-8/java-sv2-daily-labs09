package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {
    private String extraCode;

    public FrontOfStageTicket(String bandName, LocalDateTime dateTime, String extraCode) {
        super(bandName, dateTime);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return LocalTime.from(getDateTime().toLocalTime().minusHours(2));
    }
}
