import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by Станислав on 28.02.2018.
 */

public class Demo {

    public static String read(String filePath) throws IOException {
        //Этот специальный объект для построения строки
        StringBuilder sb = new StringBuilder();

        //Объект для чтения файла в буфер
        BufferedReader in = new BufferedReader(new FileReader(filePath));
        try {
            //В цикле построчно считываем файл
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        }catch (IOException e)
        {
            System.out.println("");
        }

        finally {
            //Также не забываем закрыть файл
            in.close();
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

//    public static void main(String[] args) throws IOException {
//        System.out.println(read("F:\\test.txt"));
//    }
}


