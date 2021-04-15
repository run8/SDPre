import java.util.Scanner;

public class Objective5Lab4{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an integer:");
    int num1 = scanner.nextInt();

    if (num1 % 2 == 0) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd");
    }


  }
}
