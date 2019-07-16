/**
Name: Michael Garrison
Date: 9/3/2014
I have abided by the UNCG Academic Honor Code on this assignment.
*/
public class Bank<T> implements InterestBearingAccount{
private T[] list; // array of accounts of all types stored as a list
private int numberOfEntries;
//Creates an empty list having a given initial capacity.
public Bank(int initialCapacity){
numberOfEntries = 0;
// the cast is safe because the new array contains null entries
@SuppressWarnings("unchecked")
T[] tempList = (T[])new Object[initialCapacity];
list = tempList;
} // end constructor
public double totalAssets(list<Double> list){
if(list == null || list.size()<1)
return 0;
int sum = 0;
for(int i=0; i < numberOfEntries; i++){
sum = sum + list[i];
}
return sum;
}
@Override
public void addInterest(){
}
}