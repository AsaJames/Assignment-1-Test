/**
 * Class Salad
 * @author Asa James P. Northam
 * created: 9/28/2019
 */
public class Salad {
	private String name;
	private String description;
	private int calories;
	
	//Main method which changes the salad based on the shorthand "A" or "B" in the Menu class
	public Salad(String salName, String salDesc, int salCals) {
		name = salName;
		description = salDesc;
		calories = salCals;
		
		if(salName == "A") {
			salName = "Caesar Salad";
			salDesc = "A salad with romaine lettuce, grilled chicken, and our signature Caesar dressing.";
			salCals = 200;
		}
		if(salName == "B") {
			salName = "Garden Salad";
			salDesc = "A signature salad made with local vegetables.";
			salCals = 150;
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