import java.util.Scanner;
public class Triangle_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.err.print("Enter value of base :");
    double base=sc.nextDouble();
 System.err.print("Enter value of height:");
    double height=sc.nextDouble();   
    double area=(1.0/2.0)*(base*height);       
   System.out.print("The area of triangle is ==> "+area);
  
    }
}
