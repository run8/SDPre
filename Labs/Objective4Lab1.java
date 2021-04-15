import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    //TODO prompt the user to get input for all of the String variables.
    System.out.println("Enter your first name and press enter.");
    fname = keyboard.nextLine();
    System.out.println("Enter your last name and press enter.");
    lname = keyboard.nextLine();
    System.out.println("Enter your favorite animal and press enter.");
    favoriteAnimal = keyboard.nextLine();
    System.out.println("Enter your favorite food and press enter.");
    favoriteFood = keyboard.nextLine();
    System.out.println("Enter your favorite song and press enter.");
    favoriteSong = keyboard.nextLine();

    //TODO print the output formatted to look like the expected output using String concatenation.
    System.out.println("Hi " + fname + " " + lname);
    System.out.println("Favorite animal: " + favoriteAnimal);
    System.out.println("Favorite food: " + favoriteFood);
    System.out.println("Favorite song: " + favoriteSong);

  }
}
