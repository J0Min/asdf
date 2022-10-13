package ex;

public class ExamTest {

	public static void main(String[] args) {
		Exam2 A = new Exam2("±èÃ¶¼ö",70,80);
		Exam2 B = new Exam2("±è¿µÈñ",90,100);
		System.out.println(A.name+A.Aver()+" ÃÑÁ¡= "+A.total());
		System.out.println(B.name+B.Aver()+" ÃÑÁ¡= "+B.total());
	}

}
