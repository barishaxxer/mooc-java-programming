/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class Organism implements Movable {
    private int initialdx;
    private int initialdy;
    public Organism(int x, int y){
        this.initialdx = x;
        this.initialdy = y;
    }
    @Override
    public void move(int dx, int dy) {
        this.initialdx  += dx;
        this.initialdy += dy;
    }
    
    public String toString(){
        return "x: " + this.initialdx + "; y: " + this.initialdy;
    }
    
}
