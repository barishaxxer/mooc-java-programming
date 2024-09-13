
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition){
        Money xd = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return xd;
    }
    public boolean lessThan(Money compared){
        if (this.euros < compared.euros) {
            return true;
            
        }else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
            
            
        }
        return false;
    }
    public Money minus(Money decreaser){
        
        double comparing = this.euros * 100 + this.cents;
        double compared = decreaser.euros * 100 + decreaser.cents;
        if (comparing - compared < 0) {
              return new Money(0, 0);
            
        }
        double total = 1.0 * (comparing - compared) / 100;
        String formatted = String.format("%.2f", total);
        String[] parts = String.valueOf(formatted).split("\\.");
        Money clone = new Money(Integer.valueOf(parts[0]), Integer.valueOf(parts[1]));
        return clone;
        
       
    }
    

}
