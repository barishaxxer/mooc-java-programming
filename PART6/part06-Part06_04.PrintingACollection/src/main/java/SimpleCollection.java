
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String placeholder = "";
        for (String i : elements) {
            placeholder = placeholder + i + "\n";
        }
        if (placeholder.isBlank()) {
            return String.format("The collection %s is empty.", this.name);

        }
        if (this.elements.size() == 1) {
            return String.format("The collection %s has %d element:\n%s", this.name, elements.size(), placeholder.strip());

        }
         return String.format("The collection %s has %d elements:\n%s", this.name, elements.size(), placeholder);

    }
}
