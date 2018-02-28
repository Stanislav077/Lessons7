import java.io.IOException;

/**
 * Created by Станислав on 28.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
          //  System.out.println(demo.read("F:\\test7.txt"));
            System.out.println(demo.read("F:\\test.txt"));
        } catch (IOException e) {
            System.out.println("------File not found----------");
            e.printStackTrace();
        }finally {
            System.out.println("------Finally--------");
        }
    }
}
