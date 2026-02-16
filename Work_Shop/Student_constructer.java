public class Student_constructer {
    int id;
String name;
int age;

public Student_constructer() {
System.out.println("Constructor Program");
}

public Student_constructer(int id, String name, int age) {
this.id = id;
this.name = name;
this.age = age;
}


void display(){
System.out.println("ID: "+id);
System.out.println("Name: "+name);
System.out.println("Name: "+age);
}



public static void main(String[] args) {
Student_constructer d= new Student_constructer();
Student_constructer cd = new Student_constructer(1,"Jay",25);
d.display();
cd.display();

// cd.id=1;
// cd.name="kajal";
// cd.age=25;

}
}







