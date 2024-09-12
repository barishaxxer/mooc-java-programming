/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barisck
 */

public class Timer {
    private final ClockHand second;
    private final ClockHand hundred;

    
    public Timer() {
        this.second = new ClockHand(60); 
        this.hundred = new ClockHand(100); 
    }


    public void advance() {
        this.hundred.advance();
        
        if (this.hundred.value() == 0) {
            this.second.advance();
        }
    }

  
    @Override
    public String toString() {
        return String.format("%02d:%02d", second.value(), hundred.value());
    }
}
