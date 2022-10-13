package point;

	class Point {
		int xPosition;
		int yPosition;
		
		Point(int x, int y) {
			xPosition = x;
			yPosition = y;
		}
		void move(int x, int y) {
			xPosition = x;
			yPosition = y;
		}
}

public class PointMove {
	public static void main(String[] args) {
		Point point1 = new Point(5,1);
		System.out.println("x = "+ point1.xPosition + " y = "+ point1.yPosition);
		point1.move(10,10);
		System.out.print("x = "+ point1.xPosition + " y = "+ point1.yPosition);
	}

}