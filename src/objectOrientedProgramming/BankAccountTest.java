package objectOrientedProgramming;
public class BankAccountTest {
public static void main(String[] args) {
BankAccount murphy=new BankAccount();
System.out.println("Your Balance: "+murphy.getbalance());
System.out.println("Interest Rate: "+murphy.getinterestrate());
System.out.println("Balance After Deposit: "+murphy.deposit(100));
System.out.println("Balance After Withdrawal: "+murphy.withdraw(25));
System.out.println("Balance With Interest: "+murphy.balancewinterest());
System.out.println("Balance With Finance Charge: "+murphy.balancewfinancecharge());
System.out.println("Deposit Amount With Finance Charge And Interest Rate: "+murphy.balancewinterestwfinancecharge());

}
}
