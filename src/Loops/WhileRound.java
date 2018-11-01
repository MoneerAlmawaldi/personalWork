package Loops;
import java.util.Scanner;
public class WhileRound {
public static void main(String[] args) {
int number=0;
boolean quit=false;
int hundreds=0;
Scanner input=new Scanner(System.in);
while (quit!=true)
{
System.out.println("Enter A Four Digit Integer");
number=input.nextInt();
hundreds=number%100;
System.out.println("Your Integer Rounded To The Hundreds Place Is: "+hundreds);
System.out.println("Do You Want To Quit?(True to quit, False to stay)");
quit=input.nextBoolean();
}
}
}