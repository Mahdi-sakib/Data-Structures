import java.util.Scanner;
public class Lab01_03
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int array[]=new int[5];
    for(int i=0;i<array.length;i++)
    {
    array[i]=sc.nextInt();
    }
   int maxloc,max;
   for(int i=0;i<array.length;i++)
    {
     maxloc=i;
     max=array[i];
     for(int j=i+1;j<array.length;j++)
     {
    if(array[j]>max)
    {
   max=array[j];
      maxloc=j;
    }
     }
   int temp=array[i];
   array[i]=array[maxloc];
   array[maxloc]=temp;
   }
     for(int i=0;i<array.length;i++)
    {
    System.out.println(array[i]);
    }
       for(int i=0;i<array.length;i++)
    {
         if(array[i]%2==0)
    System.out.println(array[i]);
    }
  }
}
      