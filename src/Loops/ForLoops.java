package Loops;
import java.util.Scanner;
public class ForLoops {
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int counter=0;
int total=0;
int first=input.nextInt();
for(counter=1;counter<=5;counter=counter+1)
{
System.out.println("Enter a number "+ counter);
first=input.nextInt();
total+=first;
}
System.out.println(total);
}
}
