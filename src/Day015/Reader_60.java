package Day015;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Reader_60 {
    /**
     * Reader - это класс в package java.io, который является базовым классом, представляющим поток символов
     * (stream of characters), полученных при чтении определенного источника данных, например текстового файла.
     * <p>
     * Класс BufferedReader считывает текст из символьного потока ввода, буферизируя прочитанные символы. Использование
     * буфера призвано увеличить производительность чтения данных из потока.
     * <p>
     * Класс FileReader является наследником класса InputStream и используется для чтения потока символов.
     * Этот метод читает 1 символ. Возвращает int, которые является прочитанным символом.
     */
    public static void main(String[] args) {
        File file = Path.of("resources", "testDir", "test.txt").toFile();
        {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String result = bufferedReader.lines().collect(Collectors.joining("\n"));
                System.out.println(result);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}