package ex;

public class Overload {
	void test() {
		System.out.println("�Ű������� ����.");
	}
	void test(int width) {
		int mul = width * width;
		System.out.println("���簢���� ���̴� : "+mul);
	}
	void test(int width,int height) {
		int mul = width * height;
		System.out.println("���簢���� ���̴� : "+mul);
	}
	void test(int width,int height,int depth) {
		int mul = width * height * depth;
		System.out.println("������ü�� ������ : "+mul);
	}
	
}
