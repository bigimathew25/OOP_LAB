import java.util.*;
class Overload {
void area(float length, float breadth) {
System.out.println("Area of Rectangle =" +(length*breadth));
}

void area(double radius) {
System.out.println("Area of Circle =" +(3.14*radius*radius));
}

void area(float side) {
System.out.println("Area of Square =" +(side*side));
}
}

class MethodOverload {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);

float length, breadth, side;
double radius;

System.out.println("Enter the length and breadth of Rectangle:");
length = sc.nextFloat();
breadth = sc.nextFloat();

System.out.println("Enter the radius of Circle:");
radius = sc.nextDouble();

System.out.println("Enter the side of Square:");
side = sc.nextFloat();

Overload obj = new Overload();

obj.area(length, breadth);
obj.area(radius);
obj.area(side);
}
}