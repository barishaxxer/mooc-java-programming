

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(10);
    }
    
    public static void printUntilNumber(int number) {
        int num = 1;
        while(0 < number){
            System.out.println(num);
            number--;
            num++;
        }
        
    }

}
