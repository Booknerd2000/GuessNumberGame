import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[]args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int randomNumber,userNumber;

        randomNumber = (int)(Math.random()*100);
        System.out.println(randomNumber);

        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Guess my number.");
        userNumber= keyboard.nextInt();



        if (userNumber>randomNumber){
            System.out.println("That's too high");
        }
        else if (userNumber<randomNumber){
            System.out.println("That's too low");
        }
        System.out.println("You guessed it!");
        System.out.println("My number is "+randomNumber);
    }
}
