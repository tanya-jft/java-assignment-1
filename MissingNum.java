import java.util.Random;

public class MissingNum {
    public static void main(String [] args) {
        int[] arr2 = new int[10];
        int randomNum = (int) (Math.random()*10) + 1;
        System.out.println("Generated random num: " + randomNum);
        // try Random class
        Random random = new Random();
        int missingNum  = 0;

        for(int i = 0; i < arr2.length; i++) {
            int x = random.nextInt(10) + 1;
            arr2[i] = x;
            if (randomNum == arr2[i]) {
                missingNum = arr2[i];
                arr2[i] = 0;
            }
        }

        for(int x : arr2) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Missing value: " + missingNum);
    }
}
