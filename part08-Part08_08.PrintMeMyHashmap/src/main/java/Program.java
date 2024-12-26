
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String,String> hm = new HashMap<>();
        hm.put("abcd", "jlk");
        hm.put("def", "mno");
        printValuesOfKeysWhere(hm, "a");
    }

    public static void printKeys(HashMap<String, String> hashmap) {

        for (String j : hashmap.keySet()) {
            System.out.println(j);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String j : hashmap.keySet()) {
            if (j.contains(text)) {
                System.out.println(j);

            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String j : hashmap.keySet()) {
            if (j.contains(text)) {
                System.out.println(hashmap.get(j));
            }
        }

    }
}
