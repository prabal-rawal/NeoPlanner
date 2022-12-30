import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Planner {
    private final Scanner input;
    private String response;
    private String fileName;

    public Planner() {
        input = new Scanner(System.in);
    }
    public void guestList() throws IOException {
        fileName = "Outputs/Guestlist/guestList.txt";
        PrintWriter outputFile = new PrintWriter(fileName);
        System.out.println("Enter the name of the guest: ");
        String name = input.nextLine();
        System.out.println("Enter the address of the guest: ");
        String address = input.nextLine();
        System.out.println("Enter the phone number of the guest: ");
        String phone = input.nextLine();
        System.out.println("Enter the email of the guest: ");
        String email = input.nextLine();
        outputFile.println("Name: " + name);
        outputFile.println("Address: " + address);
        outputFile.println("Phone: " + phone);
        outputFile.println("Email: " + email);
        outputFile.close();
        System.out.println("Do you want to add another guest? (y/n)");
        response = input.nextLine();
        if (response.equalsIgnoreCase("y")) {
            guestList();
        }
    }
    public void toDoList() throws IOException {
        fileName = "Outputs/toDoLists/toDoList.txt";
        PrintWriter outputFile = new PrintWriter(fileName);
        System.out.println("Enter the task: ");
        String task = input.nextLine();
        outputFile.println("Task: " + task);
        outputFile.close();
        System.out.println("Do you want to add another task? (y/n)");
        response = input.nextLine();
        if (response.equalsIgnoreCase("y")) {
            toDoList();
        }
    }
    public void budget() throws IOException {
        fileName = "Outputs/budgets/budget.txt";
        PrintWriter outputFile = new PrintWriter(fileName);
        double expense;
        String category;
        System.out.println("Enter the category: ");
        category = input.nextLine();
        System.out.println("Enter the expense: ");
        expense = input.nextDouble();
        outputFile.println("Category: " + category);
        outputFile.println("Expense: " + expense);
        outputFile.close();
        System.out.println("Do you want to add another expense? (y/n)");
        response = input.nextLine();
        if (response.equalsIgnoreCase("y")) {
            budget();
        }
    }
    public void eventSchedule() throws IOException {
        fileName = "Outputs/eventschedules/eventSchedule.txt";
        PrintWriter outputFile = new PrintWriter(fileName);
        String time;
        String location;
        String description;
        String notes;
        System.out.println("Enter the time: ");
        time = input.nextLine();
        System.out.println("Enter the location: ");
        location = input.nextLine();
        System.out.println("Enter the description: ");
        description = input.nextLine();
        System.out.println("Enter any notes: ");
        notes = input.nextLine();
        outputFile.println("Time: " + time);
        outputFile.println("Location: " + location);
        outputFile.println("Description: " + description);
        outputFile.println("Notes: " + notes);
        outputFile.close();
        System.out.println("Do you want to add another event? (y/n)");
        response = input.nextLine();
        if (response.equalsIgnoreCase("y")) {
            eventSchedule();
        }
    }
    public void greetingCard() {
        System.out.println("Please Enter the recipient name: ");
        String name = input.nextLine();
        final int WIDTH = 400;
        final int HEIGHT = 300;
        final Font FONT = new Font("SansSerif", Font.BOLD, 24);
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setFont(FONT);
        g.setColor(Color.BLACK);
        String message = "Happy New Year! " + name;
        int x = (WIDTH - g.getFontMetrics().stringWidth(message)) / 2;
        int y = HEIGHT / 2;
        g.drawString(message, x, y);
        try {
            ImageIO.write(image, "jpg", new File("Outputs/greetingCards/greeting_card.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

