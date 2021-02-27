package geekbrains.lesson_2_3;

import java.util.HashMap;
import java.util.Set;

public class Book {
    HashMap<String, Long> pBook = new HashMap<>();

    public void add (String surname, Long phoneNumber){
        pBook.put(surname,phoneNumber);
    }
    public Long get (String surname){
        return pBook.get(surname);
    }
}
