package serialization;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Owner owner = new Owner("John", "Wick", 35);
        Dog dog = new Dog("Tobby", 5, owner);

        FileOutputStream out = new FileOutputStream("e:\\dog.ser");
        ObjectOutputStream outputStream = new ObjectOutputStream(out);

        outputStream.writeObject(dog);

        //---------------------------------------

        FileInputStream in = new FileInputStream("e:\\dog.ser");
        ObjectInputStream inputStream = new ObjectInputStream(in);

        Dog dogDeserialized = (Dog) inputStream.readObject();
        System.out.println(dogDeserialized);
    }
}
