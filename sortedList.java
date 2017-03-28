 public class sortedList
 {
  public static void main(String[] args)
    {
        theList stringList = new theList();
        
        stringList.insertHead("Rachel");
        stringList.insertHead("Grace");
        stringList.insertHead("Mikayla");
        stringList.insertHead("Shannon");
        
        stringList.iterateForward();
        stringList.iterateBackward();
    }
   }