import java.util.*;
public class task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur number ");
		int n=sc.nextInt();
		
		System.out.println(fib(n));
		
	}
	
	public static int fib(int n){
		if(n<2)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
}
