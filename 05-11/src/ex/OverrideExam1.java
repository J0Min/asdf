package ex;
class A {
	  int i, j;
	  A(int a, int b) {
	    i = a;
	    j = b;  
	  }
	  void show() {
	    System.out.println("����Ŭ������ �޼ҵ� show() ����");
	}}
	class B extends A {
	  int k;
	  B(int a, int b, int c ) {
	    super(a,b);   // ���� Ŭ������ �����ڸ� ȣ��
	    k = c;  
	  }
	  void show() {
	    System.out.println("���� Ŭ������ �޼ҵ� show() ����");
	    System.out.println("===super�� �̿��� ���� Ŭ���� �޼ҵ� ȣ��===");    
	    super.show();
	}}
	public class OverrideExam1 {
	  public static void main(String args[]) {
	    B over1 = new B(10, 20, 30);
	    System.out.println("i, j, k�� �� : " + over1.i + " " + over1.j + " " + over1.k);
	    over1.show();
	}}
