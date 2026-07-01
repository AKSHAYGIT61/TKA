import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		        // create  list store product
		        List<Product> inventory = new ArrayList<>();
		        Scanner sc = new Scanner(System.in);
		        int choice;

		        
		     // Electronics Category
		        inventory.add(new Product(101, "Laptop", 75000.0, 10, "Electronics"));
		        inventory.add(new Product(102, "Smartphone", 35000.0, 25, "Electronics"));
		        inventory.add(new Product(103, "Wireless Headphones", 4500.0, 30, "Electronics"));

		        // Clothing Category
		        inventory.add(new Product(201, "T-Shirt", 1200.0, 50, "Clothing"));
		        inventory.add(new Product(202, "Jeans", 2800.0, 40, "Clothing"));

		        // Footwear Category
		        inventory.add(new Product(301, "Shoes", 5500.0, 15, "Footwear"));
		        inventory.add(new Product(302, "Boots", 8900.0, 8, "Footwear"));

		        // Home Appliances Category
		        inventory.add(new Product(401, "Microwave Oven", 12500.0, 12, "Home Appliances"));
		        inventory.add(new Product(402, "Smart TV", 45000.0, 7, "Home Appliances"));
		        inventory.add(new Product(403, "Mixer", 6200.0, 20, "Home Appliances"));

		        do {
		            // Printing the operational menu
		            System.out.println("\n--- PRODUCT INVENTORY SYSTEM ---");
		            System.out.println("0. Exit");
		            System.out.println("1. Add Product");
		            System.out.println("2. Display Inventory");
		            System.out.println("3. Search Product by ID");
		            System.out.println("4. Update Quantity");
		            System.out.println("5. Find Expensive Products");
		            System.out.println("6. Calculate Total Inventory Value");
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            switch (choice) {
		               case 0:
	                     System.out.println("Exiting System");
	                     System.out.println(" Thank you...");
	                     break; 
		               case 1:
		                    // display operation
		                    System.out.print("Enter product Id: ");
		                    int id = sc.nextInt();
		                    sc.nextLine(); 
		                    System.out.print("Enter product Name: ");
		                    String name = sc.nextLine();
		                    System.out.print("Enter Price: ");
		                    double price = sc.nextDouble();
		                    System.out.print("Enter Quantity: ");
		                    int qty = sc.nextInt();
		                    sc.nextLine(); 
		                    System.out.print("Enter Category: ");
		                    String category = sc.nextLine();

		                    inventory.add(new Product(id, name, price, qty, category));
		                    System.out.println("Product added successfully");
		                    break;

		                case 2:
		                    // display inventory
		                    if (inventory.isEmpty()) {
		                        System.out.println("Inventory is empty");
		                    } else {
		                        System.out.println("--- Current Inventory Items ---");
		                        for (Product p : inventory) {
		                            System.out.println(p);
		                        }
		                    }
		                    break;
		                    
		                case 3:
		                    // 3. Search product by Id
		                    System.out.print("Enter Product ID to search: ");
		                    int searchId = sc.nextInt();
		                    boolean found = false;
		                    for (Product p : inventory) {
		                        if (p.getId() == searchId) {
		                            System.out.println("Product Found: " + p);
		                            found = true;
		                            break;
		                        }
		                    }
		                    if (!found) System.out.println("Product with ID " + searchId + " not found.");
		                    break;

		                case 4:
		                    // 4. Update qty
		                    System.out.print("Enter Product ID to update quantity: ");
		                    int updateId = sc.nextInt();
		                    boolean updated = false;
		                    for (Product p : inventory) {
		                        if (p.getId() == updateId) {
		                            System.out.print("Enter new quantity: ");
		                            p.setQuantity(sc.nextInt());
		                            System.out.println("Quantity updated successfully!");
		                            updated = true;
		                            break;
		                        }
		                    }
		                    if (!updated) System.out.println("Product not found.");
		                    break;

		                case 5:
		                    // expensive product
		                    if (inventory.isEmpty()) {
		                        System.out.println("Inventory is empty!");
		                    } else {
		                        Product expensive = inventory.get(0); // Assume first is most expensive initially
		                        for (Product p : inventory) {
		                            if (p.getPrice() > expensive.getPrice()) {
		                                expensive = p; 
		                            }
		                        }
		                        System.out.println("Most Expensive Product: " + expensive);
		                    }
		                    break;

		                case 6:
		                    // Total inventory value
		                    double totalValue = 0;
		                    for (Product p : inventory) {
		                        totalValue += (p.getPrice() * p.getQuantity()); // Value = price * quantity
		                    }
		                    System.out.println("Total Inventory Value: INR " + totalValue);
		                    break;

		               

		               

		                default:
		                    System.out.println("Invalid choice, Please try again.");
		            }
		        } while (choice != 0);

		     
		    }
		
	}


