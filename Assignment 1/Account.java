/**
Name: Michael Garrison
Date: 9/3/2014
I have abided by the UNCG Academic Honor Code on this assignment.
*/
public abstract class Account{
private String name;
private int accountNumber;
private double balance;
public Account(String n, int a, double b){ //constructor to initialize
name = n;
accountNumber = a;
balance = b;
}
public double getBalance(){ //method to get the balance
return balance; //returns the balance
}
public double addToBalance(double n){ //add to the current balance
balance = balance + n;
return balance;
}
public double subFromBalance(double n){ //subtract from the current balance
balance = balance - n;
return balance;
}
}
