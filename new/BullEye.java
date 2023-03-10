import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

public class BullEye 
{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		BullEyeComponent eye = new BullEyeComponent();
		frame.setSize(500 , 500);
		frame.setTitle("Bull Eye");
		frame.setResizable(true);
		frame.add(eye);
		frame.setVisible(true);
	
	
		
		
		//从coordinate 根据你的width, height 画下来(不是centre point)
	}
}
