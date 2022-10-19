import java.util.Scanner;
public class Lab01Task09{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int [] array=new int[10];
        
        for(int count=0; count<array.length; count++){
            System.out.println("Please enter a value : ");
            array[count]=sc.nextInt();
        }
        
        print(array,array.length);
        System.out.println("\nSquare of the values : ");
        square(array,array.length);
    }
    
    public static void print(int[] array, int length){
        for(int count=0; count<length; count++){
            System.out.print(array[count]+" ");
        }
    }
    
    public static void square(int[] array, int length){
        for(int count=0; count<length; count++){
            System.out.print(array[count]*array[count]+" ");
        }
    }
}