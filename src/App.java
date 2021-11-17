import java.util.Scanner;
import java.util.*;

public class App {
    public static void main(String[] args) {
        String Name;
        String Address;
        char CustomerType;
        double previous;
        double present;
        double consume;
        double amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Name: ");
        Name = sc.nextLine();
        System.out.println("Enter Address: ");
        Address = sc.nextLine();
        System.out.println("Account name is: " + Name);
        System.out.println("Address is : " + Address);
        System.out.println("Choose bill type B for(Business) or R for (Residential): ");
        CustomerType = sc.next().charAt(0);
        switch (CustomerType) {
            case 'R':
                System.out.println("Enter Previous Reading: ");
                previous = sc.nextDouble();
                System.out.println("Enter Present Reading:");
                present = sc.nextDouble();
                consume = present - previous;
                System.out.println("Current consumed in kilowatt(Residential): " + consume);
                System.out.println("----------------------------------------");
                if (consume <= 50) {
                    amount = consume * 4.17;
                    System.out.println("Total Bill amount is Rs." + amount);
                } else if (consume >= 51 && consume <= 150) {
                    amount = consume * 5.46;
                    System.out.println("Total Bill amount is Rs." + amount);
                } else if (consume >= 152 && consume <= 300) {
                    amount = consume * 6.16;
                    System.out.println("Total Bill amount is Rs." + amount);
                } else {
                    amount = consume * 7.20;
                    System.out.println("Total Bill amount is Rs." + amount);
                }
                break;
            case 'B':
                System.out.println("Enter Previous Reading: ");
                previous = sc.nextInt();
                System.out.println("Enter Present Reading:");
                present = sc.nextInt();
                consume = present - previous;
                System.out.println("Current consumed in kilowatt(Business): " + consume);
                System.out.println("----------------------------------------");
                if (consume <= 50) {
                    amount = consume * 5.31;
                    System.out.println(" Total Bill amount is Rs." + amount);
                } else if (consume >= 51 && consume <= 150) {
                    amount = consume * 6.18;
                    System.out.println(" Total Bill amount is Rs." + amount);
                } else {
                    amount = consume * 7.25;
                    System.out.println(" Total Bill amount is Rs."+ amount);

                }
                break;
        }
    }
}