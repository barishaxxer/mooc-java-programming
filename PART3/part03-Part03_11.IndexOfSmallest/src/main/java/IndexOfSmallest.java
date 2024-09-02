
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
                
            }
            list.add(number);
            
        }
        int smallest = list.get(0);
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            int test = list.get(i);
            if(test < smallest){
                smallest = test;
                index = i;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index);
        
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
