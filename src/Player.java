import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;
import java.net.URL;

import javax.swing.ImageIcon;

public class Player {
    
    private int xpos;
    private int ypos;

    Image img;
    AffineTransform tx;

    URL path = getClass().getResource("/assets/square.png");
    ImageIcon imgIcon = new ImageIcon(path);

    public Player (int x, int y) {

        img = imgIcon.getImage();
        tx = AffineTransform.getTranslateInstance(x, y);

        xpos = x;
        ypos = y;

        updateTransform(x, y);
    }

    public void draw(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.drawImage(img, tx, null);

    }

    public void update() {
    }

    public void setPosition(int newX, int newY) {
        xpos = newX;
        ypos = newY;

        updateTransform(newX, newY);
    }

    public void move(int x, int y) {
        xpos += x;
        ypos += y;

        updateTransform(xpos, ypos);
    }

    private void updateTransform(int x, int y) {
        tx.setToTranslation(x, y);
        tx.scale(3, 3);
    }

}
