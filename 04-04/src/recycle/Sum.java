package recycle;

public class Sum 
{
	public static void main(String[] args) 
	{
	int sum = 0;
	for(int i = 1 ; i <11 ; i++) 
	{
		sum = sum +i;
		if(i < 10)
		System.out.print(i + "+");
		else
		System.out.print(i);

	}
		System.out.print(" = " +sum);

	}
}