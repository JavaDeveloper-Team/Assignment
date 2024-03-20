package assignement;
import java.util.Scanner;
public class CropInventoryManagement {
    public static void main(String[] args) {
        int len;
        double updatequantity;
                String new_crop,crop1[]={};
        Scanner in=new Scanner(System.in);
        System.out.println("input the length of array");
        len=in.nextInt();
        String[] NameOfCrops=new String[len+1];
        System.out.println("enter the"+" "+len+"crops");
                for(int i=0;i<NameOfCrops.length-1;i++){
                      NameOfCrops[i]=in.next();
                     
        }
                System.out.println("input the length of array of crops");
        int leng=in.nextInt();
       int[] quantity=new int[leng+1];
          System.out.println("enter the"+" "+len+"quantities");
                for(int i=0;i<quantity.length-1;i++){
                      quantity[i]=in.nextInt();
                     
        }           
          System.out.println("1.Adding new crop");
         System.out.println("2.update quantity new crop");
         System.out.println("3.disply current inventory");
        System.out.println("Choose From This above Menu by entering the number:");
        int num=in.nextInt();
        
         if(num==1){
           new_crop=in.next();
    NameOfCrops[len]=new_crop;
    for(int i=0;i<NameOfCrops.length-1;i++){
                          System.out.println(NameOfCrops[i]); 
        }}
   
        }
    }

