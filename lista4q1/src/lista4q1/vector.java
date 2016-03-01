/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4q1;
import java.util.Scanner;
/**
 *
 * @author paulo albertklik
 */
public class vector {
     private int vetor[] = new int[12]; 
     
     
     public void start() {
         Scanner ler = new Scanner(System.in);
         System.out.println("Input integer values for the vector");
         
         
         for (int i=0;i<12;i++) { 
             System.out.print("[" + (i+1) + "]: " ); //para as 12 posições
            vetor[i] = getInt(); 
            }
         
       int sum = Sum();
       System.out.println("the sum is:");
       System.out.println(sum);         
    }
     
 
private int Sum() {      //method Sum, get 2 indexes and returns the sum 
     int sum=0, index1,index2;    
     boolean error=true;
     while (error==true) {
        try 
        {
            index1 = index2 = 0;
            System.out.println("input a index:");
            index1 = (getInt()-1);
            System.out.println("input another index:");
            index2 = (getInt()-1);
            sum = vetor[index1] + vetor[index2];  
            error=false;
        }
        catch (Exception e) 
        {
         System.out.println("ERROR, out of INDEX!");
         
        }
    }
       
     return sum;
}
     
     private int  getInt() {  //function getInt - return a integer and check the exceptions
         int a=0;
         Scanner read = new Scanner(System.in);
         boolean error=true;
         while (error==true) 
         {
             try 
             {
                  a = read.nextInt();
                  error=false;
             }
             catch (Exception e) 
             {
                 System.out.println("ERROR, insert a integer value!");
                 read.next();
             }
         }   
     return a;    
     }
     
}
