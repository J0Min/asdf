package repeat;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
	Scanner A = new Scanner(System.in);
	int choice;
	do {
		System.out.println("��ü���� ��� ����");
		System.out.println(" 1. ��ü");
		System.out.println(" 2. Ŭ����");
		System.out.println(" 3. �޽���");
		System.out.println(" 4. ���");
		System.out.print("���ϴ� ��ȣ�� �Է��ϼ��� : ");
		choice = A.nextInt();
		switch(choice)
		{
		case 1 : 
			System.out.println("**** ��ü ****");
			System.out.println("��ü�� ������ �����ϱ� ���� ������ �����̴�.");
			break;
		case 2 : 
			System.out.println("**** Ŭ���� ****");
			System.out.println("Ŭ������ ��ü�� �����ϴ� ����(template)�̴�.");
			break;
		case 3 : 
			System.out.println("**** �޽��� ****");
			System.out.println("�޽����� ��ü���� ���� ��Ų�� �����̴�.");
			break;
		case 4 : 
			System.out.println("**** ��� ****");
			System.out.println("����� ���� Ŭ�����κ��� ��� �Ӽ��� ������ �̾� �޴´�.");
			break;
		}	
	}while(choice < 1 || choice > 4);
	}
}
