package decisionStructures;
import java.util.Scanner;
public class SchoolGrades {
public static void main(String[] args) {
double num = 1; //Test score
char up = 'y';//Is your teacher nice?
double num2 = 1;//Homework score
System.out.println("What is your test average??");
Scanner input = new Scanner(System.in);
num = input.nextDouble();
System.out.println("What homework average??");
num2 = input.nextDouble();
System.out.println("Is your teacher nice(Y/N)??");
up = input.next().charAt(0);//Retrieves first character of next input string
if (up == 'Y') {
if (num > num2) {
System.out.println("Your grade is " + num);
} else {
System.out.println("Your grade is " + num2);
}
} else {
if (num > num2) {
System.out.println("Your grade is " + num2);
} else {
System.out.println("Your grade is " + num);
}
}
}
}
