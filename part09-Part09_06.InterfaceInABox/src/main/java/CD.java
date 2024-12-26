/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class CD implements Packable{
    private String artist;
    private String name;
    private double weight;
    private int year;
    public CD(String artist, String name, int year){
        this.artist = artist;
        this.name = name;
        this.weight = 0.1;
        this.year = year;
    }
    
    public double weight() {
        return this.weight;
    }
    
    public String toString(){
        return this.artist + ": " + this.name + " (" + this.year + ")";
    }
    
}
