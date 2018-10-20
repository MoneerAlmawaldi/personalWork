package decisionStructures;
import java.util.Scanner;
public class TestScores {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("What Are Your Three Scores?");
double score1=input.nextDouble();
double score2=input.nextDouble();
double score3=input.nextDouble();
double average=(score1+score2+score3)/3;
if (average>=97)
{
System.out.println("Average Test Grade: A+");
}
else 
{
if (average>=93)
{
System.out.println("Average Test Grade: A");
}
else
{
if (average>=89)
{
System.out.println("Average Test Grade: B+");
}
else
{
if (average>=84.5)
{
System.out.println("Average Test Grade: B");
}
else
{
if (average>=80.5)
{
System.out.println("Average Test Grade: B- ");
}
else
{
if (average>=77.5)
{
System.out.println("Average Test Grade: C");
}
else
{
if (average>=69.5)
{
System.out.println("Average Test Grade: D");
}
else
{
System.out.println("Average Test Grade: F");
}
}
}
}
}
}
}
}
}
