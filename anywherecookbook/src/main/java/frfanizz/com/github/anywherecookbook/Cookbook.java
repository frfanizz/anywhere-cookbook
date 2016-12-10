package frfanizz.com.github.anywherecookbook;

import java.util.ArrayList;

public class Cookbook {
	
	ArrayList<User> users;
	ArrayList<Ingredient> ingredients;
	
	Cookbook() {
		users = new ArrayList<User>();
		ingredients = new ArrayList<Ingredient>();
	}
	Cookbook(ArrayList<User> users, ArrayList<Ingredient> ingredients) {
		this.users = users;
		this.ingredients = ingredients;
	}
	
	public boolean addUser(User userToAdd) {
		for (User user : users) {
			if (user.equals(userToAdd)) {
				return false;
			}
		}
		try {
			users.add(userToAdd);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean addIngredient(Ingredient ingredientToAdd) {
		for (Ingredient ingredient : ingredients) {
			if (ingredient.equals(ingredientToAdd)) {
				return false;
			}
		}
		try {
			ingredients.add(ingredientToAdd);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	public String toStringUsers() {
		String string = "";
		for (User user : users) {
			string += user.toString() + "\n";
		}
		return string;
	}
	
	public String toStringIngredients() {
		String string = "";
		for (Ingredient ingredient : ingredients) {
			string += ingredient.toString() + "\n";
		}
		return string;
	}
	
}
