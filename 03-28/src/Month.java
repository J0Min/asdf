import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		String season=null;
		Scanner a = new Scanner(System.in);
		int month = a.nextInt();
		if(month == 12||month == 1||month == 2)
			season = "겨울";
		else if(month == 3||month == 4||month == 5)
			season = "봄";
		else if(month == 6||month == 7||month == 8)
			season = "여름";
		else if(month == 9||month == 10||month == 11)
			season = "겨울";
		else
			season="잘못된 값";
		System.out.println(month+"월은 "+ season +"입니다.");
	}
}