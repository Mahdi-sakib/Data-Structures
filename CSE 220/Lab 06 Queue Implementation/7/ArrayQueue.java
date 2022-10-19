public class ArrayQueue implements Queue{
     int size;
     int front;
     int rear;
     Object [] data;
     
     public ArrayQueue(){
          size=0;
          front = -1;
          rear = -1;
          data = new Object[100];
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
          if (size == data.length){
               throw new QueueOverflowException();
          }else{
               if (size == 0){
                    data[0] = o;
                    front = 0;
                    rear = 0;
                    size = 1;
               }else{
                    data[(rear + 1) % data.length] = o;
                    size++;
                    rear++;
               }
          }
     }
     
     public Object dequeue() throws QueueUnderflowException{
          if (size == 0){
               throw new QueueUnderflowException();
          }else{
               Object temp = data[front];
               front++;
               size--;
               data[front - 1] = null;
               return temp;
          }
     }
     
     public Object peek() throws QueueUnderflowException{
          if (size == 0){
               throw new QueueUnderflowException();
          }else{
               return data[front];
          }
     }
     
     public String toString(){
          if (size == 0){
               return "Empty Queue";
          }
          String output = "";
          for(int i = 0 ; i < size ; i++){
               output += " " + data[(i + front) % data.length];
          }
          return output;
     }
     
     public Object[] toArray(){
          Object[] a = new Object[size];
          for(int i = 0 ; i < size ; i++){
               a[i] = data[(i + front) % data.length];
          }
          
          return a;
     }
     
     public int search(Object o){
          for(int i = 0 ; i < size ; i++){
               if (data[(i + front) % data.length]==o){
                    return i;
               }
          }
          
          return -1;
     }
}