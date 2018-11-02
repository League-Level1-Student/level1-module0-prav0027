import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		
	}
	
public void showButton() {
	System.out.println("Button clicked");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
}
}
