package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Carlos", LocalDate.of(2002,9,27));
        System.out.println(person);
        System.out.println("Age = " + person.getAge());
    }
}
