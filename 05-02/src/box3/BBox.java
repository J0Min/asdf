package box3;

public class BBox {

	public static void main(String[] args) {
		Box obj3;
		Box obj =new Box(2,3,4);
		obj3=obj.volume_compute(obj);
		System.out.println("w = "+obj3.width+"h = "+obj3.height+"d = "+obj3.depth+"v = "+obj3.volume);
	}

}
