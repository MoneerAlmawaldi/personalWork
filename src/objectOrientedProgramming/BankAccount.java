package objectOrientedProgramming;
public class BankAccount {
private double balance; // instance field
private final double accountnum;// instance field
private final double interestrate;// instance field
public BankAccount(){// default constructor
balance=345;// instance field
accountnum=834529;// instance field 
interestrate=0.06;// instance field
}
public BankAccount(double newbalance, double newaccountnum, double newinterestrate)// alt constructor+parameters
{
balance=newbalance;
accountnum=newaccountnum;
interestrate=newinterestrate;
}
public void setbalance(double newbalance)//setter
{
balance=newbalance;
}
public double getbalance()//getter
{
return balance;//return value
}
public final double getaccountnum(double newaccountnum)//only getter is allowed for constants
{
return accountnum;
}
public final double getinterestrate(double newinterestrate)//getter
{
return interestrate;
}
public double deposit(double addamount){// accessor method
	return balance+addamount;
}
public double withdraw(double subamount){//accessor method
return balance-subamount;
}
public double balancewinterest(){// accessor method
return balance-(balance*interestrate);
}
public double balancewfinancecharge(){// accessor method
return balance-20;
}
public double finalbalance(double addamount, double subamount){//also an accessor method
return (((balance-(balance*interestrate))-20)+addamount)-subamount;
}
}
