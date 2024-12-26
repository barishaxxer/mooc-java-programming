
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class IOU {
    private HashMap<String, Double> sum;
    
    public IOU(){
        sum = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.sum.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        Double value = this.sum.get(toWhom);
        if(value == null ){
            return 0;
        }
        return value;
    }
    
}
