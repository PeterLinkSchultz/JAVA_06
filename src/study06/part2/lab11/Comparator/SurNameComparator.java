package study06.part2.lab11.Comparator;

import study06.part2.lab11.Person;

import java.util.Comparator;

public class SurNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSurName().compareTo(o2.getSurName());
    }
}
