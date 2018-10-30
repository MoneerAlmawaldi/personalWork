package Loops;
import java.util.Scanner;
public class Activity6 {
public static void main(String[]args){
int number=0;
int counter=0;
int sum=0;
int average=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter A Number. (999 To Quit)");
number=input.nextInt();
while(number!=999)
{
System.out.println("Enter A Number. (999 To Quit)");
counter++;
sum+=number;
average=sum/counter;
number=input.nextInt();
}
System.out.println("The Average Of Numbers Entered Is: "+average);
}
}

