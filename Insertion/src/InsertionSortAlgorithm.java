import java.util.Arrays;

public class InsertionSortAlgorithm {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 5, 2, 3 , };

		int i, j, temp;
		for (i = 0; i < arr.length; i++) {
			for (j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
