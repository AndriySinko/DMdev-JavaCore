package Day016;


import java.io.*;
import java.nio.file.Path;

public class Writer_62 {
    /**
     * Writer это класс который предназначен для записывания символов, байтов, или целых строк в файл
     * PrintWriter - наследник Writer, может принимать файл, + новые методы
     * FileWriter - позволяет записывать строки и сиволы в файлы
     * BufferedWriter - тот самый PrintWriter только может буферизировать строку что ускоряет запис, может принимать в
     * свои параметры другой Writer, есть метод переноса на новую строку
     */
    public static void main(String[] args) {
        File file = Path.of("resources","testDir","exampleprintwriter.txt").toFile();
        try {
            BufferedWriter fileWriter = new BufferedWriter( new FileWriter(file,true));
            fileWriter.write("Hello");
            fileWriter.append("Java");
            fileWriter.newLine();
            fileWriter.write("Intellij IDEA");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
