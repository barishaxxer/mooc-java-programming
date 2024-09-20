
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int max){
        this.maxWeight = max;
        suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.totWeight() + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);    
        }
        
    }
    public int totWeight(){
        int sum = 0;
        for(Suitcase s : suitcases){
            sum += s.totalWeight();
        }
         return sum;
    }
     public void printItems(){
         for(Suitcase s : suitcases){
             s.printItems();
         }
     }
    public String toString(){
        return String.format("%d suitcases (%d kg)", suitcases.size(),this.totWeight());
    }
    
}
