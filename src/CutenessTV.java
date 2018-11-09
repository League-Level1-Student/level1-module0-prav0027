import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
public static void main(String[] args) {
	CutenessTV ct = new CutenessTV();
	ct.showButton();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton buttonDucks = new JButton();
JButton buttonFrog = new JButton();
JButton buttonUnicorn = new JButton();
String duck = "https://www.youtube.com/watch?v=MtN1YnoL46Q";
String frog = "https://www.youtube.com/watch?v=cBkWhkAZ9ds";
String unicorn = "https://www.youtube.com/watch?v=a-xWhG4UU_Y";

private void showButton() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	buttonDucks.setText("ducks");
	buttonFrog.setText("frog");
	buttonUnicorn.setText("fluffy unicorn");
	panel.add(buttonDucks);
	panel.add(buttonFrog);
	panel.add(buttonUnicorn);
	frame.pack();
	buttonFrog.addActionListener(this);
	buttonDucks.addActionListener(this);
	buttonUnicorn.addActionListener(this);
	
}

private void playVideo(String videoID) {
try {
	URI uri = new URI(videoID);
	java.awt.Desktop.getDesktop().browse(uri);
} catch(Exception e) {
	e.printStackTrace();
}
}
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==buttonDucks) {
	playVideo(duck)	;
	}
	else if(buttonPressed==buttonFrog) {
		playVideo(frog);
	}
	else if(buttonPressed==buttonUnicorn) {
		playVideo(unicorn);
	}
}
}
