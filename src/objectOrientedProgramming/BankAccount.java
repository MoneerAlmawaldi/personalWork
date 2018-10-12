package objectOrientedProgramming;
public class BankAccount {
private double balance;
private final double accountnum;
private final double interestrate;
public BankAccount(){
balance=345;
accountnum=834529;
interestrate=0.06;
}
public BankAccount(double newbalance, double newaccountnum, double newinterestrate)
{
balance=newbalance;
accountnum=newaccountnum;
interestrate=newinterestrate;
}
public void setbalance(double newbalance)
{
balance=newbalance;
}
public double getbalance()
{
return balance;
}
public double setaccountnum(double newaccountnum)
{
return accountnum;
}
public double accountnum()
{
return accountnum;
}
public double setinterestrate(double newinterestrate)
{
return interestrate;
}
public double getinterestrate()
{
return interestrate;
}
public double deposit(double addamount){
	return balance+addamount;
}
public double withdraw(double subamount){
return balance-subamount;
}
public double balancewinterest(){
return balance-(balance*interestrate);
}
public double balancewfinancecharge(){
return balance-20;
}
public double balancewinterestwfinancecharge(){
return (balance-(balance*interestrate))-20;
}
}
