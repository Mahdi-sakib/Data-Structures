import java.util.Scanner;
public class Lab01Task11{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please input a number: ");
        int num=sc.nextInt();
        System.out.print(allDigitsOdd(num));
    }
    
    public static boolean allDigitsOdd(int num){
        int remainder=num;
        int lastDigit;
        boolean checker=true;
        while(remainder>0){
            remainder=remainder/10;
            lastDigit=num-remainder*10;
            num=remainder;
            if(lastDigit%2==0){
                checker=false;
                break;
            }
        }
        return checker;
    }
}