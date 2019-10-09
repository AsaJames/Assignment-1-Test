/**
 * Class Dessert
 * @author Asa James P. Northam
 * created: 9/28/2019
 */
public class Dessert {
	private String name;
	private String description;
	private int calories;
	
	//Main method which changes the dessert based on the shorthand "A" or "B" in the Menu class
	public Dessert(String desName, String desDesc, int desCals) {
		name = desName;
		description = desDesc;
		calories = desCals;
		
		if(desName == "A") {
			//To be filled in as more menu items are needed
		}
		if(desName == "B") {
			desName = "Banana Split";
			desDesc = "An ice cream dish made with vanilla, chocolate, or strawberry ice cream.";
			desCals = 200;
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