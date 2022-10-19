/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author 16301203
 */
import java.util.Scanner;
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc =new Scanner(System.in);
    
        int result =fact(sc.nextInt());
System.out.println(result);
    }
    public static int fact(int x){
if (x==1){
return 1;
}
return x*fact(x-1);
}
    }

