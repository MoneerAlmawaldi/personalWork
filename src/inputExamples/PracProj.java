package inputExamples;
import java.util.Scanner;
public class PracProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long phoneNumber=4145397891L;
Scanner input=new Scanner(System.in);
System.out.println("Phone Number: "+phoneNumber);
System.out.println("Area Code: "+phoneNumber/10000000);
System.out.println("Middle Numbers: "+phoneNumber/1000);

	}

}
