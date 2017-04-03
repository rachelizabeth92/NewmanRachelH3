public class CListTest
{
  public static void main(String[] args)
  {
    SCircList l = new SCircList();
    
    l.insertList("Hello.");
    l.insertList("How are you?");
    l.insertList("Won't you tell me your name?");
    l.insertList("Tick");
    l.insertList("Abra");
    l.insertList("Kadabra");
    l.insertList("Bob");
    
    System.out.printf("Size = %d\n", l.getSize());
    l.forwardTraverse();
    l.searchList("Abra");
    l.forwardTraverse();
    
  }
}
