import java.util.Scanner;
import java.io.*;

public class NewYearPlanner {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int choice;
        Planner planner = new Planner();

        do {
            System.out.println("1. Create a guest list\n2. Create a to do list\n3. Create a budget\n4. Create a Event schedule\n5. Create a greeting card\n6. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    planner.guestList();
                    break;
                case 2:
                    planner.toDoList();
                    break;
                case 3:
                    planner.budget();
                    break;
                case 4:
                    planner.eventSchedule();
                    break;
                case 5:
                    planner.greetingCard();
                    break;
                case 6:
                    System.out.println("Thank you for using the New Year Planner");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
        input.close();
    }
}