public class Swap {
    public static void main(String [] args) {
        // swap two numbers
        int x = 10;
        int y = 20;
        System.out.println("X: "+ x + " y: " + y);
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("X: "+ x + " y: " + y);
    }
}
