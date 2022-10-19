package lab6;
public class Node{
  Node next;
  Node prev;
  int element;
  
  public Node(Node n, Node p, int e){
    next = n;
    prev = p;
    element = e;
  }
}