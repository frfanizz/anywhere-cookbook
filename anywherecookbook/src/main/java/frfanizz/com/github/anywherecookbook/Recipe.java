package frfanizz.com.github.anywherecookbook;

import java.util.ArrayList;

public class Recipe {
	
	private String name;
//	private Category category;
	private User author;
	private String note;
//	private Image image; //TODO figure out how to store images. url?
	private ArrayList<RecipeStep> directions;
	
	Recipe(String name, User author, String note, ArrayList<RecipeStep> directions) {
		this.name = name;
		this.author = author;
		this.note = note;
		this.directions = directions;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public ArrayList<RecipeStep> getDirections() {
		return directions;
	}
	public void setDirections(ArrayList<RecipeStep> directions) {
		this.directions = directions;
	}

	public String toString() {
		return getName() + ", by " + getAuthor() + ". (" + getNote() + ")"; 
	}
	
	public boolean equals(Recipe recipe) {
		for (int i = 0; i < recipe.getDirections().size(); i++) {
			if (!directions.get(i).equals(recipe.getDirections().get(i))) {
				return false;
			}
		}
		return true;
	}
}
