
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
public class OneItemBox extends Box {
    private ArrayList<Item> list;
    public OneItemBox(){
        this.list = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        if(this.list.isEmpty()){
            this.list.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.list.contains(item);
    }
    
}
