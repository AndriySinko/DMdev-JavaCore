package Day015;

import java.io.File;

public class File_58 {
    /**
     * В джаве есть возможность выводить какие-то данные в файлы за пределами самой программы и это называется output
     *
     *      Output:
     * Intellij IDEA -----> File
     *
     * Так же есть возможность вводить внешние данные с файла в нашу программу, это называется input
     *
     *      Input:
     * Intellij IDEA <----- File
     */
    public static void main(String[] args) {
        String s = File.separator;
        File dir = new File("resources"+s+"testDir");
        File file = new File("resources"+s+"testDir"+s+"test.txt");
        dir.mkdir();
        System.out.println(file.isFile()+" проверяет файл это или нет");
        System.out.println(file.exists()+" проверяет существует ли файл");
        System.out.println(dir.isDirectory()+" проверяет директория это или нет");
        System.out.println(file.getName()+" возвращает имя файла");
        System.out.println(file.getAbsoluteFile()+" возвращает полную ссылку на файл");
        System.out.println(file.list()+" возвращает список данных в файле");

    }
}
