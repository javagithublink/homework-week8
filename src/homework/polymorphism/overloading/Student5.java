package homework.polymorphism.overloading;

public class Student5 {
    int id;
    String name;
    int age;
    Student5(int i, String n){
        id = i;
        name = n;
    }
    Student5(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    public void display (){
        Student5 s1 = new Student5(111,"Karan");
        Student5 s2 = new Student5(222, "Aryan",25);
        s1.display();
        s2.display();
    }
}
