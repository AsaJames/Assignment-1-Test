/**
 * Class Entree
 * @author Asa James P. Northam
 * created: 9/28/2019
 */
public class Entree {
	private String name;
	private String description;
	private int calories;
	
	//Main method which changes the entree based on the shorthand "A" or "B" in the Menu class
	public Entree(String entName, String entDesc, int entCals) {
		entName = name;
		entDesc = description;
		entCals = calories;
		if(entName == "A") {
			entName = "Spaghetti";
			entDesc = "A classic pasta dish with tomato sauce and parmesan cheese.";
			entCals = 250;
		}
		if(entName == "B") {
			entName = "Hamburger";
			entDesc = "A hand-crafted beef patty on a whole wheat bun with your choice of toppings.";
			entCals = 300;
		}
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
}