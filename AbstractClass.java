import java.util.*;
abstract class Shape{
    abstract void findArea();
}
class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double x,double y){
        length=x;
        breadth=y;
    }
    void findArea(){
        System.out.println("The area of Rectangle = "+length*breadth);
    }
}
class Square extends Shape{
    double side;
    Square(double x){
        side=x;
    }
    void findArea(){
        System.out.println("The area of Square = "+side*side);
    }
}
class Circle extends Shape{
    double radius;
    Circle(double x){
        radius=x;
    }
    void findArea(){
        System.out.println("The area of Circle = "+3.14*radius*radius);
    }
}
class AbstractClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x,y;
        
        System.out.println("Enter the length and breadth of rectangle : ");
        x=sc.nextDouble();
        y=sc.nextDouble(); 
        Rectangle r = new Rectangle(x, y);
        r.findArea();
        System.out.println("Enter the side of square : ");
        x=sc.nextDouble();
        Square s = new Square(x);
        s.findArea();
        System.out.println("Ether the radius of circle : ");
        x=sc.nextDouble();
        Circle c = new Circle(x);
        c.findArea();
    }    
}
