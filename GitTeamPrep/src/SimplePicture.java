import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
//this is a comment
//linh commented
//comment 2
public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public static String ROBOT_IMAGE = "robot.png";
	//comment 2
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage(ROBOT_IMAGE, 200, 200);
		add(robot);


		GLabel label = new GLabel("SANTI", 200, 100);

		GLabel label = new GLabel("Nuens", 200, 100);
		
		Glabel label = new Glabel("Santi", 200,400);


		GLabel label = new GLabel("Hackslash--- Leah", 200, 400);
 

		GLabel label = new GLabel("HELLO ", 200, 400);
		GLabel label = new GLabel("Bye", 200, 400);
		
		GLabel label = new Glabel("Santis additional change", 100, 400);
		add(label);
	}
	//comment 3
	//comment 4
	//comment 5
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}