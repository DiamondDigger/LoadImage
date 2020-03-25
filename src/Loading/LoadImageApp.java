package Loading;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * This class demonstrates how to load an Image from an external file
 */
class loadImageApp extends Component {

    BufferedImage img;
    BufferedImage img1;
    BufferedImage img2;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null); // position of image
        g.drawImage(img1, 520, 0, null); // move right second image cause cover first one
        g.drawImage(img1, 1050, 0, null); // move right second image cause cover first one
    }


    //load to images
    public loadImageApp() {
        try {
            img = ImageIO.read(new File("src/Loading/recourses/animal.jpg"));
            img1 = ImageIO.read(new File("src/Loading/recourses/dog.jpg"));
            img2 = ImageIO.read(new File("src/Loading/recourses/dog.jpg"));
        } catch (IOException e) {
            System.err.println("COULDN'T LOAD AN IMAGE");
        }

    }

    public Dimension getPreferredSize() {
        if (img == null) {
            return new Dimension(300, 500);
        } else {
            return new Dimension(img.getWidth(null), img.getHeight(null));
        }
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Sample");

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.add(new loadImageApp());
        f.pack();
        f.setVisible(true);
    }
}

