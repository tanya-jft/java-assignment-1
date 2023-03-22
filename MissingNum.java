import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class MissingNum {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random()*10) + 1; // random num
        int [] arr = new int[10]; // arr declaration
        System.out.println("Enter the value within 1-10 range");
        int i = 0;
        int size = 0;
        int sum = 0;
        // validate the input
        while(true) {
            if(size != 10 && size < 10) {
                System.out.print("arr[" + size + "]: ");
                try{
                    int userInput = scanner.nextInt();
                    if(userInput >= 1 && userInput <= 10) {
                        arr[size] = userInput;
                        size += 1;
                        sum += userInput;
                        continue;
                    }
                    System.out.println("Value must be within range");
                } catch(InputMismatchException e) {
                    System.out.println("Input type must be an Integer"); // type error
                    scanner.nextLine(); // clear buffer
                }
            }
            else break;
        }
        // set 0 in place of element which matches to the random number
        boolean randomnumMatchesArr = false;
        int newSum = 0;
        for(int j = 0; j < arr.length; j++) {
            if(randomNum == arr[i]) {
               randomnumMatchesArr = true;
                arr[i] = 0;
            }
            newSum += arr[i];
        }
        if(randomnumMatchesArr) {
            System.out.println("Missing Number is " + (sum-newSum) );
        }
        else System.out.println("Input elements of array does not match to the generated random number");
    }
}
