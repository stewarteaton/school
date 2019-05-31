package todayNow;

public class RectangleDemo {
	
	public static void main(String[] args) {
		Rectangle myRec = new Rectangle(6.7,8.9);
		System.out.printf("The length and width of the rectangle is %.1f and %.1f\n", myRec.getLength(), myRec.getWidth());
		System.out.printf("The area is %.2f\n", myRec.getArea());
	}
}
