package objectOrientedProgramming;
public class Circle {
private double radius; //instance field
public Circle(){ //Default constructor
radius=4;
}
public Circle(double newRadius)//alt constructor
{
radius=newRadius;
}
public double setRadius(double newRadius)//setter
{
radius=newRadius;
return radius;
}
public double getRadius() //getter
{
return radius;
}
public double circumference() //accessor method
{
return 2*radius*Math.PI; //outputs product
}
public double area() //accessor method
{
return Math.PI*radius*radius; //outputs product
}
}
