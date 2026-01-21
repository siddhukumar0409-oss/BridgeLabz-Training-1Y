import java.util.Scanner;;
public class Height_in_yards {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter your height in feets  :");
        double IN_feetst=sc.nextDouble();        
        double In_yards=(IN_feetst/3);        //  Height in Yards
    double   In_miles=(In_yards/1760.0);
           
        System.err.print("Your Height in feets is ==>  " + IN_feetst+  " while in yards is ==>  " +In_yards+ "  and miles is ==>  " + In_miles);
    }
}   

