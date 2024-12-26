
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> list;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }
    
   

    @Override
    public void add(Item item) {
        int sum = 0;
        for (Item i : this.list) {
            sum += i.getWeight();
        }
        if (sum + item.getWeight() <= capacity) {
            this.list.add(item);
            
        }
        
    }

    @Override
    public boolean isInBox(Item item) {
        return this.list.contains(item);
    }
    
    
    
}
