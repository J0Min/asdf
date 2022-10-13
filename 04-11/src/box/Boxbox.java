package box;

public class Boxbox {

	public static void main(String[] args) {
		Box mybox = new Box();
		System.out.println(mybox.depth +" "+ mybox.height +" " + mybox.width);
		Box mybox1 = new Box(10);
		System.out.println(mybox1.depth +" "+ mybox1.height +" "+ mybox1.width);
		Box mybox2 = new Box(20,10);
		System.out.println(mybox2.depth +" "+ mybox2.height +" "+ mybox2.width);
		Box mybox3 = new Box(30,20,10);
		System.out.println(mybox3.depth +" "+ mybox3.height +" "+ mybox3.width);
	}
}
