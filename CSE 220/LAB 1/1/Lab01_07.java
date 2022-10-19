import java.util.Scanner;
public class Lab01_07
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
  for(int i=0;i<a.length;i++)
    {
   a[i]=sc.nextInt(); 
    }
  System.out.println("enter an input from user from 0 to 9");
  int n=sc.nextInt();
  int l=a[n];
  for(int i=0;i<l;i++)
  {
  System.out.print("*");
  }
  System.out.println();
  }
}