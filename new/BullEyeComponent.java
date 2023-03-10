import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class BullEyeComponent extends JComponent 
{
	 Color c;
	 private Ellipse2D.Double box;

	 /*
	   public BullEyeComponent(double x, double y, double width, double height, Color color)
	   {       
	      box = new Ellipse2D.Double(x, y, width, height);   
	      this.c = color;
	   }
	*/
	 
	   public void paintComponent(Graphics g)
	   {  
		   
	      Graphics2D g2 = (Graphics2D) g;
	          
	      Ellipse2D.Double circle ;
	      
	      int coor = 100;
	      int  count = 0;
	      int diameter;
	      for (diameter = 200; diameter > 0; diameter -= 40) {
	    	  count ++;
	    	  circle = new Ellipse2D.Double(coor , coor, diameter , diameter);
	    	  if(count % 2 == 0) {
	    		  g2.setColor(Color.WHITE);
	    		  g2.fill(circle);
	    	  }
	    	  else {
	    		  g2.setColor(Color.BLACK);
	    		  g2.fill(circle);
	    	  }
	    	  
	    	  coor += 20;
	    	  
	      }
	      
	      
	      
	   }
	   
	   
	   // Ellipse.2D 的画法其实是它有bound一个虚拟(看不见的rectangle), 在里面画圆圈 (width and height 是指rectangle的, width越大整个circle越便）
}
