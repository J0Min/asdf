import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		String season=null;
		Scanner a = new Scanner(System.in);
		int month = a.nextInt();
		if(month == 12||month == 1||month == 2)
			season = "�ܿ�";
		else if(month == 3||month == 4||month == 5)
			season = "��";
		else if(month == 6||month == 7||month == 8)
			season = "����";
		else if(month == 9||month == 10||month == 11)
			season = "�ܿ�";
		else
			season="�߸��� ��";
		System.out.println(month+"���� "+ season +"�Դϴ�.");
	}
}