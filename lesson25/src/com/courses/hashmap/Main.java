package com.courses.hashmap;

public class Main {
    public static void main(String[] args) {

        CustomHashMap customHashMap = new CustomHashMap();

        Student student1 = new Student("John", "Doe", 35);
        Student student2 = new Student("John", "Wick", 37);
        Student student3 = new Student("John", "Doe", 35);
        Student student4 = new Student("J", "D", 45);
        Grade grade1 = new Grade(5, "A", "excellent");
        Grade grade2 = new Grade(4, "B", "very good");
        Grade grade3 = new Grade(3, "C", "good");

        customHashMap.put(student1, grade1);
        customHashMap.put(student2, grade2);
        customHashMap.put(student3, grade3);
        //customHashMap.put(student4, grade1);

        Grade grade = customHashMap.get(student4);
    }
}
