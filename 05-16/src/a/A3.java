package a;

class A1 {
	  int d1;
	  int s;
	  A1(int s1) {
	   System.out.println("Ŭ���� A1�� ������ ����");
	   s = s1; 
	   d1 = s * s ;
	}}
	class A2 extends A1 {
	  int d2;
	  int t;
	  A2(int s1, int t1) {
	    super(s1);                   // ���� Ŭ������ �����ڸ� ��������� ȣ��
	    System.out.println("Ŭ���� A2�� ������ ����");
	    t = t1;
	    d2 = t * t ;
	}}
	class A3 {
	  public static void main(String args[]) {
	    A2 super2 = new A2(10,20);
	    System.out.println("10�� ������ : " + super2.d1);
	    System.out.println("20�� ������ : " + super2.d2);
	}}
