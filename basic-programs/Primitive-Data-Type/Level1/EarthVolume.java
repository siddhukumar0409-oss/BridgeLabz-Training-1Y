public class EarthVolume {
    public static void main(String[] args) {
        
        double pi = 3.141592653589793;
        double radius_Km = 6378.0;
        double km_To_M = 0.621371;      //Kilometers to miles
        double radius_Miles = radius_Km * km_To_M;
        double volumeKm3 = (4.0 / 3.0) * pi * (radius_Km * radius_Km * radius_Km);
        double volumeMiles3 = (4.0 / 3.0) * pi * (radius_Miles * radius_Miles * radius_Miles);
        System.out.printf("The volume of earth in cubic kilometers is  ==> " +volumeKm3+ " and cubic miles is  ==> "+volumeMiles3); 
                          
    }
}
