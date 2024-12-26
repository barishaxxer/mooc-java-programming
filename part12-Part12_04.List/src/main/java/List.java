/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class List<T> {
    private T list;
    private int ffIndex;
    
    public List(int size){
        
        this.list = (T) new Object[10];
        this.ffIndex = 0;
    }
    public void add(T value){
        this.list[this.ffIndex] = value;
        this.ffIndex++;
    }
    
}
