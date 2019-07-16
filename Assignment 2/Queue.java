public class Queue<T>{
    private ListNode theList;
    private ListNode firstNode;
    private ListNode lastNode;
    
    public Queue(){
        theList = null;
    }
    
    public void enqueue(T newEntry){
        ListNode newNode = new ListNode(newEntry, null);
        if(isEmpty())
            firstNode = newNode;
        else
            lastNode.setNext(newNode);
        lastNode = newNode;
    } //end enqueue
    
    public T getFront(){
        T front = null;
        if(!isEmpty())
            front = (T) firstNode.getData();
        return front;
    } //end getFront
    
    public T dequeue(){
        T front = null;
        if(!isEmpty()){
            front = (T) firstNode.getData();
            firstNode = firstNode.getNext();
            if(firstNode == null)
                lastNode = null;
        }
        return front;
    }
    
    public boolean isEmpty(){
        return theList == null;
    }
    
    public String toString(){
        String result = "";
        ListNode<T> current = (ListNode<T>) getFront();
        while(current != null){
            result = result + (current.getData().toString() + "\n");
            current = current.getNext();
        }
        return result;
    }
}