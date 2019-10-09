/**
 * Class Menu
 * @author Asa James P. Northam
 * created: 9/28/2019
 */
public class Menu {
	Entree entreeN;
	Entree entreeA;
	Entree entreeB;
	Side sideN;
	Side sideA;
	Side sideB;
	Salad saladN;
	Salad saladA;
	Salad saladB;
	Dessert dessertN;
	Dessert dessertA;
	Dessert dessertB;
	
	public Menu(String name) {
		//name = "Null Menu";
		entreeN = null;
		sideN = null;
		saladN = null;
		dessertN = null;
		
	}
	
	public Menu(String name, Entree entreeA, Salad saladA) {
		//name = "Menu A";
		entreeA = new Entree("A", "A", 0);
		saladA = new Salad("A", "A", 0);
		
	}
	
	public Menu(String name, Entree entreeB, Side sideB, Salad saladB, Dessert dessertB) {
		//name = "Menu B";
		entreeB = new Entree("B", "B", 0);
		sideB = new Side("B", "B", 0);
		saladB = new Salad("B", "B", 0);
		dessertB = new Dessert("B", "B", 0);
		
	}
	
	public int totalCalories(int entCals, int sideCals, int salCals, int desCals) {
		int totalCals = entCals + sideCals + salCals + desCals;
		
		return totalCals;
	}

	public String description(String entDesc, String sideDesc, String salDesc, String desDesc) {
		String entreeLine;
		String sideLine;
		String saladLine;
		String dessertLine;
		
		if(entDesc == null) {
			entreeLine = "Entree: N/A";
		}
		else {
			entreeLine = "Entree: " + entDesc;
		}
		if(sideDesc == null) {
			sideLine = "Side: N/A";
		}
		else {
			sideLine = "Side: " + sideDesc;
		}
		if(salDesc == null) {
			saladLine = "Salad: N/A";
		}
		else {
			saladLine = "Salad: " + salDesc;
		}
		if(desDesc == null) {
			dessertLine = "Dessert: N/A";
		}
		else {
			dessertLine = "Dessert: " + desDesc;
		}
		
		String finalDesc = entreeLine + "/n" + sideLine + "/n" + saladLine + "/n" + dessertLine + "/n";
		
		return finalDesc;
	}
}
