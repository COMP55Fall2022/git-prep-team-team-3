import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
//this is a comment
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


		GLabel label = new GLabel("Linh", 200, 400);
		
		Glabel label = new Glabel("Santi", 200,400);

		GLabel label = new GLabel("Hackslash- Leah", 200, 400);
 
		
		add(label);
	}
	//comment 3
	//comment 4
	//comment 5
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}