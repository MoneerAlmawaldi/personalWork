package objectOrientedProgramming;
public class BankAccount {
private double balance;
private final double accountnum;
private double interestrate;
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
public double setbalance(double newbalance)
{
balance=newbalance;
return balance;
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
interestrate=newinterestrate;
return interestrate;
}
public double getinterestrate()
{
return interestrate;
}
{



}
}
