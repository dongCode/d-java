import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageDemo {
    public static void main(String[] args) {
        try {
            
            BufferedImage image = ImageIO.read(new File("input.png"));
            
            int width = image.getWidth();
            
            int height = image.getHeight();
            
            byte[] pixels = new byte[width * height * 3]; // 3 bytes per pixel (RGB)
            int index = 0;
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixel = image.getRGB(x, y);
                    pixels[index++] = (byte) ((pixel >> 16) & 0xff); // red
                    pixels[index++] = (byte) ((pixel >> 8) & 0xff); // green
                    pixels[index++] = (byte) (pixel & 0xff); // blue
                }
            }
            // ... do something with the pixels ...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}