
import java.util.ArrayList;
import org.graalvm.compiler.nodes.BreakpointNode;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
    public static void removeLast(ArrayList<String> list){
        if (! list.isEmpty()) {
            list.remove(list.size() - 1);
        }
        
    }
}
