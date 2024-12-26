
import java.util.HashMap;
import java.util.HashSet;
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    public VehicleRegistry(){
        owners = new HashMap<>();
        
    }
    public boolean add(LicensePlate licensePlate, String owner){
        if (owners.containsKey(licensePlate)) {
            return false;
            
        }
        owners.put(licensePlate, owner);
        return true;
    }
    public String get(LicensePlate licensePlate){
        if (! owners.containsKey(licensePlate)) {
            return null;
            
        }
        return owners.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate){
        if (! owners.containsKey(licensePlate)) {
            return false;
            
        }
        owners.remove(licensePlate);
        return true;
    }
    public void printLicensePlates(){
        for(LicensePlate l : this.owners.keySet()){
            System.out.println(l);
        }
    }
    public void printOwners(){
        Set<String> uniqueOwners = new HashSet<>();
        uniqueOwners.addAll(this.owners.values());
        for(String o : uniqueOwners){
            System.out.println(o);
        }
    }
}
