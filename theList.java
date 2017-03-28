public class theList
{
  private Node head;
  private Node tail;
  private int size;
  
  public theList()
  {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }
  
  public void insertHead(String element)
  {
    Node curr = new Node (element);
    
    if(head == null) //this is an empty list
    {
      head = curr;
      tail = head;
    }
    else
    {
      curr.setPrev(head.getPrev());
      curr.setNext(head);
      head.setPrev(curr);
      head = curr;
    }
    
    size++;
  }
  
  public void iterateForward()
    { 
        System.out.println("iterating forward...");
        Node tmp = head;
        
        while(tmp != null)
        {
            System.out.println(tmp.getElem());
            tmp = tmp.getNext();
        }
    }
  public void iterateBackward()
    {
        System.out.println("iterating backword...");
        Node tmp = tail;
        
        while(tmp != null)
        {
            System.out.println(tmp.getElem());
            tmp = tmp.getPrev();
        }
    }
  
  public String deleteTail()
  {
    Node curr = null;
    if(tail == null)
    {
      return null;
    }
    else if(head == tail)
    {
      curr = tail;
      tail = null;
      head = null;
      //is dead
    }
    else
    {
      curr = tail;
      tail = tail.getPrev();
      tail.setNext(null);  
    }
    size--;
    
    return curr.getElem();
  }
    public  int getSize()
    {
      return this.size;
    }
}