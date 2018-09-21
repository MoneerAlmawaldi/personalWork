package inputExamples;

import java.util.Scanner;

public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double width= 1.0;
		int height= 8;
		Scanner input= new Scanner(System.in);
		System.out.println("Wall Height: "+height);
		System.out.println("Wall Width: "+width);
		System.out.println("Area Of Wall= "+width*height);
		width=input.nextDouble();
		height=input.nextInt();
		
	}

}
