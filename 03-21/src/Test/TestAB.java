package Test;

class TestAB {
	public static void main(String args[]) {
		int temp;
		A objecta = new A();
		B objectb = new B();
		temp = objecta.add(1,2);
		System.out.println("A의 add 수행결과:"+temp);
		temp = objectb.add(1,2);
		System.out.println("B의 add 수행결과:"+temp);
		temp = objectb.multi(2,2);
		System.out.println("B의 add 수행결과:"+temp);	
		temp = objectb.multi(20,20);
		System.out.println("A의 add 수행결과:"+temp);
		
	}

}
