/**
 * Class Menu
 * @author Asa James P. Northam
 * created: 9/28/2019
 */
public class MenuTest {

	public static void main(String[] args) {
		Entree entreeTestA = null;
		Entree entreeTestB = null;
		Side sideTestB = null;
		Salad saladTestA = null;
		Salad saladTestB = null;
		Dessert dessertTestB = null;
		
		Menu mN = new Menu("Null Menu");
		Menu mA = new Menu("Menu A", entreeTestA, saladTestA);
		Menu mB = new Menu("Menu B", entreeTestB, sideTestB, saladTestB, dessertTestB);
		
		System.out.println(mN.entreeN);
		System.out.println(mN.sideN);
		System.out.println(mN.saladN);
		System.out.println(mN.dessertN);
		System.out.println(mA.entreeA);
		System.out.println(mA.sideA);
		System.out.println(mA.saladA);
		System.out.println(mA.dessertA);
		System.out.println(mB.entreeB);
		System.out.println(mB.sideB);
		System.out.println(mB.saladB);
		System.out.println(mB.dessertB);
		
		/*int totalCaloriesA = totalCalories(mA.entreeA, mA.sideA, mA.saladA, mA.dessertA);
		int totalCaloriesB = totalCalories(mB.entreeB, mB.sideB, mB.saladB, mB.dessertB);
		System.out.println(totalCaloriesA);
		System.out.println(totalCaloriesB);
		
		String descriptionA = description(mA.entreeA, mA.sideA, mA.saladA, mA.dessertA);
		String descriptionB = description(mB.entreeB, mB.sideB, mB.saladB, mB.dessertB);
		System.out.println(descriptionA);
		System.out.println(descriptionB);*/
	}

}
