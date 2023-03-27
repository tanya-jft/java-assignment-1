import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("isPalindrom[int]: ");
        int ispalindrome = scanner.nextInt();
        String [] strPalindrome = String.valueOf(ispalindrome).split(""); // convert int to string

        int strSize = strPalindrome.length-1;

        boolean checkPalindrome = true;
        for(int i = 0; i <= strSize/2; i++) {
            if(strPalindrome[i].equals(strPalindrome[strSize-i])) {
                continue;
            }
            else {
                checkPalindrome = false;
            }
        }
        System.out.println("checkPalindrome: " + checkPalindrome);
    }
}
