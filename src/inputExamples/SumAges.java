package inputExamples;

import java.util.Scanner;

public class SumAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aAge= 13;
		int bAge= 15;
		int cAge= 14;
		Scanner input= new Scanner(System.in);
		System.out.println("Abdulhamid's Age: "+aAge);
		System.out.println("Ibrahim's Age: "+bAge);
		System.out.println("John's Age: "+cAge);
		System.out.println("Their Ages Combined: "+(aAge+bAge+cAge));
		aAge=input.nextInt();
		bAge=input.nextInt();
		cAge=input.nextInt();
		
	}

}
