package inputExamples;

import java.util.Scanner;

public class VoteAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age= 14;
		Scanner input= new Scanner(System.in);
		System.out.println("Current Age: "+age);
		age=18-age;
		System.out.println("Years Until Voting: "+age);
		age=input.nextInt();
		

	}

}
