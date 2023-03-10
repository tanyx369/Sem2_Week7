import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyCar extends JPanel implements ActionListener
{
	int xs = 125;
	int xb = 100;
	int xc1 = 110 ;
	int xc2 = 170 ;
	
	int xspeed = 10;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g); // Special ! 
		Graphics2D g2 = (Graphics2D) g;
		
		final int width_small = 60;
		final int height_small = 30;
		
		final int width_big = 100;
		final int height_big = 50;
		
		final int widthc = 30;
		final int heightc = 30;
		
		// Upper part 
		g2.drawRect(xs, 125, width_small, height_small);
		
		// Medium part
		g2.drawRect(xb,150, width_big, height_big);
		
		// Wheel part
		g2.drawOval(xc1,200,  widthc, heightc); 
		g2.drawOval(xc2,200,  widthc, heightc); 
		
	}
	
	public void shift(int x) {
		xs = xs + x;
		xb = xb + x ;
		xc1 = xc1 + x;
		xc2 = xc2 + x;
		
	}
	
	int f_width;
	
	public int getFrameWidth(int w) {
		f_width = w;
		return f_width;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(xb >= f_width - 100 || xb <0 ) {
			xspeed = xspeed * -1;
		}
		shift(xspeed);
		repaint();
	}
	
	
	
    
}
