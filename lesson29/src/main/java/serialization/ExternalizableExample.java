package serialization;

import java.io.*;

public class ExternalizableExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("Mark", 20);

        System.out.println("Before serialization");
        System.out.println(student);

        FileOutputStream fileOutputStream =
                new FileOutputStream("e:\\student.txt");
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);

        FileInputStream fileInputStream =
                new FileInputStream("e:\\student.txt");
        ObjectInputStream objectInputStream =
                new ObjectInputStream(fileInputStream);

        Student student1 = (Student) objectInputStream.readObject();

        System.out.println("After deserialization");
        System.out.println(student1);
    }
}
