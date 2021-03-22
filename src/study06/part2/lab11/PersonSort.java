package study06.part2.lab11;

import study06.part2.lab11.Comparator.AgeComparator;
import study06.part2.lab11.Comparator.NameComparator;
import study06.part2.lab11.Comparator.SurNameComparator;

import java.util.ArrayList;
import java.util.List;

public class PersonSort {
    public static List<Person> generateList() {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Stan", "Marsh", 10));
        list.add(new Person("Kenny", "McCormick", 9));
        list.add(new Person("Eric", "Cartman", 10));
        list.add(new Person("Kyle", "Broflovski", 9));

        return list;
    }

    public static void sortByName(List<Person> list) {
        list.sort(new NameComparator());
    }
    public static void sortBySurName(List<Person> list) {
        list.sort(new SurNameComparator());
    }
    public static void sortByAge(List<Person> list) {
        list.sort(new AgeComparator());
    }
}
