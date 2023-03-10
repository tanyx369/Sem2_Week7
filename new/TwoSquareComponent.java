import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import java.awt.*;

import javax.swing.JComponent;

public class TwoSquareComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
	
      Graphics2D g2 = (Graphics2D) g;
      
      Rectangle box = new Rectangle(0, 0, 40, 50);
      Rectangle box2 = new Rectangle(0,30, 40 , 50);
     
      Color color1 = new Color(255, 100 , 0);
      Color color2 = new Color(255, 0 , 0);
      g2.setColor(color1);
      g2.fill(box);
      g2.draw(box);
      g2.setColor(color2);
      g2.fill(box2);
      g2.draw(box2);
   }
}
