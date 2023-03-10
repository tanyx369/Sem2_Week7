import javax.swing.*;
import java.awt.*;


public class FaceViewer
{
   public static void main(String[] args) {
	   JFrame frame = new JFrame("Face");
	   frame.setResizable(true);
	   frame.setSize(500, 500);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   FaceComponent f1 = new FaceComponent();
	   frame.add(f1);
	   frame.setVisible(true);
   }
}
