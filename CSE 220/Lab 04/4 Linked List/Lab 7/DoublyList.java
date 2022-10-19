package lab07;

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
 
          int p=0;
        for(Node c=head.prev;c!=head;c=c.prev){
            p++;
        }
        return p;
        //return -100; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO   
        for(Node f=head.next;f!=head;f=f.next)
            System.out.print(f.element+" ");
        System.out.println();
    }
    
    public void backwardprint(){
        // TO DO
        for(Node back=head.prev;back!=head;back=back.prev)
        System.out.print(back.element+" ");
        System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
         int s=countNode();
        if(idx<0||idx>(s-1))
            return head;
        else
        {
            Node p=head.next;
            for(int n=0;n<idx;n++){
                p=p.next;
            }
            return p;
        }
        //return null; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
     public int indexOf(Object elem){
         //TO DO
        int p=0;
        for(Node io=head.next;io!=head;io=io.next)
        {
            if(elem==(io.element))
            return p;
            p++;
        }
        return -1;
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
        int s=countNode();
        if(idx<0||idx>s)
            System.out.println("Invalid Index");
        else
        {
            Node is=new Node(elem,null,null);
            Node a=nodeAt(idx-1);
            Node o=nodeAt(idx);
            is.prev=a;
            is.next=o;
            o.prev=is;
            a.next=is;
        }
      // s++;
    }
    
    
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
      
      int s=countNode();
        if(index<0||index>s-1)
            return "Invalid Index";
        else
        {
            Node r=nodeAt(index);
            Object e=r.element;
              Node a=nodeAt(index-1);
            Node p=nodeAt(index+1);
            a.next=p;
            p.prev=a;
            r.element=null;
            r.next=null;
            r.prev=null;
            s--;
            return e;
        }
        
        //return null; // please remove this line!
    }
    
    
    
}