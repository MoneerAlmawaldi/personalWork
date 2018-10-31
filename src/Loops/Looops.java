package Loops;
import java.util.Scanner;
public class Looops {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int number=0;
while (number!=-1)
{
System.out.println("Enter Number");
number=input.nextInt();
int cube=number*number*number;
System.out.println("The Cube Of The Number Is "+ cube);
}
}
}
