// classes
// object
// constructor
// *Polymorphism - WHEN WE MAKE FUNCTION OF SAME NAME THEN IT IS CALLED AS POLYMORPHISM ONLY DIFFERENCE IS ITS TAKE DEFFERENT PARAMETERS
// *inheritance - when all properties and method are copied inside some other class using extends keyword
// *Encapsulation 
//    1.package
//    2.acces modified
// *Abstraction in this we use abstract keyword to make them abstract  and then use extends keywoards 
// *interface - in this we use interface keyword to make interface and then use implements keyword and while implementing if we dont use public keyword in dervied class it will give an error

// Start 
import java.util.*;
//  first class 
class Pen { // this is how you make the class and all classes name start with capital letter
    String color;// base class or superclass or parents class
    String type;
    int price;

    public void printinfo() {
        System.out.println("Writting");
    }

    public void color() {
        System.out.println(this.color);
    }

    Pen() { // this is not parameterized constructor and this is automatically created in
            // java and we dont need deconstructor in java
            // if we make parameterized constructor on the time of declaring it .We can
            // initilized it like - pen(Sting color){
            // this.color = color;
            // }
    }

    // polymorphism
    public void print(String type) {
        System.out.println(type);
    }

    public void print(int price) {
        System.out.println(price);
    }

    public void print(String type, int price) {
        System.out.println(type + " " + price);
    }
}

// class 2
class pencil extends Pen { // this is inheritance // derived class or subclass or child class

}

// main class
public class oop {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // creating class object
        p1.color = "red";
        p1.type = "gel"; // this is how you initiate class opject
        p1.price = 10;
        p1.printinfo();
        p1.print("ball");
        p1.print("ball", 20);

    }
}
