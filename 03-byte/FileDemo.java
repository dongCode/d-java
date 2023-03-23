import java.io.*;

public class FileDemo {
    
    public static void main(String[] args) {

        try {

            FileInputStream fileInputStream = new FileInputStream("input.txt");

            byte[] buffer = new byte[1024];

            int length = fileInputStream.read(buffer);

            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

            fileOutputStream.write(buffer, 0, length);

            fileInputStream.close();

            fileOutputStream.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
