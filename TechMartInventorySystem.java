package assignement;
import java.util.*;
abstract class TechMartInventorySystem {
    private String productName;
    private double price;

    public TechMartInventorySystem (String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public abstract void displayDetails();
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public double getProductPrice(){
        return price;
    }

    public void setProductPrice(double price) {
        this.price = price;
    }
      public static void main(String[] args) {
        Product electronicProduct = new Product("television", 1200.0, 101, 50);
        Product clothingProduct = new Product("skirt", 50.0, 205, 200);
        System.out.println("Current Inventory Details:"); 
        TechMartInventorySystem  obj1=new Product("shoes",14,1,12);
        obj1.displayDetails();
    }
}
class Product extends TechMartInventorySystem  {
    private int productId;
    private int StockQuantity;
    public Product(String productName, double price, int productId, int quantity) {
        super(productName, price);
        this.productId = productId;
        this.StockQuantity= quantity;
    }

    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStockQuantity() {
        return StockQuantity;
    }

    public void setStockQuantity(int quantityInStock) {
        this.StockQuantity = quantityInStock;
    }

  
    public void updateStock(int quantity) {
        this.StockQuantity=StockQuantity+quantity;
    }

    public double calculateInventoryValue(){
        return getProductPrice()*getStockQuantity();
    }
    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Price: $" + getProductPrice());
        System.out.println("Quantity in Stock: " + getStockQuantity());
    }
}
class Inventory {
    public void addProduct(){
        
    }
    public void displayInventory(){
        
        }
    } 
