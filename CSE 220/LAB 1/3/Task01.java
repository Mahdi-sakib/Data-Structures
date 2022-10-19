import java.util.Scanner;
public class Task01{
    public static void main(String[] args){
        
       Scanner keyboard= new Scanner(System.in);
       
       int length=keyboard.nextInt();
       int a[]=new int[length];
       
       for(int counter=0 ; counter<a.length ; counter++){
           a[counter]=keyboard.nextInt();
       }
           if(a[0]==6 || a[a.length-1]==6){
               System.out.println("true");
           }
           else{
               System.out.println("False");
           }
    }
}