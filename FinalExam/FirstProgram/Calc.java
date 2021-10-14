package FirstProgram;

public class Calc {

	public int aboveAvg(int[] a1) {

		double average = 0;
		int count = 0;

		for (int i = 0; i < a1.length; i++) {

			average += a1[i];
		}

		average = average / a1.length;

		for (int i = 0; i < a1.length; i++) {

			if (a1[i] > average) {
				count++;
			}
		}

		return count;
	}

	public int max(int[] a2, int[] a3) {

		int max = 0;
		int max1 = 0;
		int max2 = 0;

		for (int i = 0; i < a2.length; i++) {
			if (a2[i] > max1) {
				max1 = a2[i];
			}
		}
		for (int i = 0; i < a3.length; i++) {
			if (a3[i] > max1) {
				max1 = a3[i];
			}
		}

		if (max1 > max2) {
			max = max1;
		} else {
			max = max2;
		}

		return max;
	}
}
