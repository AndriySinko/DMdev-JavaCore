package Day015;

import java.io.*;
import java.nio.file.Path;

public class OutputStream_61 {
    /**
     * OutputStream - позволяет нам выводить данные с программы куда-то
     * FileOutPutStream - наследник OutputStream, принимает в параметры файл, и булеан который отвечает за то:
     * если true он добавляет данные в конце файла
     * если false который стоит по умолчанию, то при каждом вызове старые данные будут стиратся и будут записыватся новые
     * BufferOutPutStream - позволяет буферизировать данные и ускорить поток вывода
     */
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources","testDir","testOutput.txt").toFile();
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file,true));
            String string = "Test";
            outputStream.write(string.getBytes());
            outputStream.close();
    }
}
