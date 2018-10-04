package objectOrientedProgramming;
import java.util.Scanner;
public class Room {
public Room(){

}

public void area(){
	Scanner input= new Scanner(System.in);
	System.out.println("What Is The Length And Height Of The Wall?");
	System.out.println("Length= ");
	int length=input.nextInt();
	System.out.println("Height= ");
	int height= input.nextInt();
	int area= length*height;
	System.out.println("Area: "+area);
}
public void areaWithDoor(){
	Scanner input= new Scanner(System.in);
	System.out.println("What Is The Length And Height Of The Wall?");
	System.out.println("Length= ");
	int length=input.nextInt();
	System.out.println("Height= ");
	int height= input.nextInt();
	int area= length*height;
	
	System.out.println("What Is The Length And Height Of The Door?");
	System.out.println("Length Of Door= ");
	int lengthofdoor=input.nextInt();
	System.out.println("Height Of Door= ");
	int heightofdoor= input.nextInt();
	int areaofdoor= lengthofdoor*heightofdoor;
	int areawodoor= (area)-(areaofdoor);
	System.out.println("Area Of Door: "+areaofdoor);
	System.out.println("Area Of Wall Without Door: "+areawodoor);

}
}