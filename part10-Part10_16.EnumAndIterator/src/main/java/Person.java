/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class Person {
    private Education edu;
    private String name;
    
    public Person(Education edu, String name){
        
        this.edu = edu;
        this.name = name;
    }
    public Education getEducation(){
        return edu;
    }
    
    public String toString(){
        return this.name + ", " + this.edu;
    }
    
}
