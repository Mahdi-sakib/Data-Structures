package lab6;
public class Tester{
  public static void main(String[]args){
    int [] a = {10,20,30,40};
    LabWork l = new LabWork(a);
    l.insert(0,1);
    l.printForward(); // out: 1
l.printBackward();
    int[] b = {1,3,5};
    l = new LabWork(b);
    l.insert(0,0);
    l.printForward(); // out: 0 1 3 5
    l.insert(2,2);
    l.printForward(); // out: 0 1 2 3 5
    l.insert(5,7);
    l.printForward(); // out: 0 1 2 3 5 7
    l.insert(5,6);
    l.printForward(); // out: 0 1 2 3 5 6 7
//    
//    System.out.println("Testing detele");
//    l.delete(0);
//    l.printForward(); // out: 1 2 3 5 6 7
//    l.delete(5);
//    l.printForward(); // out: 1 2 3 5 6 
//    l.delete(2);
//    l.printForward(); // out: 1 2 5 6
//    int[] c = {1};
//    l = new LabWork(c);
//    l.printForward(); // out: 1 
//    l.delete(0);
//    l.printForward(); // // out: 
  }
}