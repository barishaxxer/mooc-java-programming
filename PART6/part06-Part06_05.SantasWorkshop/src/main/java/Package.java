
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
public class Package {
    private ArrayList<Gift> gft;
    public Package(){
        gft = new ArrayList<>();
        
    }
    
    public void addGift(Gift gift){
         gft.add(gift);
    }
    
    public int totalWeight(){
        int sum = 0;
        for(Gift single : gft){
            sum += single.getWeight();
        }
        return sum;
    }
    
}
