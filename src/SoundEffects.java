import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
public static void main(String[] args) {
	SoundEffects se = new SoundEffects();
	se.showButton();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton buttonDrums = new JButton();
JButton buttonTrumpet = new JButton();
String drums = "drums.wav";
String trumpet = "trumpet.wav";
AudioClip sound;

private void showButton() {
	System.out.println("Button clicked");
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	buttonDrums.setText("drums");
	panel.add(buttonDrums);
	buttonTrumpet.setText("trumpet");
	panel.add(buttonTrumpet);
	frame.pack();
	buttonDrums.addActionListener(this);
	buttonTrumpet.addActionListener(this);
}

private void playSound(String fileName) {
	sound = 
			JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(sound!=null) {
	sound.stop();
	}
	if(buttonPressed==buttonDrums) {
	playSound(drums)	;
	}
	else if(buttonPressed==buttonTrumpet) {
		playSound(trumpet);
	}
}
}
