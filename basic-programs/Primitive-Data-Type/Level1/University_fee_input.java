import java.util.Scanner;
public class University_fee_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter amount of fee in INR  :");
        double Fee=sc.nextDouble();    //Fee input  in INR
            System.err.print("Enter amount of discount   :");
            double Dis=sc.nextDouble();     // Discount input 
            double dis_convert=(Dis/100);
        double discount=(Fee)*(dis_convert);
        double Final_fee=(Fee-discount);
        System.err.print("The discount amount is INR  ==>  "+discount+" and Final discounted fee is INR ==>  "+Final_fee);
    }
}
