package $class;

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		OuterClass.InnerClass obj1 = obj.new InnerClass(); // ����Ŭ���� ��ü ����
		System.out.println(obj.s);
		System.out.println(obj1.s);
		obj1.show1();
	}
}
