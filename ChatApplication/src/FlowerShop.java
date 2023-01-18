import java.util.Scanner;

public class FlowerShop {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the type of flower (Rose, Lily, Tulip,Jasmin,Sunflower): ");
	        String flowerType = scanner.nextLine();

	        System.out.print("Enter the number of flowers: ");
	        int numFlowers = scanner.nextInt();

	        double price = 0;
	        if (flowerType.equalsIgnoreCase("Rose")) {
	            price = numFlowers * 3.5;
	        } else if (flowerType.equalsIgnoreCase("Lily")) {
	            price = numFlowers * 4;
	        } else if (flowerType.equalsIgnoreCase("Tulip")) {
	            price = numFlowers * 3;
	        } else if (flowerType.equalsIgnoreCase("Jasmin")) {
	            price = numFlowers * 6;
	        } else if (flowerType.equalsIgnoreCase("SunFlower")) {
	            price = numFlowers * 5;
	        } 
	        else {
	            System.out.println("Invalid flower type.");
	        }
	        
	        if (price > 0) {
	            System.out.println("The cost of the flowers is $" + price);
	        }
	    }
	}
