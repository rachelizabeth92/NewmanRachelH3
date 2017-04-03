<<<<<<< HEAD
public class Node 
    {
        private String element;
        private Node next;
        private Node prev;
 
        public Node(String element) 
        {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
            
            //methods
            public void setNext(Node node)
            {
              this.next = node;
            }
            
            public Node getNext()
            {
              return this.next;
            }
            
            public void setPrev(Node node)
            {
              this.prev = node;
            }
            
            public Node getPrev()
            {
              return this.prev;
            }
            
            public String getElem()
            {
              return this.element;
            }
=======
public class Node 
    {
        private String element;
        private Node next;
        private Node prev;
 
        public Node(String element) 
        {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
            
            //methods
            public void setNext(Node node)
            {
              this.next = node;
            }
            
            public Node getNext()
            {
              return this.next;
            }
            
            public void setPrev(Node node)
            {
              this.prev = node;
            }
            
            public Node getPrev()
            {
              return this.prev;
            }
            
            public String getElem()
            {
              return this.element;
            }
>>>>>>> 4a64ad906bc3070a72f100aaaea10ccab04e2bfe
           }