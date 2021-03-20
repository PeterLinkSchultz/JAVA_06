package study06.part1.lab26;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("enter a name ");
                String line = scanner.nextLine();

                if (line.equals("q")) break;

                if (line.length() > 0 ) {
                    String result = Abbreviation.parsing(line);
                    System.out.println(result);
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Input is empty! Exit!");
        }
    }

    static String parsing(String line) {
        String[] splitted = line.split("\s");

        return Arrays.stream(splitted).reduce("", (partial, element) -> partial + element.substring(0,1).toUpperCase());
    }
}
