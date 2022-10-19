public class ListQueue implements Queue{
     int size;
     Node front;
     Node rear;
     
     
     public ListQueue(){
          size = 0;
          front = null;
          rear = null;
     }
     
     public int size(){
          return size;
     }
     
     public boolean isEmpty(){
          if (size == 0){
               return true;
          }else{
          return false;
     }
     }
     
     public void enqueue(Object o) throws QueueOverflowException{
          if (size == 0){
               Node k = new Node(o, null);
               front = k;
               rear = k;
               size++;
          }else{
               Node k = new Node(o, null);
               rear.next = k;
               rear = k;
               size++;
          }
     }
     
     public Object dequeue() throws QueueUnderflowException{
          if (size == 0){
               throw new QueueUnderflowException();
          }else{
               Object temp = front.val;
               front = front.next;
               size--;
               return temp;
          }
     }
     
     public Object peek() throws QueueUnderflowException{
          if (size == 0){
               throw new QueueUnderflowException();
          }else{
               return front.val;
          }
     }
     
     public String toString(){
          if (size == 0){
               return "Empty Queue";
          }
          String output = "";
          for(Node n = front ; n != null ; n = n.next){
               output += " " + n.val;
          }
          return output;
     }
     
     public Object[] toArray(){
          Object[] a = new Object[size];
          int i = 0;
          for(Node n = front ; n!= null ; n = n.next){
               a[i++] = n.val;
          }
          
          return a;
     }
     
     public int search(Object o){
          int c  = 0;
          for(Node n = front ; n != null ; n = n.next){
               if (n.val==o){
                    return c;
               }
               c++;
          }
          
          return -1;
     }
}