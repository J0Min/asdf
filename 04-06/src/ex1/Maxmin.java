package ex1;

public class Maxmin {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int i, max;
		for(i=0;i<10;i++) {
			int num = Integer.parseInt(args[i]);
			arr[i] = num;
			System.out.println(arr[i]);
		}
		max=arr[0];
		for(i=0;i<10;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.printf("최댓값은 %d입니다.",max);
	}
}
