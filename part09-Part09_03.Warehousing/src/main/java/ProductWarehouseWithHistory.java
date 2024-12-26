/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    double initialBalance;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.initialBalance = initialBalance;
        
    }
    
}
