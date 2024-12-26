
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
public class Abbreviations {
    private HashMap<String, String> abb;
    
    public Abbreviations(){
        abb = new HashMap<>();
    }    
    public void addAbbreviation(String abbreviation, String explanation){
        this.abb.put(abbreviation, explanation);    
    }
    public boolean hasAbbreviation(String abbreviation){
        return this.abb.containsKey(abbreviation);
        
        
    }
    public String findExplanationFor(String abbreviation) {
        return this.abb.get(abbreviation);
    }
    
}
