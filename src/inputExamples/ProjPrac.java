package inputExamples;
import java.util.Scanner;
public class ProjPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int userAge=15;
int socialSecurity=123456789;
Scanner input= new Scanner(System.in);
System.out.println("Your Age: "+userAge);
System.out.println("Number Of Years Until 18: "+(18-userAge));
System.out.println("Social Security Number: "+socialSecurity);
System.out.println("Last Four Digits: "+(socialSecurity%10000));
userAge=input.nextInt();
socialSecurity=input.nextInt();

	}

}
