
import java.util.Scanner;

public class CropInventoryManagement {
    private static int MAX_CROPS = 100;
    private String[] cropNames = new String[MAX_CROPS];
    private int[] cropQuantities = new int[MAX_CROPS];
    private int cropCount = 0;
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nCrop Inventory Management System");
            System.out.println("1. Add New Crop");
            System.out.println("2. Update Crop Quantity");
            System.out.println("3. View Current Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    addNewCrop();
                    break;
                case 2:
                    updateCropQuantity();
                    break;
                case 3:
                    viewInventory();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting Crop Inventory Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    private void addNewCrop() {
        System.out.print("Enter crop name: ");
        String name = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        if (cropCount < MAX_CROPS) {
            cropNames[cropCount] = name;
            cropQuantities[cropCount] = quantity;
            cropCount++;
            System.out.println("Crop added successfully.");
        } else {
            System.out.println("Maximum number of crops reached. Cannot add more.");
        }
    }

    private void updateCropQuantity() {
        System.out.print("Enter the crop name to update quantity: ");
        String name = scanner.nextLine();
        System.out.print("Enter the new quantity: ");
        int newQuantity = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        boolean found = false;
        for (int i = 0; i < cropCount; i++) {
            if (cropNames[i].equalsIgnoreCase(name)) {
                cropQuantities[i] = newQuantity;
                found = true;
                System.out.println("Quantity updated successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Crop not found in inventory.");
        }
    }

    private void viewInventory() {
        if (cropCount == 0) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            System.out.println("Crop Name\tQuantity");
            for (int i = 0; i < cropCount; i++) {
                System.out.println(cropNames[i] + "\t\t" + cropQuantities[i]);
            }
        }
    }

    public static void main(String[] args) {
        CropInventoryManagement cropInventoryManagement = new CropInventoryManagement();
        cropInventoryManagement.run();
    }
}