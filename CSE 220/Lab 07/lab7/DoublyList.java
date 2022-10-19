package lab7;
public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        Node tail=head.next;
        int count=0;
        for(Node mn=head.next;mn!=head;mn=mn.next){
            count++;
        }
        
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
      Node tail=head.next;
      for(Node mn=head.next;mn!=head;mn=mn.next){
          System.out.print(mn.element+",");
      }
        System.out.println();
    }
    
    public void backwardprint(){
 for(Node mn=head.prev;mn!=head;mn=mn.prev){
     System.out.print(mn.element+",");
 }
        System.out.println( );
    }
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
          int val=countNode();
        if(idx<0||idx>(val-1))
            return head;
        else
        {
            Node p=head.next;
            for(int n=0;n<idx;n++){
                p=p.next;
            }
            return p;
        }
    }
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        int index=-1;
        for(Node mn=head.next;mn!=head;mn=mn.next){
           index++;
           if(mn.element==elem){
               return index;
           }
        }
        
        
        
        
        
        return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        int val=countNode();
        if(idx<0||idx>val){
            System.out.println("Invalid");
        }
        else{
        Node mn=new Node(elem,null,null);
        Node t=nodeAt(idx-1);
        Node p=nodeAt(idx);
        
        mn.prev=t;
        mn.next=p;
        p.prev=mn;
        t.next=mn;
        
        }
       
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
       int val=countNode();
        if(index<0||index>val){
            System.out.println("Invalid");
        }
         
            Node mn=nodeAt(index);
            Object x=mn.element;
              Node a=nodeAt(index-1);
            Node p=nodeAt(index+1);
            a.next=p;
            p.prev=a;
            mn.element=null;
            mn.next=null;
            mn.prev=null;
            
            return x;
        
}
}
    
    
