package $class;

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		OuterClass.InnerClass obj1 = obj.new InnerClass(); // 내부클레스 객체 생성
		System.out.println(obj.s);
		System.out.println(obj1.s);
		obj1.show1();
	}
}
