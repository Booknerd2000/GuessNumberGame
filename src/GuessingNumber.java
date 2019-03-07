import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[]args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int randomNumber;
        randomNumber = (int)(Math.random()*100);
        System.out.println(randomNumber);

    }
}
