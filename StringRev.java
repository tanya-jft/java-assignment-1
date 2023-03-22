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
        System.out.println("Enter string: ");
        String str3 = scanner.nextLine();
        char [] charArr = str3.toCharArray();
        int charArrLen = charArr.length - 1;

        for (int i = 0; i <= charArrLen / 2; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[charArrLen - i];
            charArr[charArrLen - i] = temp;
        }
        String revStr3 = charArr.toString();
        System.out.println(revStr3);

    }
}
