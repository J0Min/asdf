package ex;

public class Total {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		Com obj = new Com();
		int total = obj.test1(arr);
		int average = obj.test2(arr);
		System.out.println("ÇÕ°è : "+total);
		System.out.println("Æò±Õ : "+average);
	}

}
