public class Pens_Distribute {
    public static void main(String[] args) {
        int  pens=14;       //Number of pens 
        int  num=3;        // Number of students
        int rem=(pens%num);     // Remain pens 
        int equal=(pens/num);
        System.out.print("The Pen Per Student is ==>  "  + equal +" and The remaining pen not distributed is ==>  "+ rem );
    }
}
