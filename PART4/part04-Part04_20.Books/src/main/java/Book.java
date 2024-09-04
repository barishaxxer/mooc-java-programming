/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barisck
 */
public class Book {
    private String name;
    private String page;
    private String pubYear;
    public Book(String name,String page,String pubYear){
        this.name = name;
        this.page = page;
        this.pubYear = pubYear;
        
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return String.format("%s, %s pages, %s",this.name,this.page,this.pubYear);
    }
    
}
