import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest3 {
    public static void main(String args[]){
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("India", "Delhi");
        hashMap.put("Nepal", "Kathmandu");
        hashMap.put("Canada", "Ottawa");
        hashMap.putIfAbsent("Australia", "Sydney");

        hashMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        System.out.println("======= Tree map =========");
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.putAll(hashMap);
        treeMap.forEach((key, val) -> {
            System.out.println(key + ": " + val );
        });


    }
}
