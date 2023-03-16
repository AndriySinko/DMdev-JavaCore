package Day016.SerializationAndDeSeralization_64;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

public class Test {
    /**
     * Мы сохраняем состояние нашей программы. Допустим, ты играешь в стратегию за Испанию. У твоей игры есть состояние:
     * кто какими территориями владеет, у кого сколько ресурсов, кто с кем в союзе, а кто наоборот — в состоянии войны,
     * и так далее. Эту информацию, состояние нашей программы, необходимо как-то сохранить, чтобы в дальнейшем восстановить
     * данные и продолжить игру. Для этого как раз и используются механизмы сериализации и десереализации.
     *
     * Сериализация — это процесс сохранения состояния объекта в последовательность байт.
     *
     * Десериализация — это процесс восстановления объекта из этих байт.
     *
     * https://javarush.com/groups/posts/2022-serializacija-i-deserializacija-v-java
     */
    public static void main(String[] args) {
        Person person = new Person(15,"Anton");
        Person person1 = new Person(33,"Ruslan");
        Person person2 = new Person(27,"Artem");
        Path path = Path.of("resources","testDir","serialization.txt");
        try {
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(path.toFile()));
            ous.writeObject(person);
            ous.writeObject(person1);
            ous.writeObject(person2);
            ous.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
