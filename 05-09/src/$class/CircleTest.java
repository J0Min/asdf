package $class;
import java.util.Scanner;

public class CircleTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x,y,z;
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();
		Circle obj = new Circle(x,y,z);
		obj.printCenter();
		System.out.println("Area ="+obj.calArea());

	}
}
