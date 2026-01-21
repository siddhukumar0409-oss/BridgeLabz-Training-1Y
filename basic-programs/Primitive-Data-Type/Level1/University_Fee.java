public class University_Fee {
    public static void main(String[] args) {
        double Org_fee=125000;      //Original fee 
       double dis_per=(0.1);        // Discount percentafe is 10   ==> (10)/100
        double discount=(Org_fee)*(dis_per);
        double Final_fee=(Org_fee-discount);
        System.err.print("The discount amount is INR  ==>  "+discount+" and Final discounted fee is INR ==>  "+Final_fee);
    }
}
