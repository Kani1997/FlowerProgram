import java.util.Scanner;

public class ToyShop {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the price of the toy: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter the age of the child: ");
        int age = scanner.nextInt();
        
        if (age < 3) {
            System.out.println("The toy is free!");
        } else if (age < 18) {
            System.out.println("The price of the toy is $" + price);
        } else {
            System.out.println("The toy is not for this age group.");
        }
    }

}