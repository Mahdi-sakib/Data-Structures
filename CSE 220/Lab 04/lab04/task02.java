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
public class task02 {
    public static void main(String[]args){
   Scanner sc =new Scanner(System.in);
    
        int result =fibb(sc.nextInt());
System.out.println(result);
    }

public static int fibb(int n){
if (n==1) return 0;

if (n==2) return 1;


    return fibb(n-1)+fibb(n-2);
}

}