package frfanizz.com.github.anywherecookbook;

public class Ingredient {
	
	private String name;
	
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
	
	public boolean searchAssist(String searchString) { //TODO unit test
		if (searchString.length() < 2 || searchString.length() > name.length()) {
			return false;
		}
		for (int i = 0; i <= name.length() - searchString.length(); i++) {
			if (searchString.equalsIgnoreCase(name.substring(i, searchString.length()+i))) {
				return true;
			}
		}
		return false;
	}
}

