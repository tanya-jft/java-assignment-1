import java.util.Scanner;

public class SumOfArr {


    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 20) + 1; // generate the random value to the array
            sum += arr[i]; // sum of the array
        }
        for (int x : arr) {
            System.out.print(x + " "); // print the elements
        }
        System.out.println();
        System.out.println("Sum of arr: " + sum);
    }
}
