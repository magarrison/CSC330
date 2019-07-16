/**
Name: Michael Garrison
Date: 9/9/2014
I have abided by the UNCG Academic Honor Code on this assignment.
*/
public class Stack<T>{
    private ListNode theList;
    
    public Stack(){
        theList = null;
    }
    
    public void push(T newEntry){
        ListNode newNode = new ListNode(newEntry, theList);
        theList = newNode;
   } //end push
    
    public T peek(){
        T top = null;
        if(theList != null)
            top = (T) theList.getData();
        return top;
    } //end peek
    
    public T pop(){
        T top = peek();
        if(theList != null)
            theList = theList.getNext();
        return top;
    } //end pop
    
    public boolean isEmpty(){
        return theList == null;
    } //end isEmpty
    
    public String toString(){
        String result = "";
        ListNode<T> current = (ListNode<T>) peek();
        while(current != null){
            result = result + (current.getData().toString() + "\n");
            current = current.getNext();
        }
            return result;
    } //end toString
}