package decisionStructures;
import java.util.Scanner;
public class YouWon {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
final double close=0.001;
double sqrt=Math.sqrt(84.3);
System.out.println("How Much Money Did You Get For Your Fifth Birthday?");
double money=input.nextDouble();
if ((Math.abs(money - sqrt)<close))
{
System.out.println("You Won A Good Prize!");
}
else
{
System.out.println("You Win A Horrible Prize!");
}
}
}
