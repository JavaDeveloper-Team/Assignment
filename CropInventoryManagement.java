
package cropinventory;

import java.util.Scanner;

public class CropInventory {
    private static final int MAX_CROPS = 200; 

    private static String[] cropNames;
    private double[] cropQuantities;
    private int numCrops;

    public CropInventory() {
        cropNames = new String[MAX_CROPS];
        cropQuantities = new double[MAX_CROPS];
        numCrops = 0;
    }

    public void addCrop(String name, double quantity) {
        if (numCrops < MAX_CROPS) {
            cropNames[numCrops] = name;
            cropQuantities[numCrops] = quantity;
            numCrops++;
            System.out.println("Crop added successfully!");
        } else {
            System.out.println("Inventory is full. Cannot add more crops.");
        }
    }

    public void updateQuantity(String name, double newQuantity) {
        for (int i = 0; i < numCrops; i++) {
            if (cropNames[i].equalsIgnoreCase(name)) {
                
                cropQuantities[i] = newQuantity;
                System.out.println("Quantity updated successfully!");
                return;
            }
        }
        System.out.println("Crop not found in inventory.");
    }

    public void viewInventory() {
        System.out.println("Current Inventory:");
        for (int i = 0; i < numCrops; i++) {
            System.out.println(cropNames[i] + ": " + cropQuantities[i]);
        }
    }

    public static void main(String[] args) {
        CropInventory inventory = new CropInventory();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Crop");
            System.out.println("2. Update Quantity");
            System.out.println("3. View Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter crop names : ");
                    String cropName = scanner.nextLine();
                    System.out.print("quantity: ");
                    double cropQuantities = scanner.nextDouble();
                    inventory.addCrop(cropName, cropQuantities);
                    break;
                    case 2:
                    System.out.print("Update quantity: ");
                    System.out.print("Enter crop name : ");
                    String name = scanner.nextLine();
                    System.out.print("quantity: ");
                    double newQuantity= scanner.nextDouble();
                    inventory.updateQuantity(name, newQuantity);
                    break;
                    case 3:
                    System.out.print("view Inventory: ");
                   inventory.viewInventory();
                    break;
                    case 4:
                      System.exit(0);
                    break;
                    default:System.out.println("Invalid choice");
            }
        }
    }
}
