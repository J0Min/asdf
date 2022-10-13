package ex1;
public class Exam {

	public static void main(String[] args) {
		int student[][] = {
				{1,3,2,4,3,1,4,2,2,1},
				{3,2,4,2,2,1,1,3,4,1},
				{2,4,3,2,1,2,1,3,3,4},
				{2,3,3,1,1,3,2,2,4,4},
				{3,1,1,2,4,1,2,3,1,3}};
		int[] correct = new int[10];
		int i,a,b,sum=0;
		for(i=0;i<10;i++)
		correct[i] = Integer.parseInt(args[i]);
		for(a=0;a<5;a++) {
			for(b=0;b<10;b++) {
				if(student[a][b]==correct[b])
					sum++;
			}
			System.out.println("학생"+(a+1)+"의 점수 :"+sum+"점");
			sum=0;
		}
	}
}
