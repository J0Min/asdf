package repeat;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int n = 0;
		int a = 0;
		double sum = 0;
		Scanner b = new Scanner(System.in);
		while((a = b.nextInt()) != 0) {
		sum = sum + a;
		n++;
		}
		System.out.println("�Էµ� ���� ������ "+n+"���̸� ����� "+sum/n+"�Դϴ�.");
	}

}
