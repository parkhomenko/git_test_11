package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable {

    private static final long serialVersionUID = -1;

    private String name;
    transient private int age;
    private Owner owner;

    private boolean vivid;

    public Dog(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        name = (String) inputStream.readObject();
        age = inputStream.readInt();
        owner = (Owner) inputStream.readObject();
    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.writeObject(name);
        outputStream.writeInt(age);
        outputStream.writeObject(owner);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }
}
