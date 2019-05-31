package todayNow;

public class PassAndReturnObject {

	public static void main(String[] args) {
		//ToDo auto-generated method stub
		//Rectangle myRec = new Rectangle(7.8,9.1);
		//displayRectangle(myRec);
		Rectangle myRec = returnObject();
		displayRectangle(myRec);
	}
	
	public static void displayRectangle(Rectangle r) {
		System.out.printf("THe length and width is %.1f and %.1f\n", r.getLength(), r.getWidth());
	}
	
	public static Rectangle returnObject() {
		return new Rectangle(5.6,7.8);
	}
}
