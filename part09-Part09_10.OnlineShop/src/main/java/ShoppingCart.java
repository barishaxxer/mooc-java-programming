
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class ShoppingCart {
    private List<Item> items;
    
    public ShoppingCart(){
        this.items = new ArrayList<>();
        
    }
    
    public void add(String product, int price){
        Item i = new Item(product, 1, price);
        if (this.items.contains(i)) {
            int index = this.items.indexOf(i);
            this.items.get(index).increaseQuantity();
            return;
            
        }
        
        this.items.add(i);
    }
    public int price(){
        int sum = 0;
        for (Item i : items) {
            sum += i.price();
            
        }
        return sum;
    }
    public void print(){
        for(Item i : this.items){
            System.out.println(i);
        }
    }
    
}
