import java.util.Scanner;

public class Lab01_01

{
 
 public static void main(String[]args)
 
 {
   
 Scanner sc=new Scanner(System.in);
   
 System.out.println("enter array length");
  
  int n=sc.nextInt();
 
   int array[]=new int[n];
  
  for(int i=0;i<n;i++)
 
   {
   
 array[i]=sc.nextInt();
  
  }
   
 if(array[0]==6||array[n-1]==6)
    
     {
  
 System.out.println("true");
   
 }
   
 else
 
   {
    
System.out.println("false");
  
  }
  
}

}
      