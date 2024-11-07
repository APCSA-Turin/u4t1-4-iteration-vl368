package U4T1_Lab2;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number that is either positive, even, and a multiple of 7 OR prime:");
    int userNumber = scanner.nextInt();
    boolean even = userNumber % 2 == 0;
    boolean divisible7 = userNumber % 7 == 0;
    boolean positive = userNumber > 0;
    boolean prime = isPrime(userNumber);
    boolean redo = false;
    if (prime) {
        System.out.println("Well done, " + userNumber + " is prime!");
    }
    else if (!(positive && divisible7 && even)){
        redo = true;
    }
    
    while (redo) {
        if (prime) {
            redo = false;
            System.out.println("Well done, " + userNumber + " is prime!");
        }
        if (!(positive && divisible7 && even)){
            redo = true;
        }
        if (!positive) {
            System.out.println("> Not positive");
        }
        if (!even) {
            System.out.println("> Not even");
        }
        if (!divisible7) {
            System.out.println("> Not a multiple of 7");
        }
        System.out.print("Try again: ");
        userNumber = scanner.nextInt();
    }
    if (positive && divisible7 && even){
        System.out.println("Well done, " + userNumber + " is a positive, even, multiple of 7!");
    }
    scanner.close();
  }

  /* Returns true if number is prime and false
        if it is not prime; if number is 1, return false */
  private static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }

    int currentDivisor = 2; //start at 2 since no need to check 1

    while (currentDivisor < number) {
      if (number % currentDivisor == 0) {
        return false;  // breaks the loop AND exits the method
      }
      currentDivisor++;
    }
    return true;
  }
}
