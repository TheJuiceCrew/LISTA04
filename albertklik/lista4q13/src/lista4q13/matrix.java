/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4q13;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class matrix {
    
    public void start() {
        
        System.out.println("matriz A");
        int mat[][] = geraMatriz(8, 8);
        printMatrix(mat, 8, 8);
        System.out.println("matriz triangular infeiror: ");
        printMatrix(triangular(mat,8,8),8,8);        
    }
    
    
    
    public int[][] triangular (int mat[][],int ni,int nj) {
        for (int i =0 ; i<ni; i++) {
            for (int j=0;j<nj; j++) {
                if (j>i) {
                    mat[i][j] = 0;
                }
            }
        }
        return mat;
    }
    
    
    
    public int[][] geraMatriz(int ni, int nj) {
  int mat[][] = new int[ni][nj];
  for (int i=0; i<ni; i++) {
            for (int j=0; j<nj; j++) {
                   mat[i][j]= (int) (Math.random()*10);
            }
        } 
  return mat;
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
    
    public void printMatrix(int matrix[][],int ni,int nj) {
        for (int i=0; i<ni; i++) {
            for (int j=0; j<nj; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public int[][] readAMatrix(int mat[][],int ni, int nj) {
        for (int i=0; i<ni; i++) {
            for (int j=0; j<nj; j++) {
                System.out.print("[" + (i+1) +"][" + (j+1) + "]: ");
                mat[i][j] = getInt();
            }
        }
        
        return mat;
    }
  
}
