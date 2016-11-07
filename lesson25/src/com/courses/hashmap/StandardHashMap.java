package com.courses.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StandardHashMap {
    public static void main(String[] args) {

        Student student1 = new Student("John", "Doe", 35);
        Student student2 = new Student("John", "Wick", 37);
        Student student3 = new Student("John", "Doe", 35);
        Student student4 = new Student("J", "D", 45);
        Grade grade1 = new Grade(5, "A", "excellent");
        Grade grade2 = new Grade(4, "B", "very good");
        Grade grade3 = new Grade(3, "C", "good");

        Map<Student, Grade>  studentGrades = new HashMap<>();
        studentGrades.put(student1, grade1);
        studentGrades.put(student2, grade2);
        studentGrades.put(student3, grade3);
    }
}
