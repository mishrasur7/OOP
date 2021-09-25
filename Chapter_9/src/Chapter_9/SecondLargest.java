package Chapter_9;

public class SecondLargest {
//The goal of this program is to find the first and second maximum value from an array
	public static void main(String[] args) {
		// lets define an integer array nums with 7 values
		int[] nums = { 2, 6, 8, 32, 56, 12, 84, 99, 100 };
		int max = nums[0];
		int secondMax = nums[0];
		int thirdMax = nums[0]; 
		int fourthMax = nums[0]; 

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				fourthMax = thirdMax; 
				thirdMax = secondMax; 
				secondMax = max;
				max = nums[i];
			} else if (nums[i] > secondMax) {
				fourthMax = thirdMax; 
				thirdMax = secondMax; 
				secondMax = nums[i];
			} else if(nums[i] > thirdMax) {
				fourthMax = thirdMax; 
				thirdMax = nums[i]; 
			} else if(nums[i] > fourthMax) {
				fourthMax = nums[i]; 
			}

		}
		
		System.out.println("Max is " + max);
		System.out.println("Second max is " + secondMax);
		System.out.println("Third max is " + thirdMax);
		System.out.println("The fourth max is " + fourthMax);

	}

}
