package inputExamples;

import java.util.Scanner;

public class AgeNameProgramTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int age=14;
		System.out.println("What is your age?");
		System.out.println(age);
		age=input.nextInt();
		double weight=111.1;
		System.out.println("What is your weight?");
        System.out.println(weight);
		weight=input.nextDouble();
	}

}
