package Day_21;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Creating and initializing shree object;
        Student shree = new Student(225, "Shree", 90);
        // Calling printFunction of shree
        shree.printFunction("Shree");
        Student random = new Student(shree);
        random.printFunction("Random");
        System.out.println(random.marks);
        System.out.println(random.name);
        System.out.println(random.rollNo);
    }
}
class Student{
    int rollNo;
    String name;
    float marks;

    void printFunction(String name){
        System.out.println("This is info of " + this.name + " " + name);
    }
    Student(){
        this.rollNo = 0;
        this.name = "No name no shame";
        this.marks = 0f;
    }

    Student(int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

}
