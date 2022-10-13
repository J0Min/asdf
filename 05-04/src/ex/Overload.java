package ex;

public class Overload {
	void test() {
		System.out.println("매개변수가 없음.");
	}
	void test(int width) {
		int mul = width * width;
		System.out.println("정사각형의 넓이는 : "+mul);
	}
	void test(int width,int height) {
		int mul = width * height;
		System.out.println("직사각형의 넓이는 : "+mul);
	}
	void test(int width,int height,int depth) {
		int mul = width * height * depth;
		System.out.println("정육면체의 면적은 : "+mul);
	}
	
}
