import java.util.NoSuchElementException;
import java.util.Collections;
 
public class DLL<E> //Doubly Linked List
{
 
    private Node head;
    private Node tail;
    private int size;
     
    public DLL() 
    {
        size = 0;
    }
    
    //Node Class
    private class Node 
    {
        E element;
        Node next;
        Node prev;
 
        public Node(E element, Node next, Node prev) 
        {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    /**
     * return size of list
     * @return
     */
    public int size() 
    { 
      return size; 
    }
     
    /**
     * return if empty or not
     * @return
     */
    public boolean isEmpty() 
    { 
      return size == 0; 
    }
    
     public void add(E element) 
     {
        Node tmp = new Node(element, head, null);
        if(head != null ) 
        {
          head.prev = tmp;
        }
        head = tmp;
        if(tail == null) 
        { 
          tail = tmp;
        }
        size++;
    }
     
     /**
      * Need to Sort
      */
     
     
     
    /**
     * method to iterate forward
     */
    public void iterateForward()
    { 
        System.out.println("iterating forward...");
        Node tmp = head;
        
        while(tmp != null)
        {
            System.out.println(tmp.element);
            tmp = tmp.next;
        }
    }
     
    /**
     * method to iterate backward
     */
    public void iterateBackward()
    {
        System.out.println("iterating backword...");
        Node tmp = tail;
        
        while(tmp != null)
        {
            System.out.println(tmp.element);
            tmp = tmp.prev;
        }
    }
     
    /**
     * remove first element from list
     * @return
     */
    public E removeFirst() 
    {
        if (size == 0) throw new NoSuchElementException();
        
        Node tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        
        System.out.println("deleted: "+tmp.element);
        return tmp.element;
    }
     
    /**
     * removes last element
     * @return
     */
    public E removeLast() 
    {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        
        System.out.println("deleted: "+tmp.element);
        return tmp.element;
    }
    
    
    public static void main(String[] args)
    {
         
        DLL<String> stringList = new DLL<String>();
        
        stringList.add("Rachel");
        stringList.add("Grace");
        stringList.add("Mikayla");
        stringList.add("Shannon");
        
        java.util.Collections.sort(stringList, Collator.getInstance());
        
        stringList.iterateForward();
        stringList.iterateBackward();
    }
}
    
