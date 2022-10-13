package ex;
class A {
	  int i, j;
	  A(int a, int b) {
	    i = a;
	    j = b;  
	  }
	  void show() {
	    System.out.println("상위클래스의 메소드 show() 수행");
	}}
	class B extends A {
	  int k;
	  B(int a, int b, int c ) {
	    super(a,b);   // 상위 클래스의 생성자를 호출
	    k = c;  
	  }
	  void show() {
	    System.out.println("하위 클래스의 메소드 show() 수행");
	    System.out.println("===super를 이용한 상위 클래스 메소드 호출===");    
	    super.show();
	}}
	public class OverrideExam1 {
	  public static void main(String args[]) {
	    B over1 = new B(10, 20, 30);
	    System.out.println("i, j, k의 값 : " + over1.i + " " + over1.j + " " + over1.k);
	    over1.show();
	}}
