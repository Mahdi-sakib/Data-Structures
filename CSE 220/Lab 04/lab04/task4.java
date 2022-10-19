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
public class task4 {
    public static void main (String []args){
    Scanner sc =new Scanner(System.in);
    
        bin(sc.nextInt());

}
public static void bin(int n){

    if(n==1) System.out.print(1);
else{

bin(n/2);
System.out.print(n%2);
}
}
}