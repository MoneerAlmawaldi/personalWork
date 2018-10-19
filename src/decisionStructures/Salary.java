package decisionStructures;
import java.util.Scanner;
public class Salary {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("What Is Your Salary?");
double salary=input.nextDouble();
if(salary<100000)
{
System.out.println("Class: Low-income");
System.out.println("Job Type: Worker");
System.out.println("Vacation: Family Road Trip :), Stay With Relatives");
}
else
{
if(salary<=200000)
{
System.out.println("Class: Good Income");
System.out.println("Job Type: Buisnessman, Physician Assistant, Researcher, Software Developer");
System.out.println("Vacation: Buisness Class Plane Down South, Stay At Hampton Inn");
}
else
{
if(salary<=300000)
{
System.out.println("Class: High-Income");
System.out.println("Job Type: Physician, Biologist, Engineer ");
System.out.println("Vacation: Buisness Class Plane Overseas/Tourism, Stay At Luxury Hotel");
}
else
{
if(salary>=300000)
System.out.println("Class: Very High-Income");
System.out.println("Job Type: CEO, Chairman, Cardiologist, Neurologist, Surgeon");
System.out.println("Vacation: First Class Private Plane Buisness Trip To Spend Your Vacation WORKING Overseas At Your Mansion Looking Over The Mediterranean Sea");
}
}
}
}
}