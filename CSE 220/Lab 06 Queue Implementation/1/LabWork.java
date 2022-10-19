package lab6;
// Dummy Headed Doubly Linked List (NON CIRCULAR)
public class LabWork{
  
  Node head;
  int size;
  
  // Takes in an array of Integers 
  // Create a linked list with the elements
  // The dummy head will contain -1 as its element
  public LabWork(int[]a){
    // TO DO
    head =new Node(null,null,-1);
    Node tail=head;
    for(int i=0;i<a.length;i++){
        Node mn=new Node(null,null,a[i]);
           tail.next=mn;
           mn.prev=tail;
             tail=tail.next;
    size++;
    }
  }
  
  // Print the elements from the first node to the last
  public void printForward(){
    for(Node mn=head.next;mn!=null;mn=mn.next){
        System.out.print(mn.element+",");
    }
      System.out.println("");
  }
  
  // Print the elements from the last node to the first
  public void printBackward(){
    Node mn=head.next;
    while( mn.next!=null){
    mn=mn.next;
    }
    
        for(;mn.prev!=null;mn=mn.prev){
      System.out.print(mn.element+",");
  }
  System.out.println();      
    }
  // Check if the index is valid
  // index should be >= 0 and <=size
  // NB for Dummy head list, index 0 is the node next to head
  public boolean insert(int index,int element){
    // Return true if successful else false
     // TO DO
     Node n=new Node(null,null,element);
        if(index>=0&&index<=size)
        {          
            Node m=head.next;
            if(index==size &&size!=0)
            {
                for(int i=0;i<index-1;i++)
                {
                    m=m.next;
                } 
                m.next=n;
                n.prev=m;
                size++;
                return true;
            }
            
            for(int i=0;i<index;i++)
            {
                m=m.next;
            } 
            if(size==0)
            {
                n.prev=head;
                head.next=n;
                size++;
                return true;
            }
            
            
            n.next=m;
            m.prev.next=n;
            n.prev=m.prev;
            m.prev=n;
            size++;
            return true;
        }
        
        return false;
    }
  
  // Check if the index is valid
  // index should be >= 0 and <size
  // NB for Dummy head list, index 0 is the node next to head
  // size has to be atleast 1 for deletion
  public boolean delete(int index){
   if(index>=0&&index<size)
        {
             Node mn=head.next;
            if(index==0)
            {  
                if(size>1){
                head.next=mn.next;
                mn.next.prev=mn.prev;
                size--;
                return true;
                }
                else{
                    head.next=null;
                    return true;
                }
            }
            for(int i=0;i<index-1;i++)
            {
                mn=mn.next;
            }
            if(index==size-1)
            {
               mn.next.prev=null;
                mn.next=null;
                return true;
            }
            Node temp=mn.next;
            mn.next=temp.next;
            temp.next.prev=temp.prev;
            return true;
        }
        return false;
    }
} 