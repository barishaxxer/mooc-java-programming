
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> store;
    
    public StorageFacility(){
        this.store = new HashMap<>();
    } 
    
    public StorageFacility(HashMap<String, ArrayList<String>> store) {
        this.store = store;
    }
    public void add(String unit, String item){
        if(this.store.containsKey(unit)){
            ArrayList<String> a = new ArrayList<>();
            a.addAll(this.store.get(unit));
            a.add(item);
            this.store.put(unit, a);
        }else {
            
            ArrayList<String> b = new ArrayList<>();
            b.add(item);
            this.store.put(unit, b);
            
        }
    }
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> c = this.store.get(storageUnit);
        if (c == null) {
            return new ArrayList<>();
            
        }
        return c;
    }
    
    public void remove(String storageUnit, String item){
        ArrayList<String> j = this.store.get(storageUnit);
        j.remove(item);
        this.store.put(storageUnit, j);
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> arrList = new ArrayList<>();
        for(String k : this.store.keySet()){
            if (this.store.get(k).size() >= 1){
                arrList.add(k);
            }
            
        
            
        }
        return arrList;
    }
    
}
