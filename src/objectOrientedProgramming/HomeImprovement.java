package objectOrientedProgramming;
import java.util.Scanner;
public class HomeImprovement {
public HomeImprovement(){
}
public void wallArea(){
Scanner input= new Scanner(System.in);
System.out.println("What Is The Length And Height Of The Wall?");
System.out.println("Length= ");
int length=input.nextInt();
System.out.println("Height= ");
int height= input.nextInt();
int area= length*height;
double hours= area/3.33333333;
System.out.println("Total Minutes Required To Paint The Wall: "+hours);
}
public void gardenHours(){
Scanner input=new Scanner(System.in);
final int WIDTH=10;
System.out.println("What Is The Length Of The Garden?");
System.out.println("Length: ");
int length=input.nextInt();
System.out.println("How Many Rows Are There In The Garden?");
System.out.println("Rows= ");
int rows=input.nextInt();
int totallength=length*rows;
int gardentime=totallength/15;
System.out.println("Total Hours It Takes To Plant The Garden: "+gardentime*2);



}

	}

