public class Profit_profitpercentage {
    public static void main(String[] args) {
        double Cp=129;     //Cost price in INR
        double Sp=191;      // Selling price in INR
        double Profit=(Sp-Cp);
        double Profit2=(Profit/Cp*100);  // profit percentage
        
        System.err.print("The Cost Price is INR " + Cp + "  and Selling Price is INR ==> " +Sp + " \n The Profit is INR  ==> "  + Profit +" and The Profit Percentage is  ==>  "+Profit2 );
    }
}
