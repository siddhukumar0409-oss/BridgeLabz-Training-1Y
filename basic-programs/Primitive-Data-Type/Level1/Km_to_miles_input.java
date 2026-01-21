import java.util.Scanner;
public class Km_to_miles_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter distance in kilometer  :");
        double Km=sc.nextDouble();
double  miles=1.6;              //1km=1.6 miles
double change=(1.6)*(Km);       //
System.err.println("The distance ==>" + Km + "  and  km in miles is ==>  "+change);
    }
}
