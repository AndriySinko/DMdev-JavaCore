package Day016;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilesAndScanner_63 {
    /**
     * Files - класс который совмещает в себе все возможности потока ввода вывода - может создать новый FileInputStream
     * может принимать в себя Path, может копировать дургие потоки и т.д
     * Scanner - еще один класс с помощью которого мы можем считывать данные.
     */
    public static void main(String[] args) {
        Path path = Path.of("resources","testDir","testDir2");
        try {
            Path pw = Files.createDirectories(path);
            System.out.println(pw.getParent());
            Path pw1 = Path.of("resources","testDir","testDir2","testFiles.txt");
            BufferedWriter bufferedWriter = Files.newBufferedWriter(pw1);
            bufferedWriter.write("Привет");
            bufferedWriter.newLine();
            bufferedWriter.append("Пока");
            bufferedWriter.close();

            BufferedReader bufferedReader = Files.newBufferedReader(pw1);
            String s = bufferedReader.readLine();
            System.out.println(s);

            Scanner scanner = new Scanner(pw1);
            List<String> strings = new ArrayList<>();
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                strings.add(str);
            }
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
