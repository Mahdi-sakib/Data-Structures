import java.util.Scanner;
public class Lab01Task05{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int array[]= new int[10];
        int temp;
        
        for(int count=1; count<=15; count++){
            System.out.println("Please enter a number: ");
            temp=sc.nextInt();
            array[temp]=array[temp]+1;
        }
        for(int count=0; count<array.length; count++){
            System.out.println(count+" was found "+array[count]+" times");
        }
    }
}