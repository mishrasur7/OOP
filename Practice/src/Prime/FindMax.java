package Prime;

public class FindMax {

	public static void main(String[] args) {
		int[] array1 = {1, 3, 5, 34, 5, 76, 99, 100}; 
		int secMax = 0; 
		
		for(int i = 0; i < array1.length; i++) {
			secMax = secondMax(array1); 
		}
		System.out.println("second max is: " + secMax);
	}
	
	public static int secondMax(int[] a1) {
		int max = a1[0]; 
		int secMax = a1[0]; 
		
		for(int i = 0; i < a1.length; i++) {
			if(a1[i] > max) {
				secMax = max;
				max = a1[i]; 
				
			} else if(a1[i] > secMax) {
				secMax = a1[i]; 
			}
		}
		return secMax; 
	}

}
