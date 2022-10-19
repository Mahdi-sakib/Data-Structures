import java.util.*;
public class task4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur number");
		int n=sc.nextInt();
		
		System.out.println(bin(n));
	}
	
	public static String bin(int n){
		if(n<2)
			return ""+1;
		else
			return bin(n/2) + n%2;
	}
}
