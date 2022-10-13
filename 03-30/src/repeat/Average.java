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
		System.out.println("입력된 수의 개수는 "+n+"개이며 평균은 "+sum/n+"입니다.");
	}

}
