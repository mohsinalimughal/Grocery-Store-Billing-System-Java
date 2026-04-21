/**
 * 
 */
package com.mohsin.firstproject;

/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
// Product Class (Encapsulation)
class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void setStock(int stock) { 
        this.stock = stock; 
    }
}

// Billing and Inventory Module
class BillingSystem {
    private ArrayList<Product> inventory = new ArrayList<>();
    private Scanner scanner;

    public BillingSystem(Scanner scanner) {
        this.scanner = scanner;
    }

    public void addDefaultProducts() {
        inventory.add(new Product(101, "Milk", 120.0, 50));
        inventory.add(new Product(102, "Bread", 80.0, 30));
        inventory.add(new Product(103, "Eggs", 15.0, 100));
    }

    public void showInventory() {
        System.out.println("\n--- Available Inventory ---");
        System.out.printf("%-10s %-15s %-10s %-10s%n", "ID", "Name", "Price", "Stock");
        for (Product p : inventory) {
            System.out.printf("%-10d %-15s %-10.2f %-10d%n",
                    p.getId(), p.getName(), p.getPrice(), p.getStock());
        }
    }

    public void generateBill() {
        double total = 0;
        System.out.println("\n--- Start Billing ---");

        while (true) {
            System.out.print("Enter Product ID to buy (or 0 to finish): ");
            int id = scanner.nextInt();

            if (id == 0) {
                break;
            }

            Product found = null;
            for (Product p : inventory) {
                if (p.getId() == id) {
                    found = p;
                    break;
                }
            }

            if (found != null && found.getStock() > 0) {
                System.out.print("Enter Quantity: ");
                int qty = scanner.nextInt();

                if (qty <= 0) {
                    System.out.println("Invalid quantity!");
                    continue;
                }

                if (qty <= found.getStock()) {
                    double cost = found.getPrice() * qty;
                    total += cost;
                    found.setStock(found.getStock() - qty);
                    System.out.println("Added: " + found.getName() + " x" + qty + " = Rs " + cost);
                } else {
                    System.out.println("Error: Not enough stock!");
                }
            } else {
                System.out.println("Product not found or out of stock.");
            }
        }

        double tax = total * 0.05;
        double finalAmount = total + tax;

        System.out.println("\n********** RECEIPT **********");
        System.out.printf("Subtotal   : Rs %.2f%n", total);
        System.out.printf("Tax (5%%)   : Rs %.2f%n", tax);
        System.out.printf("Total Bill : Rs %.2f%n", finalAmount);
        System.out.println("*****************************");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BillingSystem store = new BillingSystem(input);
        store.addDefaultProducts();

        while (true) {
            System.out.println("\n--- Grocery Store Billing System ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Generate Bill");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = input.nextInt();

            if (choice == 1) {
                store.showInventory();
            } else if (choice == 2) {
                store.generateBill();
            } else if (choice == 3) {
                System.out.println("Exiting System...");
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        }

        input.close();
    }
}



