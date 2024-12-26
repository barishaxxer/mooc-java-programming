/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;
/**
 *
 * @author bariscankaya
 */
public class TemperatureSensor implements Sensor {
    private int situation = 0;
    
    @Override
    public boolean isOn() {
        return situation == 1;
    }

    @Override
    public void setOn() {
        this.situation = 1;
         }

    @Override
    public void setOff() {
        this.situation = 0;
          }

    @Override
    public int read() {
        if (isOn()) {
            return new Random().nextInt(61) - 30;
            
        }
        
        throw new IllegalStateException();
        
     
    }
    
}
