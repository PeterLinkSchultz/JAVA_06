package test;

import org.junit.jupiter.api.Test;
import study06.part2.lab11.Person;
import study06.part2.lab11.PersonSort;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonSortTest {

    @Test
    void sortByName() {
        List<Person> list = PersonSort.generateList();

        PersonSort.sortByName(list);

        assertAll("Sort by name",
                () -> assertEquals("Eric", list.get(0).getName()),
                () -> assertEquals("Kenny", list.get(1).getName()),
                () -> assertEquals("Kyle", list.get(2).getName()),
                () -> assertEquals("Stan", list.get(3).getName()));
    }

    @Test
    void sortBySurName() {
        List<Person> list = PersonSort.generateList();

        PersonSort.sortBySurName(list);

        assertAll("Sort by surname",
                () -> assertEquals("Broflovski", list.get(0).getSurName()),
                () -> assertEquals("Cartman", list.get(1).getSurName()),
                () -> assertEquals("Marsh", list.get(2).getSurName()),
                () -> assertEquals("McCormick", list.get(3).getSurName()));
    }

    @Test
    void sortByAge() {
        List<Person> list = PersonSort.generateList();

        PersonSort.sortByAge(list);

        assertAll("Sort by surname",
                () -> assertEquals(9, list.get(0).getAge()),
                () -> assertEquals(9, list.get(1).getAge()),
                () -> assertEquals(10, list.get(2).getAge()),
                () -> assertEquals(10, list.get(3).getAge()));
    }
}