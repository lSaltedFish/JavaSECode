package study._super;

public class Student extends Person{
    String name;
    int age;
    int id = 1002;
    public Student() {
        System.out.println("Student()...");
    }

    public Student(String name, int age) {
        this();
    }

    public Student(String name, int age, int id) {
        this();
    }
    public Student(String name) {
        this("ss",20);
    }
    public void show1(){
        show();
        this.show();
    }
}
