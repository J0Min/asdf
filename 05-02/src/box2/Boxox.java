package box2;

public class Boxox {

	public static void main(String[] args) {
		Box mybox = new Box(10,20,30);
		System.out.println("width = "+mybox.getwidth());
		System.out.println("height = "+mybox.getheight());
		System.out.println("depth = "+mybox.getdepth());
		System.out.println("vol = "+mybox.getvolume());
		mybox.setwidth(101);
		mybox.setheight(1);
		mybox.setdepth(12);
		System.out.println("width = "+mybox.getwidth());
		System.out.println("height = "+mybox.getheight());
		System.out.println("depth = "+mybox.getdepth());
		int vol = mybox.getvolume();

	}
}