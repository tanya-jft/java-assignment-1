import java.util.Scanner;

public class StringRev {
    public static  void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        //String method 1
        System.out.println("Enter String1: ");
        StringBuilder str1 = new StringBuilder(scanner.nextLine());
        System.out.println("String1 [method1]: " + str1);
        str1 = str1.reverse();
        System.out.println("String1 Reverse [method1]: " + str1);

        // string method 2
        System.out.println("Enter String2: ");
        String str2 = scanner.nextLine().strip();
        String[] strArr2 = str2.split("");
        int len = strArr2.length - 1;
        for (int i = 0; i <= len / 2; i++) {
            // using 3rd var to swap
            String temp = strArr2[i];
            strArr2[i] = strArr2[len - i];
            strArr2[len - i] = temp;
        }
        // task 1 convert string array to actual string
        for(String s: strArr2) {
            System.out.print(s + "");
        }
    }
}
