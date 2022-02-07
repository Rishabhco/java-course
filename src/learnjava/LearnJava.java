/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;
import java.util.*;
/**
 *
 * @author risha
 */
public class LearnJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World !!!!");
        Integer il=Integer.valueOf("101011",2);
        int a=Integer.parseInt("123");
        System.out.println(a);
        int c=il.intValue();
        System.out.println(c);

        //Take User Input
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println(age);

        //Make One dimension array
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
