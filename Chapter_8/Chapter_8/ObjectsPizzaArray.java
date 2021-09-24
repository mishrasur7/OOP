package Chapter_8;

public class ObjectsPizzaArray {

	public static void main(String[] args) {
		Pizza[] pizzaArray = {(new Pizza("Diavolo", 8.75)),
				(new Pizza("Frutti al Mare", 9.00)), 
				(new Pizza("Alla Pollo", 7.50))};
		for(int i = 0; i < pizzaArray.length; i++) {
			System.out.println(pizzaArray[i]);
		}

	}

}
