import java.util.Scanner;

public class ThirdLargest {
    public static void main( String [] args) {
        int first = -1;
        int second = -1;
        int third = -1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the array: ");
        int size = scanner.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

//        arr = new int[] {7, 2, 4 ,10, 8, 1, 12 };

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if( arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println(third);
    }
}
