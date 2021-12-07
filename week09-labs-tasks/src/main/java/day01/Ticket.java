package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String bandName;
     private LocalDateTime dateTime;

    public Ticket(String bandName, LocalDateTime dateTime) {
        this.bandName = bandName;
        this.dateTime = dateTime;
    }
    public LocalTime entryTime(){
        return LocalTime.from(dateTime.toLocalTime().minusHours(1));
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getBandName() {
        return bandName;
    }
}
