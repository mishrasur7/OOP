package FirstProgram;

public class CalcProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc = new Calc();

		int[] a1 = { 1, 5, 3, 4 };
		int[] a2 = { 1, 2, 3, 16, 1, 4 };
		int[] a3 = { -3, -4 };

		System.out.println(calc.aboveAvg(a1));
		System.out.println(calc.aboveAvg(a2));

		System.out.println(calc.max(a1, a2));
		System.out.println(calc.max(a1, a3));

	}

}
