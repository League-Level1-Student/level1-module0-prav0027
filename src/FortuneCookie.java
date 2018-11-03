import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();

	}

	JFrame frame = new JFrame();
	JButton button = new JButton();
	JPanel panel = new JPanel();

	public void showButton() {
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(panel);
		button.setText("Click");
		panel.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {
			JOptionPane.showMessageDialog(null, "Woohoo.");
			int rand = new Random().nextInt(5);
			if (rand == 0) {
				JOptionPane.showMessageDialog(null, "You will have a great day tomorrow.");
			}
			if (rand == 1) {
				JOptionPane.showMessageDialog(null, "You will have good luck soon.");
			}
			if (rand == 2) {
				JOptionPane.showMessageDialog(null, "You might have some back luck in the future.");
			}
			if (rand == 3) {
				JOptionPane.showMessageDialog(null, "You will come across a small fortune.");
			}
			if (rand == 4) {
				JOptionPane.showMessageDialog(null, "You will find your true love.");
			}
		}
	}
}
