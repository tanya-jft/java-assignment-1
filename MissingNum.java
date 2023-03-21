public class MissingNum {
    public static void main(String [] args) {
        int[] arr2 = new int[10];
        int randomNum = (int) (Math.random()*10) + 1;

        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            if (randomNum == i + 1) {
                arr2[i] = 0;
            }
        }

        for(int x : arr2) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Missing value: " + randomNum);
    }
}
