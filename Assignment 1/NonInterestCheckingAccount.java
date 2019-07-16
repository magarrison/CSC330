/**
Name: Michael Garrison
Date: 9/3/2014
I have abided by the UNCG Academic Honor Code on this assignment.
*/
public class NonInterestCheckingAccount extends Account{
public NonInterestCheckingAccount(String n, int a, double b){ //constructor
super(n, a, b); //passes arguments to Account class
}
public double addToBalance(int n){ //add to the current balance
return super.addToBalance(n); //calls method from Account class
}
public double subFromBalance(int n){ //subtract from the current balance
return super.subFromBalance(n); //calls method from Account class
}
}