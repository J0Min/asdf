package recycle;
import java.util.Scanner;

public class OneArray {
	
	public static void main(String[] args) {
		
		int sum=0;
		int a[] = new int[4];		
		Scanner b = new Scanner(System.in);//scanner ����
		for(int i=0;i<4;i++)
		{		
		a[i] = b.nextInt(); // b.nextInt()�̰� �ϳ��� 1���� ���� �޴´�.
		sum  = sum + a[i]; 
		}
		System.out.print("sum = "+sum);

	}
}