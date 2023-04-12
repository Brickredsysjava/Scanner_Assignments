package org.q10;
import java.util.Scanner;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Cart {
    private Item[] items;
    private int itemCount;
    private double totalPrice;

    public Cart() {
        items = new Item[100];
        itemCount = 0;
        totalPrice = 0.0;
    }

    public void addItem(Item item) {
        items[itemCount] = item;
        itemCount++;
        totalPrice += item.getPrice();
    }

    public void removeItem(int index) {
        totalPrice -= items[index].getPrice();
        for (int i = index; i < itemCount - 1; i++) {
            items[i] = items[i + 1];
        }
        itemCount--;
    }

    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty!");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println((i + 1) + ". " + items[i].getName() + " - Rs." +items[i].getPrice());
            }
            System.out.println("Total price: Rs." + totalPrice);
        }
    }

    public boolean checkout() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        System.out.print("Enter your credit card number: ");
        String creditCardNumber = input.nextLine();
        System.out.print("Enter the expiration date (MM/YY): ");
        String expirationDate = input.nextLine();
        System.out.println("Thank you for your purchase!");
        return true;
    }
}

public class Ecomerce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("Welcome to our online shopping system!");

        boolean running = true;
        while (running) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            int choice = input.nextInt();
            input.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = input.nextLine();
                    System.out.print("Enter item price: ");
                    double itemPrice = input.nextDouble();
                    input.nextLine(); // consume the newline character
                    cart.addItem(new Item(itemName, itemPrice));
                    System.out.println(itemName + " has been added to your cart!");
                    break;
                case 2:
                    cart.displayCart();
                    System.out.print("Enter the item number you want to remove: ");
                    int itemIndex = input.nextInt() - 1;
                    input.nextLine(); // consume the newline character
                    cart.removeItem(itemIndex);
                    System.out.println("Item has been removed from your cart!");
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    if (cart.checkout()) {
                        running = false;
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("Thank you for using our online shopping system!");
    }
}


