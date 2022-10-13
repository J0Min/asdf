package ex1;

public class Array2 {

	public static void main(String[] args) {
	int A[][] = new int[4][5];
	int a=0,sum=0;
	for(int i=0;i<4;i++)
		{for(int s=0;s<5;s++)
			{
			A[i][s]= a;
			a++;}
		}
	for(int i=0;i<4;i++)
{
		for(int s=0;s<5;s++)
			sum = sum + A[i][s];
}
	System.out.println("sum = " + sum);
	}
	}
