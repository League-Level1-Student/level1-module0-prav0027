package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
public static void main(String[] args) {
	int height = 100;
	int colorr = 0;
	int colorg = 0;
	int colorb=0;
String househeight = JOptionPane.showInputDialog("What height should the houses be? Small, medium, or large?");
	if(househeight.equalsIgnoreCase("small")) {
		height = 60;
	}
	if(househeight.equalsIgnoreCase("medium")) {
		height = 120;
	}
	if(househeight.equalsIgnoreCase("large")) {
		height = 250;
	}
	String housecolor = JOptionPane.showInputDialog("What color should the houses be drawn in?");
	if(housecolor.equalsIgnoreCase("red")) {
		colorr = 255;
	}
	if(housecolor.equalsIgnoreCase("blue")) {
		colorb = 255;

	}
	if(housecolor.equalsIgnoreCase("green")) {
		colorg=200;
	}
	
	System.out.println(colorr+ " "+colorg+" "+colorb);
	house(height, colorr, colorb, colorg);
	}
	
private static void house(int height, int colorr, int colorg, int colorb) {
	rob.setX(10);
	rob.setY(500);
	rob.setSpeed(10);
	for (int i = 0; i < 10; i++) {
		rob.penDown();
		rob.setPenColor(colorr, colorb, colorg);
		rob.move(height);
		if(height<130) {
		drawpeakedRoofs();
		}
		if(height>130) {
			drawFlatRoof();
		}
		rob.move(height);
		rob.turn(270);
		rob.setPenColor(0, 255, 0);
		rob.move(30);
		rob.turn(270);
	}
}
private static void drawpeakedRoofs() {
	rob.turn(45);
	rob.move(50/((2)^(1/2)));
	rob.turn(90);
	rob.move(50/((2)^(1/2)));
	rob.turn(45);
}
private static void drawFlatRoof() {
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
}
}
