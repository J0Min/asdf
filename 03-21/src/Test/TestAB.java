package Test;

class TestAB {
	public static void main(String args[]) {
		int temp;
		A objecta = new A();
		B objectb = new B();
		temp = objecta.add(1,2);
		System.out.println("A�� add ������:"+temp);
		temp = objectb.add(1,2);
		System.out.println("B�� add ������:"+temp);
		temp = objectb.multi(2,2);
		System.out.println("B�� add ������:"+temp);	
		temp = objectb.multi(20,20);
		System.out.println("A�� add ������:"+temp);
		
	}

}
