import javax.swing.*;
import java.awt.*;


public class MyCarViewer extends JFrame
{
	
	MyCar car;
	MyCarViewer(){
		
		car = new MyCar();
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		car.getFrameWidth(500);
		add(car);
		
		
		Timer time = new Timer(10, car);
		time.start();
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MyCarViewer();
	}
    
}
