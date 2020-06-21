package headfirst.learndesignpatterns.decorator.io;

import headfirst.designpatterns.decorator.io.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by peng on 2020/6/21.
 */
public class InputTest {
    public static void main(String[] args) throws IOException{
        int c;
        InputStream in = null;
        try {
            in =
                    new headfirst.designpatterns.decorator.io.LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) { in.close(); }
        }
        System.out.println();
        try (InputStream in2 =
                     new LowerCaseInputStream(
                             new BufferedInputStream(
                                     new FileInputStream("test.txt"))))
        {
            while((c = in2.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
