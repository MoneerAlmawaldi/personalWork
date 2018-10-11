package objectOrientedProgramming;
public class Rectangle {
private double length;
private double width;
public Rectangle(){
length=5;
width=6;
}
public Rectangle(double newlength, double newwidth)
{
length=newlength;
width=newwidth;
}
public double setlength(double newlength)
{
length=newlength;
return length;
}
public double getlength()
{
return length;
}
public double setwidth(double newwidth)
{
width=newwidth;
return width;
}
public double getwidth()
{
return width;
}
public double perimeter()
{
return (width*2)+(length*2);
}
public double area()
{
return length*width;
}

	
	
	
	
	
	
	
	
}
