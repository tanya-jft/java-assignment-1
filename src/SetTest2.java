import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");

        for(String s: hashSet) {
            System.out.println(s);
        }

        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet);
        treeSet.add("Apple");
        System.out.println("=== tree set ====");
        for(String s: treeSet) {
            System.out.println(s);
        }
    }
}
