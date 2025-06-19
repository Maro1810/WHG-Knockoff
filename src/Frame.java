import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, KeyListener, MouseListener{
	Player player = new Player(10, 30);

	Ball ball = new Ball(70, 80);

	boolean up, down, left, right;
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		player.draw(g);
		ball.draw(g);

		repaint();
		player.update();
		update();
	}
	public void update() {
		if (up) {
			player.move(0, -1);
		}
		if (down) {
			player.move(0, 1);
		}
		if (right) {
			player.move(1, 0);
		}
		if (left) {
			player.move(-1, 0);
		}
		
	}
	public static void main(String[] arg) {
			Frame f = new Frame();
	}
	public Frame() {
			JFrame f = new JFrame("World's Hardest Game Knockoff");
			f.setSize(new Dimension(1000, 600));
			f.setBackground(Color.WHITE);
			f.add(this);
			f.setResizable(false);
			f.setLayout(new GridLayout(1,2));
			f.addKeyListener(this);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
			
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent key) {
		if (key.getKeyCode() == 87) {
			up = true;
		}
		if (key.getKeyCode() == 83) {
			down = true;
		}
		if (key.getKeyCode() == 68) {
			right = true;
		}
		if (key.getKeyCode() == 65) {
			left = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent key) {
		if (key.getKeyCode() == 87) {
			up = false;
		}
		if (key.getKeyCode() == 83) {
			down = false;
		}
		if (key.getKeyCode() == 68) {
			right = false;
		}
		if (key.getKeyCode() == 65) {
			left = false;
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
