package Loops;
import java.util.Scanner;
public class CupsGame {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
boolean quit=false;
int cupnumber=0;
while(quit==false
)
{
System.out.println("Welcome To Guess The Cup!");
System.out.println("If You Pick The Right Cup, You Get A Prize!");
System.out.println("Pick Cup One, Two, Or Three!");
cupnumber=input.nextInt();
if (cupnumber==3)
{
System.out.println("Congrats! You Won 5,000 Dollars!");
}
else
{
System.out.println("Sorry, You Lost. Would You Like To Play Again?(true to quit)");
quit=input.nextBoolean();
}
System.out.println("Thanks For Playing Guess The Cup!");
}
}
}