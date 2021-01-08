import java.util.*;
   public class comparecost{  //Assignment 3-4 Program 5
   public static void main (String[]args){
   
   double weight1, price1, weight2, price2, per1, per2;
   
   Scanner input = new Scanner (System.in);
   
   System.out.println("Enter the weight and price for item #1: ");
      weight1 = input.nextDouble();
      price1 = input.nextDouble();   
 
   System.out.println("Enter the weight and price for item #2: ");
      weight2 = input.nextDouble();
      price2 = input.nextDouble();  
      
   //computations
   
   per1 = weight1/price1;
   per2 = weight2/price2;
   
   if (per1 > per2)
   {
   System.out.println("Item #1 has the better price than item #2");
   } 
   else if (per1 < per2)
   {
   System.out.println("Item #2 has the better price than item #1");
   }
   else
   {
   System.out.println("Item #1 and item #2 have the same price.");
   }
   
   }
   
   
   }