package frfanizz.com.github.anywherecookbook;

public class Ingredient {
	
	String name;
	
	Ingredient(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return getName();
	}
	
	public boolean equals(Ingredient ingredient) {
		if (!name.equalsIgnoreCase(ingredient.getName())) {
			return false;
		}
		return true;
	}
}

