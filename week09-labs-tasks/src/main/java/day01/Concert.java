package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person, LocalDateTime dateTime){
        if (person.getTicket().entryTime().isAfter(dateTime.toLocalTime())) {
            personList.add(person);
        } else throw new IllegalArgumentException("Még nem mehet be!");
    }

}
