/**
 * Class Side
 * @author Asa James P. Northam
 * created: 9/28/2019
 */
public class Side {
	private String name;
	private String description;
	private int calories;
	
	//Main method which changes the side based on the shorthand "A" or "B" in the Menu class
	public Side(String sideName, String sideDesc, int sideCals) {
		name = sideName;
		description = sideDesc;
		calories = sideCals;
		
		if(sideName == "A") {
			//To be filled in as more menu items are needed
		}
		if(sideName == "B") {
			sideName = "French Fries";
			sideDesc = "A basket of thick-cut fries cooked in peanut oil.";
			sideCals = 150;
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