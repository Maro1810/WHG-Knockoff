import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.net.URL;

import javax.swing.ImageIcon;

public class Ball {

    private double xpos;
    private double ypos;

    double vx;
    double vy;

    double vecx;
    double vecy;

    BallSize size;

    Image img;
    AffineTransform tx;

    URL path = getClass().getResource("/assets/ball.png");
    ImageIcon imgIcon = new ImageIcon(path);

    public Ball(double x, double y, BallSize size, double vecx, double vecy) {
        xpos = x;
        ypos = y;

        this.vecx = vecx;
        this.vecy = vecy;
        
        this.size = size;

        img = imgIcon.getImage();

        tx = AffineTransform.getTranslateInstance(x, y);

        double magnitude = Math.sqrt(Math.pow(vecx, 2)+Math.pow(vecy, 2));

        vx = size.getSpeed() * (vecx/magnitude);
        vy = size.getSpeed() * (vecy/magnitude);

        updateTransform(x, y);
    }

    public void draw(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(img, tx, null);
    }

    public boolean hitboxTriggered(int playerX, int playerY) {

        if (playerX+12 >= xpos && playerX+12 <= xpos + size.getActualDiameter() &&
        playerY+12 >= ypos && playerY+12 <= ypos + size.getActualDiameter()) {
            
            return true;
        }
        return false;
    }

    public void move() {

        ypos += vy;
        xpos += vx;

        if (borderDetected()) {
            vx = -vx;
            vy = -vy;
        }

        updateTransform(xpos, ypos);
    }

    public boolean borderDetected() {
        if (ypos+size.getActualDiameter() >= 565 || ypos <= 0 || xpos <= 0 || xpos+size.getActualDiameter() >= 985) {
            return true;
        }
        return false;
    }

    private void updateTransform(double x, double y) {
        tx.setToTranslation(x, y);
        tx.scale(this.size.getDiameter(), this.size.getDiameter());
    }
}
