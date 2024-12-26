/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class ProductWarehouse extends Warehouse{
    
    String productName;
    
    public ProductWarehouse(String productname, double capacity ){
        super(capacity);
        this.productName = productname;
    }
    public String getName(){
        return this.productName;
        
    }
    public void setName(String newName){
        this.productName = newName;
    }
    @Override
    public String toString(){
        return this.productName + ": " + super.toString();
    }
}
