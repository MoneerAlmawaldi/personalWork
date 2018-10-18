package decisionStructures;
import java.util.Scanner;
public class HonorsTest {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("What Is Your GPA?");
System.out.println("What Is Your Grad Year?");
double gpa=input.nextDouble();
System.out.println("Your GPA: "+gpa);
double yourClass=input.nextDouble();
System.out.println("Your Graduation Year: "+yourClass);
if(gpa<=3.5||yourClass>2019)
{
System.out.println("Sorry, You Aren't Eligible For Honors!");
}
else
{
System.out.println("Congrats, You Have Earned Honors!");
}
}
}

