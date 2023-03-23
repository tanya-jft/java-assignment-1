import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class MissingNum {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random()*10) + 1; // random num
        System.out.println("Random Number: " + randomNum);
        int [] arr = new int[10+1]; // arr declaration // add extra space for missing num
        System.out.println("Enter the value within 1-10 range");
        int i = 0;
        int size = 0;
        // validate the input
        while(true) {
            if(size != 10 && size < 10) {
                System.out.print("arr[" + size + "]: ");
                try{
                    int userInput = scanner.nextInt();
                    if(userInput >= 1 && userInput <= 10) {
                        arr[size] = userInput;
                        size += 1;
                        continue;
                    }
                    System.out.println("Value must be within range");
                } catch(InputMismatchException e) {
                    System.out.println("Input type must be an Integer: " + e); // type error
                    scanner.nextLine(); // clear buffer
                }
            }
            else break;
        }

        // set 0 in place of element which matches to the random number
        boolean randomnumMatchesArr = false;
        int numIndex = -1; // get index of missing num
        for(int j = 0; j < arr.length-1; j++) { // loop upto length-1
            if(randomNum == arr[j]) {
               randomnumMatchesArr = true;
               arr[arr.length-1] = arr[j];
               numIndex = j;
                arr[i] = 0;
            }
        }
        if(randomnumMatchesArr) {
            System.out.println("Missing Number is " + (arr[arr.length-1]) + " at index " + numIndex );
        }
        else System.out.println("Input elements of array does not match to the generated random number");
    }
}
