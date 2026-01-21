import java.util.Scanner;
public class Height_feets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter your height in Centimeter  :");
        double IN_height=sc.nextDouble();        
        double In_inches=(IN_height/2.54);        //  Height in inches 
        double In_feets=(In_inches/12);        // Height in feets 
        double Remain_inches=(In_inches%12);     // Remain inches while Divided by 12 to convert in feets 
        System.err.print("Your Height in cm is ==>  " + IN_height+  " while in feet is ==>  " +In_feets+ "  and inches is ==>  "  +Remain_inches);
    }
}
