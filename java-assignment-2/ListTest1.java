import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add(3, "Four");
        list.add(2, "Five");

        Iterator<String> st = list.iterator();

        while (st.hasNext()) {
            System.out.println("Iterator: " + st.next());
        }
    }
}
