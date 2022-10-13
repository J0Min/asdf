package a;

class A1 {
	  int d1;
	  int s;
	  A1(int s1) {
	   System.out.println("클래스 A1의 생성자 수행");
	   s = s1; 
	   d1 = s * s ;
	}}
	class A2 extends A1 {
	  int d2;
	  int t;
	  A2(int s1, int t1) {
	    super(s1);                   // 상위 클래스의 생성자를 명시적으로 호출
	    System.out.println("클래스 A2의 생성자 수행");
	    t = t1;
	    d2 = t * t ;
	}}
	class A3 {
	  public static void main(String args[]) {
	    A2 super2 = new A2(10,20);
	    System.out.println("10의 제곱은 : " + super2.d1);
	    System.out.println("20의 제곱은 : " + super2.d2);
	}}
