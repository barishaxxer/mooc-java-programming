/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class Constructor {
    int age;
    String name;
    
    public Constructor(int age,String name){
        this.age = age;
        this.name = name;
    }
    
    public String toString(){
        return String.format("%s is %d years old ", this.name,this.age);
    }
    
}
