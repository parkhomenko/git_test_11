package collections;

import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> students = Arrays.asList("john", "sam", "dean");

        /*
        for (String student : students) {
            System.out.println(student);
        }
        */

        //students.forEach(s -> System.out.println(s));
        students.forEach(System.out::println);

    }
}
