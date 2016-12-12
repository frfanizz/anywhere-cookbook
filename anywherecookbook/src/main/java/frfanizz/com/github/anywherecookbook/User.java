package frfanizz.com.github.anywherecookbook;
/*
 * User object:
 * Contains a list of Recipe objects
 * Contains user's unique ID (email)
 */

import java.util.ArrayList;

public class User {

	private String emailLocalPart;
	private String emailDomain;
	private ArrayList<Recipe> recipeCollection;
	
	User(String emailLocalPart, String emailDomain) {
		this.emailLocalPart = emailLocalPart;
		this.emailDomain = emailDomain;
	}
	
	public String getEmailLocalPart() {
		return emailLocalPart;
	}
	public void setEmailLocalPart(String emailLocalPart) {
		this.emailLocalPart = emailLocalPart;
	}
	public String getEmailDomain() {
		return emailDomain;
	}
	public void setEmailDomain(String emailDomain) {
		this.emailDomain = emailDomain;
	}
	public ArrayList<Recipe> getRecipeCollection() {
		return recipeCollection;
	}
	public void setRecipeCollection(ArrayList<Recipe> recipeCollection) {
		this.recipeCollection = recipeCollection;
	}
	
	public String toString() {
		return emailLocalPart + "@" + emailDomain;
	}
	
	public boolean equals(User user) {
		if (!user.getEmailLocalPart().equalsIgnoreCase(emailLocalPart)) {
			return false;
		}
		if (!user.getEmailDomain().equalsIgnoreCase(emailDomain)) {
			return false;
		}
		return true;
	}
}
