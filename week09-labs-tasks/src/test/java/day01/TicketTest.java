package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    @Test
    void testTicket() {
        Ticket ticket = new Ticket("Slayer", LocalDateTime.of(2000,1,1,15,0));
        LocalTime x = LocalTime.of(14,0);
        assertEquals(x, ticket.entryTime());
    }

    @Test
    void testFrontStageTicket() {
        FrontOfStageTicket fst = new FrontOfStageTicket("Slayer", LocalDateTime.of(2000,1,1,15,0), "1541DFSA");
        LocalTime x = LocalTime.of(13,0);
        assertEquals(x, fst.entryTime());
    }

    @Test
    void concertTest() {
        Concert concert = new Concert();
        Person person = new Person();
        LocalDateTime dateTime = LocalDateTime.of(2000,1,1,14,30);
        LocalDateTime dateTime2 = LocalDateTime.of(2000,1,1,10,30);
        person.setTicket(new Ticket("Slayer", LocalDateTime.of(2000,1,1,15,0)));
        
        concert.addPerson(person, dateTime);
        assertEquals(1, concert.getPersonList().size());

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () ->         concert.addPerson(person, dateTime2));
        assertEquals("Még nem mehet be!", exception.getMessage());
    }

}