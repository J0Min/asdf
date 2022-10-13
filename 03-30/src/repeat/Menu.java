package repeat;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
	Scanner A = new Scanner(System.in);
	int choice;
	do {
		System.out.println("객체지향 용어 설명");
		System.out.println(" 1. 객체");
		System.out.println(" 2. 클래스");
		System.out.println(" 3. 메시지");
		System.out.println(" 4. 상속");
		System.out.print("원하는 번호를 입력하세요 : ");
		choice = A.nextInt();
		switch(choice)
		{
		case 1 : 
			System.out.println("**** 객체 ****");
			System.out.println("객체는 정보를 관리하기 위한 논리적인 단위이다.");
			break;
		case 2 : 
			System.out.println("**** 클래스 ****");
			System.out.println("클래스는 객체를 생성하는 형판(template)이다.");
			break;
		case 3 : 
			System.out.println("**** 메시지 ****");
			System.out.println("메시지는 객체에게 일을 시킨느 행위이다.");
			break;
		case 4 : 
			System.out.println("**** 상속 ****");
			System.out.println("상속은 상위 클래스로부터 모든 속성과 절차를 이어 받는다.");
			break;
		}	
	}while(choice < 1 || choice > 4);
	}
}
