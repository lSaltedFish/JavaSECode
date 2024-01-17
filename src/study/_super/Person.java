package study._super;

public class Person {
    String name;
    int age;
    int id = 1001;
    public Person(){
        System.out.println("Person()...");
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name,int age,int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void show(){
        System.out.println("show()...");
    }
}
