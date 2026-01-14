import java.util.*;
public class SmartResto {
    public static void main(String[] args){
      double total=0.0;
      String rep;
      Scanner res = new Scanner(System.in);
       System.out.printf("Welcome to xyz restaurant! Here's our menu\n pizza    30$\nfries  5$\ncoke  5$\n ");
      do{
       System.out.println("What would you like to order?");
      String order =res.nextLine();
      System.out.println("Enter the quantity(in number of plates)");
      int num = res.nextInt();
      if(order.equals("pizza")){
        total +=num*30;
      }
      else if (order.equals("fries")) {
        total +=num*5;
        
      }
      else if (order.equals("coke")) {
        total +=num*5;        
      }
      else{
        System.out.println("Sorry! We don't have that :(");
      }
      res.nextLine();
      System.out.println("Anything else?(y/n)");
       rep=res.nextLine();
      }
      while(rep.equalsIgnoreCase("y"));  
      double tax=total*0.05;
      double fin= tax+total;
      System.out.println("The bill is as follows: \n subtotal: "+total+ "$ \n tax: "+tax+ "$ \n total: "+fin+"$");
      res.close();
    }
}
