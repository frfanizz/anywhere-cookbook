package frfanizz.com.github.anywherecookbook;

import java.util.Scanner;

public class ProofOfConcept {
	

	public static String getUserString(Scanner input, String message) {
		boolean validString = false;
		String userString = "";
		do {
			System.out.println(message);
			try {
				userString = input.nextLine();
				if (userString != null && userString.length() != 0) {
					validString = true;
				} else {
					System.out.println("I'm sorry, that is not a valid input, try again.");
				}
			} catch (Exception e) {
				System.out.println("I'm sorry, that is not a valid input, try again.");
			}
		} while (!validString);
		return userString;
	}
	
	public static boolean getUserBoolean(Scanner input, String message) {
		boolean validBoolean = false;
		boolean userBoolean = false;
		do {
			System.out.println(message);
			try {
				String userString = input.nextLine();
				if (userString.charAt(0) == 'Y' || userString.charAt(0) == 'y') {
					userBoolean = true;
					validBoolean = true;
				} else if (userString.charAt(0) == 'N' || userString.charAt(0) == 'n') {
					userBoolean = false;
					validBoolean = true;
				} else {
					System.out.println("I'm sorry, that is not a valid input, try again.");
				}
			} catch (Exception e) {
				System.out.println("I'm sorry, that is not a valid input, try again.");
			}
		} while (!validBoolean);
		return userBoolean;
	}
	
	public static int getUserInt(Scanner input, int[] choices) {
		boolean validInt = false;
		int userInt = 0;
		do {
			try {
				String userString = input.nextLine();
				userInt = Integer.parseInt(userString);
				for (int i = 0; i < choices.length; i ++) {
					if (choices[i] == userInt) {
						userInt = choices[i];
						validInt = true;
					}
				}
				if (!validInt) {
					System.out.println("I'm sorry, that is not a valid input, try again.");
				}
			} catch (Exception e) {
				System.out.println("I'm sorry, that is not a valid input, try again.");
			}
		} while (!validInt);
		return userInt;
	}

	public static void main(String[] args) {
		
		//Create a database
		Cookbook cookbook = new Cookbook();
		
		Scanner input = new Scanner(System.in);
		
		//Create a user
		boolean validUserEmail = false;
		String[] emailParts = {"",""};
		do {
			try {
				String emailAddress = getUserString(input, "What is your email address?");
				emailParts = emailAddress.split("@");
				validUserEmail = true;
			} catch (Exception e) {
				System.out.println("I'm sorry, that is not a valid email address.");
			}
		} while (!validUserEmail);
		User currUser = new User(emailParts[0], emailParts[1]);
		
		//Menu for other functions
		boolean menuDone = false;
		do {
			
			System.out.println("Enter a choice: ");
			System.out.println("(1) Add a recipe: ");
			System.out.println("(2) Add Ingredients: ");
			System.out.println("(3) View all recipes: ");
			System.out.println("(0) Exit menu and save: ");
			int userChoice = getUserInt(input, new int[] {1,2,3,0});
			switch (userChoice) {
			case 1:
				addRecipe(input, currUser);
				break;
			case 2:
				addIngredient(input, cookbook);
				break;
			case 3:
				viewRecipes(input, cookbook);
				break;
			case 0:
				menuDone = true;
				saveInfo(input, cookbook);
				break;
			default:
				System.out.println("Invalid choice, try again");
			}
			
		} while (!menuDone);
		
		input.close();

	}
	
	public static void addRecipe(Scanner input, User user) {
		
	}
	
	public static void addIngredient(Scanner input, Cookbook cookbook) {
		String userIngredientName = getUserString(input, "Enter the name of an ingredient to add");
		Ingredient userIngredient = new Ingredient(userIngredientName);
		if (cookbook.addIngredient(userIngredient)) {
			System.out.println(userIngredientName + " has been added to the ingredients database.");
		} else {
			System.out.println(userIngredientName 
					+ " was already found in the database (or there was an error)");
		}
	}
	
	public static void viewRecipes(Scanner input, Cookbook cookbook) {
	
	}
	
	public static void saveInfo(Scanner input, Cookbook cookbook) {
		
	}
	
	
}
