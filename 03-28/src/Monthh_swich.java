public class Monthh_swich {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season=null;
		switch(month) {
		case 1 : season = "�ܿ�"; break;
		case 2 : season = "�ܿ�"; break;
		case 3 : season = "��"; break;
		case 4 : season = "��"; break;
		case 5 : season = "��"; break;
		case 6 : season = "����"; break;
		case 7 : season = "����"; break;
		case 8 : season = "����"; break;
		case 9 : season = "����"; break;
		case 10 : season = "����"; break;
		case 11 : season = "����"; break;
		case 12 : season = "�ܿ�"; break;
		default: season = "�߸��� ��";
		}
		System.out.println(month+"���� "+ season +"�Դϴ�.");

	}
}

