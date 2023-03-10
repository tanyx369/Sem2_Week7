import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class FaceComponent extends JComponent
{
    
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		/*
		Ellipse2D.Double eye_1 = new Ellipse2D.Double();
		Ellipse2D.Double eye_2 = new Ellipse2D.Double();
		
		Ellipse2D.Double face = new Ellipse2D.Double();
		*/
		
		g2.drawOval(0, 10, 100, 100);
		g2.drawOval(25, 26 , 10 , 10);
		g2.drawOval(75, 26, 10, 10);
		g2.drawLine(25, 80, 75, 80);
		
		
	}
	
	
}
