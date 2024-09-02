public class AdvancedAstrology {

    public static void printStars(int number) {
        System.out.print("*".repeat(number));
        System.out.println("");
    }

    public static void printSpaces(int number) {
        System.out.print(" ".repeat(number));
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 0; i < size; i++) {
            printSpaces(size - (i + 1));
            printStars(i + 1);  

        }
    }

    public static void christmasTree(int height) {
        
        for (int i = 0; i < height; i++) {
            printSpaces(height - (i + 1));
            printStars(2 * (i + 1) - 1); 
         
        }

        for (int i = 0; i < 2; i++) { 
            printSpaces(height - 2);
            printStars(3);
        
        }
    }

    public static void main(String[] args) {
        
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
