package decisionStructures;
import java.util.Scanner;
public class Temperature {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("What Is The Temperature Outside?");
double temp=input.nextDouble();
if (temp>=83)
{
System.out.println("Time To Swim!");
}
else
{
if (temp>=74)
{
System.out.println("Take Your Tennis Racquets; Lets Head For The Park!");
}
else
{
if (temp>=35)
{
System.out.println("What A Great Day For Fresh Air And Golf!");
}
else
{
if (temp>=-10)
{
System.out.println("It's Time To Go Snow Shoeing!");
}
else
{
System.out.println("It's Too Cold To Do Outdoor Activities!!");
}
}
}
}
}
}