package objectOrientedProgramming;
public class RectangleTest {
public static void main(String[] args) {
Rectangle Garden=new Rectangle();
System.out.println("Garden Length: "+ Garden.getlength());
System.out.println("Garden Width: "+ Garden.getwidth());
System.out.println("Garden Perimeter: "+ Garden.perimeter());
System.out.println("Garden Area: "+ Garden.area());
Garden.setlength(7);
Garden.setwidth(8);
System.out.println("Garden Length: "+ Garden.getlength());
System.out.println("Garden Width: "+ Garden.getwidth());
System.out.println("Garden Perimeter: "+ Garden.perimeter());
System.out.println("Garden Area: "+ Garden.area());

Garden=new Rectangle(7.5, 8.5);
System.out.println("Garden Length: "+ Garden.getlength());
System.out.println("Garden Width: "+ Garden.getwidth());
System.out.println("Garden Perimeter: "+ Garden.perimeter());
System.out.println("Garden Area: "+ Garden.area());
Garden.setlength(8);
Garden.setwidth(9);
System.out.println("Garden Length: "+ Garden.getlength());
System.out.println("Garden Width: "+ Garden.getwidth());
System.out.println("Garden Perimeter: "+ Garden.perimeter());
System.out.println("Garden Area: "+ Garden.area());

	}

}
