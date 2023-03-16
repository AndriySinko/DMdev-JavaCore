package Day016.SerializationAndDeSeralization_64;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;

public class Test2 {
    public static void main(String[] args) {
        Path path = Path.of("resources","testDir","serialization.txt");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toFile()));
            Object person=ois.readObject();
            Object person1=ois.readObject();
            Object person2=ois.readObject();
            System.out.println(person);
            System.out.println(person1);
            System.out.println(person2);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
