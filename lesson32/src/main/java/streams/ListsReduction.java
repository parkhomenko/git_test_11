package streams;

import java.util.ArrayList;
import java.util.List;

public class ListsReduction {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("john", 25);
        Student student2 = new Student("sam", 35);
        Student student3 = new Student("dean", 45);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        List<String> result = new ArrayList<>();

        students.stream()
                .map(e -> e.getName() + " - " + e.getAge())
                .forEach(result::add);

        System.out.println(result);

    }
}
