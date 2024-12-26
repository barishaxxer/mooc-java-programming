/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bariscankaya
 */
public class AverageSensor implements Sensor {
  
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> track;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.track = new ArrayList<>();
    }
    @Override
    public boolean isOn() {
        for(Sensor s : this.sensors){
            if(!s.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for(Sensor s : this.sensors){
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        this.sensors.get(0).setOff();
          }

    @Override
    public int read() {
        if (isOn() && !this.sensors.isEmpty()) {
            int sum = 0;
            for(Sensor s : this.sensors){
                sum += s.read();
            }
            int average = sum / this.sensors.size();
            this.track.add(average);
            return average;
        }
        throw new IllegalStateException();
       
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    public List<Integer> readings(){
        return this.track;
    }
    
}
