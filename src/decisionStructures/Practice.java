package decisionStructures;

import java.util.Scanner;

public class Practice {
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int num1=input.nextInt();
int num2=input.nextInt();
int num3=input.nextInt();

if ((num1>num2)&&(num1>num3))
{
System.out.println("The Largest Integer Is: "+num1);
}
if ((num2>num3)&&(num2>num1))
{
System.out.println("The Largest Integer Is: "+num2);
}
if ((num3>num1)&&(num3>num2))
{
System.out.println("The Largest Integer Is: "+num3);
}
}
}