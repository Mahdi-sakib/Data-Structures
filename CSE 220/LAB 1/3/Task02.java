import java.util.Scanner;
public class Task02{
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        
        int a[]=new int[10];
        for(int c=0 ; c <a.length ; c++){
            a[c]=keyboard.nextInt();
        }
        int minNum=a[0];
        int maxNum=a[0];
        int counter1=0;
        int counter2=0;
        int maxPos=0;
        int minPos=0;
        
        for(counter1=0 ; counter1<a.length ; counter1++){         
            if(a[counter1] >maxNum){
                maxNum=a[counter1];
                maxPos=counter1;     
            }
        } 
        for(counter2=0 ; counter2 <a.length ; counter2++){
          if(a[counter2]<minNum){
                minNum=a[counter2];
                minPos=counter2;   
            }
        }   
         a[minPos]=maxNum;
         a[maxPos]=minNum;   
        for(int c1=0 ; c1<a.length ; c1++){
            System.out.print(a[c1]+" ");
        }
        System.out.println();
    }
}
           
        
        
        