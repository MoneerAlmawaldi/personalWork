package Loops;
import java.util.Scanner;
public class ForLoops {
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int counter=0;
int howmany=input.nextInt();
for(counter=1;counter<=10;counter=counter+1)
{
System.out.println(howmany+ " Hello");
}
}
}
