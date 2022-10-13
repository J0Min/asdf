package $class;

public class Circle {
	class Point{
		int x,y;
		public Point(int xp,int yp){
			x = xp;
			y = yp;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}}
		int radius;
		Point center;
		final double PI = 3.14;
		public Circle(int x,int y,int r) {
			center = new Point(x,y);
			radius = r;
		}
		public void printCenter() {
			System.out.println("CENTER = ("+center.getX()+","+center.getY()+")");
		}
		public double calArea() {
			return PI * radius * radius;
		}
	}
	


