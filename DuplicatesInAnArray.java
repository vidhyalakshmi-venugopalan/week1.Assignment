package week1.day2;

public class DuplicatesInAnArray {
	public void duplicate(int arr[]) {
		System.out.print("The duplicate numbers are ");
		for (int i = 0; i< arr.length; i++) {
			for (int j= i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr [] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		DuplicatesInAnArray dup = new DuplicatesInAnArray();
		dup.duplicate(arr);

	}

}
