
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("First name:");
            String fName = scanner.nextLine();
            if (fName.isEmpty()) {
                break;

            }
            System.out.print("Last name: ");
            String lName = scanner.nextLine();
            System.out.print("Identification number: ");
            String id = scanner.nextLine();
            infoCollection.add(new PersonalInformation(fName, lName, id));

        }
        System.out.println("");
        for (PersonalInformation i : infoCollection) {
            System.out.println(i.getFirstName() + " " + i.getLastName());

        }
    }
}
