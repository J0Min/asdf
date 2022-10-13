package ex;

public class Com {
	int test1(int arr1[]) {
		int sum = 0;
		for(int i = 0 ; i<arr1.length; i++) {
			sum = sum +arr1[i];
		}
		return sum;
	}
	int test2(int arr2[]) {
		int sum = 0;
		for(int i = 0 ; i<arr2.length; i++) {
			sum = sum +arr2[i];
		}
		int aver = sum/arr2.length;
		return aver;
	}
}
