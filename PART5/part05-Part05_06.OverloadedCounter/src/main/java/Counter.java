/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barisck
 */
public class Counter {

    private int startValue;

    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public int value() {
        return startValue;
    }

    public void increase() {
        this.startValue++;
    }

    public void decrease() {
        this.startValue--;
    }

    public void increase(int num) {
        if (num >= 0) {

            this.startValue += num;
        }
    }

    public void decrease(int num) {
        if (num >= 0) {
            this.startValue -= num;
        }
        
    }
}
