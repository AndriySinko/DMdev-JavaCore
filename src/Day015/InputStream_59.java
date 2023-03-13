package Day015;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStream_59 {
    /**
     * FileInputStream это класс которй позволяет считывать любой файл(видео картинка текст) по байтам(по всем сразу или по 1)
     * Path - способ создания файла через метод .toFile
     * .available - метод который возвращает кол-во байтов в файле
     * Все потоки ввода и вывода данных обязательно нужно закрывать с помощью .close
     */
    public static void main(String[] args) {
        File file = Path.of("resources","testDir","test.txt").toFile();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = fileInputStream.readAllBytes();
            String string = new String(bytes);
            System.out.println(string);
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[fileInputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) fileInputStream.read()) != -1){
                bytes[counter] = currentByte;
                counter++;
            }
            String string = new String(bytes);
            System.out.println(string);
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
