
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    public void addMeal(String meal){
        if (!this.meals.contains(meal)) {
             meals.add(meal);
        }
           
    }
    public void clearMenu(){
        meals.clear();
        
    }
    public void printMeals(){
        for(String i : this.meals){
            System.out.println(i);
        }
    }
    
    // implement the required methods here
}
