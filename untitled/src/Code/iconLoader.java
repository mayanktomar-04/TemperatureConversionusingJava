package Code;

import java.awt.Image;
import javax.swing.ImageIcon;

public class iconLoader {
    public iconLoader() {
    }

    public static ImageIcon loadIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage().getScaledInstance(width, height, 4);
        return new ImageIcon(img);
    }

    public static ImageIcon getFahrenheitIcon() {
        return loadIcon("resources/fahrenheit.png", 24, 24);
    }

    public static ImageIcon getCelsiusIcon() {
        return loadIcon("resources/celsius.png", 24, 24);
    }
}
