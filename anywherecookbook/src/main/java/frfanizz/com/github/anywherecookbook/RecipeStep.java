package frfanizz.com.github.anywherecookbook;

public class RecipeStep {

	String direction;
	
	RecipeStep(String direction) {
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public String toString() {
		return getDirection();
	}
	
	public boolean equals(RecipeStep recipeStep) {
		if (!recipeStep.getDirection().equalsIgnoreCase(direction)) {
			return false;
		}
		return true;
	}
}
