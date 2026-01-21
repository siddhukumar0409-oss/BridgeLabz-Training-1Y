 import java.util.Scanner;
 public class Product_bought {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter price of product  : ");
        double price=sc.nextDouble();
    System.err.print("Enter quantity of product   : ");
        double quantity=sc.nextDouble();
        double total_price=(price*quantity);
        System.err.print("=> The total purchase price is INR ==>  "+ total_price+"  if the quantity  ==>  "+ quantity+" and unit price is INR ==>  "+price);
    }
}
