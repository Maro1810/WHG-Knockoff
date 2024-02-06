import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
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
	
	
	int squareX = 190;
	int squareY = 70;
	
	boolean up;
	boolean down;
	
	boolean right;
	boolean left;
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(squareX, squareY, 30, 30);
		
		//starting and ending area
		g.setColor(Color.green);
		g.fillRect(50, 40, 300, 85);
		g.fillRect(800, 420, 200, 115);
		g.setColor(Color.black);
		//borders
		g.fillRect(0, 0, 50, 600);
		g.fillRect(350, 200, 55, 170);
		g.fillRect(350, 0, 30, 210);
		g.fillRect(140, 370, 450, 20);
		g.fillRect(50, 0, 300, 40);
		g.fillRect(0, 535, 1000, 30);
		g.fillRect(775, 175, 50, 360);
		g.fillRect(575, 175, 200, 30);
		
		
		g.setColor(Color.BLUE);
		//starting circles
		g.fillOval(50, 130, 30, 30);
		g.fillOval(320, 170, 30, 30);
		g.fillOval(50, 210, 30, 30);
		g.fillOval(320, 250, 30, 30);
		g.fillOval(50, 290, 30, 30);
		g.fillOval(320, 330, 30, 30);
		
		//first corridor circles
		g.fillOval(140, 505, 30, 30);
		g.fillOval(140, 390, 30, 30);
		g.fillOval(175, 475, 30, 30);
		g.fillOval(175, 390, 30, 30);
		
		//first corridor up down circles
		g.fillOval(240, 390, 30, 30);
		g.fillOval(290, 505, 30, 30);
		g.fillOval(340, 390, 30, 30);
		g.fillOval(390, 505, 30, 30);
		g.fillOval(440, 390, 30, 30);
		g.fillOval(490, 505, 30, 30);
		g.fillOval(540, 390, 30, 30);
		
		//rectangle moving circles
		g.fillOval(415, 205, 30, 30);
		g.fillOval(455, 205, 30, 30);
		g.fillOval(495, 205, 30, 30);
		g.fillOval(535, 205, 30, 30);
		g.fillOval(575, 205, 30, 30);
		g.fillOval(615, 205, 30, 30);
		g.fillOval(655, 205, 30, 30);
		g.fillOval(695, 205, 30, 30);
		g.fillOval(735, 205, 30, 30);
		//bottom of rectangle moving circles
		g.fillOval(415, 340, 30, 30);
		g.fillOval(455, 340, 30, 30);
		g.fillOval(495, 340, 30, 30);
		g.fillOval(535, 340, 30, 30);
		g.fillOval(575, 340, 30, 30);
		g.fillOval(615, 340, 30, 30);
		g.fillOval(655, 340, 30, 30);
		g.fillOval(695, 340, 30, 30);
		g.fillOval(735, 340, 30, 30);
		//left and right side rectangle moving circles
		g.fillOval(415, 250, 30, 30);
		g.fillOval(415, 295, 30, 30);
		g.fillOval(735, 250, 30, 30);
		
		//rotating circle thing idk
		g.fillOval(545, 145, 30, 30);
		g.fillOval(510, 110, 30, 30);
		g.fillOval(475, 75, 30, 30);
		g.fillOval(510, 40, 30, 30);
		g.fillOval(545, 5, 30, 30);
		g.fillOval(405, 145, 30, 30);
		g.fillOval(440, 110, 30, 30);
		g.fillOval(440, 40, 30, 30);
		g.fillOval(405, 5, 30, 30);
		
		//ez corridor 
		g.fillOval(600, 5, 30, 30);
		g.fillOval(650, 145, 30, 30);
		g.fillOval(700, 5, 30, 30);
		g.fillOval(750, 145, 30, 30);
		g.fillOval(800, 5, 30, 30);
		
		//last corridor (VERY HARD!!!!!)
		
		//big column thingy lol
		g.fillOval(900, 5, 20, 20);
		g.fillOval(900, 30, 20, 20);
		g.fillOval(900, 55, 20, 20);
		g.fillOval(900, 80, 20, 20);
		g.fillOval(900, 105, 20, 20);
		g.fillOval(900, 130, 20, 20);
		g.fillOval(900, 155, 20, 20);
		
		//actual last corridor
		//first layer
		g.fillOval(825, 230, 25, 25);
		g.fillOval(850, 230, 25, 25);
		g.fillOval(875, 230, 25, 25);
		
		//second layer
		g.fillOval(960, 300, 25, 25);
		g.fillOval(935, 300, 25, 25);
		g.fillOval(910, 300, 25, 25);
		
		//last layer
		g.fillOval(825, 370, 25, 25);
		g.fillOval(850, 370, 25, 25);
		g.fillOval(875, 370, 25, 25);

		
		
		repaint();
		update();
	}
	public void update() {
		if (up) {
			squareY -= 1;
		}
		if (down) {
			squareY += 1;
		}
		if (right) {
			squareX += 1;
		}
		if (left) {
			squareX -= 1;
		}
		
	}
	public static void main(String[] arg) {
			Frame f = new Frame();
	}
	public Frame() {
			JFrame f = new JFrame("World's Hardest Game Knockoff");
			f.setSize(new Dimension(1000, 600));
			f.setBackground(Color.green);
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
		System.out.println(key.getKeyCode());
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
