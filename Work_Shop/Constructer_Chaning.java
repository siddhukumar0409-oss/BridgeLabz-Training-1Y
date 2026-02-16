public class Constructer_Chaning {
    int id;
  String name;
  Constructer_Chaning(){
  this(101,"Vikash");
  System.err.println("Default Constructer called");
}
Constructer_Chaning(int id ,String name){
    this.id=id;
    this.name=name;
    System.out.println("Parameterized Constructer called");
}
void display(){
    System.out.println(id+"  "+name);
}
public static void main(String[] args) {
    Constructer_Chaning s=new Constructer_Chaning();
  s.display();
}
}