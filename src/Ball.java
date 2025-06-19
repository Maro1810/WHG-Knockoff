import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.net.URL;

import javax.swing.ImageIcon;

public class Ball {

    private int xpos;
    private int ypos;

    Image img;
    AffineTransform tx;

    URL path = getClass().getResource("/assets/ball.png");
    ImageIcon imgIcon = new ImageIcon(path);

    public Ball(int x, int y) {
        xpos = x;
        ypos = y;

        img = imgIcon.getImage();

        tx = AffineTransform.getTranslateInstance(x, y);


        updateTransform(x, y);
    }

    public void draw(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(img, tx, null);
    }


    private void updateTransform(int x, int y) {
        tx.setToTranslation(x, y);
        tx.scale(1, 1);
    }
}
