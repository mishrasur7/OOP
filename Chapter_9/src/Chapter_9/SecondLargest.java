package Chapter_9;

public class SecondLargest {
//The goal of this program is to find the first and second maximum value from an array
	public static void main(String[] args) {
		// lets define an integer array nums with 7 values
		int[] nums = { 2, 6, 8, 32, 56, 12, 84 };
		int max = nums[0];
		int secondMax = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				secondMax = max;
				max = nums[i];
			} else if (nums[i] > secondMax) {
				secondMax = nums[i];
			}

		}
		
		System.out.println("Max is " + max);
		System.out.println("Second max is " + secondMax);

	}

}
