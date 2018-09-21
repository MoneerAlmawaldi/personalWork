package inputExamples;

import java.util.Scanner;

public class VolumeCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.14;
		double fraction=3.0;
		double radius= 4.0;
		Scanner input= new Scanner(System.in);
		System.out.println("Radius: "+radius);
		System.out.println("Pi: "+pi);
		fraction=fraction/3.0;
		System.out.println("Volume Of Sphere: "+fraction*pi*(radius*radius*radius));
		pi=input.nextDouble();
		fraction=input.nextDouble();
		radius=input.nextDouble();
	}

}
