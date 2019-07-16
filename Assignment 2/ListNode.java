/**
Name: Michael Garrison
Date: 9/9/2014
I have abided by the UNCG Academic Honor Code on this assignment.
*/
public class ListNode<T>{
    private T data;
    private ListNode next;
    
    public ListNode(T dataPortion, ListNode nextNode){
        data = dataPortion;
        next = nextNode;
    } //end constructor
    
    public T getData(){
        return data;
    } //end getData
    
    public ListNode getNext(){
        return next;
    } //end getNext
    
    public void setNext(ListNode nextNode){
        next = nextNode;
    } //end setNext
    
}