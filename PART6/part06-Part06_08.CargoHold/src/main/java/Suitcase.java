
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author barisck
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int sum = 0;
        for (Item i : items) {
            sum += i.getWeight();
        }
        return sum;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public Item heaviestItem() {
        
        if (items.isEmpty()) {
            return null;

        }
        Item placeholder = items.get(0);
        for (Item i : items) {
            if (i.getWeight() > placeholder.getWeight()) {
                placeholder = i;

            }
        }
        return placeholder;
    }

    public String toString() {

        if (items.size() == 1) {
            return String.format("%d item (%d kg)", items.size(), this.totalWeight());

        }
        if (items.isEmpty()) {
            return "no items (0 kg)";

        }

        return String.format("%d items (%d kg)", items.size(), this.totalWeight());
    }
}
