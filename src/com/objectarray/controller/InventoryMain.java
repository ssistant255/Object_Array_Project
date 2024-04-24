//Create an Item class with attributes like name, price, quantity, and supplier.
//Create an array to store Item objects.
//Implement methods to:
//Add items to the inventory.
//Sell items (update quantity).
//Reorder items when quantity falls below a threshold.
//Generate a stock report with item details and total value.
package com.objectarray.controller;
import java.util.Scanner;
import com.objectarray.pojo.Inventory;
import com.objectarray.pojo.Student;

public class InventoryMain 
{
	public static void main(String[] args) 
		{
	        Inventory manager = new Inventory();
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to Inventory Management System!");

	        while (true) 
	        {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add Item");
	            System.out.println("2. Sell Item");
	            System.out.println("3. Set Reorder Threshold");
	            System.out.println("4. Generate Stock Report");
	            System.out.println("5. Exit");
	            System.out.print("Select an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice)
	            {
	                case 1:
	                    System.out.print("Enter item name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter item price: ");
	                    double price = scanner.nextDouble();
	                    System.out.print("Enter item quantity: ");
	                    int quantity = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter supplier name: ");
	                    String supplier = scanner.nextLine();
	                    manager.addItem(name, price, quantity, supplier);
	                    System.out.println("item added to the inventory");
	                    break;
	                   

	                case 2:
	                    System.out.print("Enter item name to sell: ");
	                    String itemName = scanner.nextLine();
	                    System.out.print("Enter quantity to sell: ");
	                    int quantitySold = scanner.nextInt();
	                    scanner.nextLine(); 
	                    manager.sellItem(itemName, quantitySold);
	                    break;

	                case 3:
	                    System.out.print("Enter reorder threshold: ");
	                    int threshold = scanner.nextInt();
	                    scanner.nextLine();
	                    manager.setReorderThreshold(threshold);
	                    break;

	                case 4:
	                    manager.generateStockReport();
	                    break;
	                case 5:
	                    System.out.println("Exiting Inventory Management System. Goodbye!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	                     break;
	            }
	        }
		}
}
