/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4q14;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class matrix {
    
    public void start() {
        
        System.out.println("matriz A");
        int mat[][] = geraMatriz(5, 5);
        printMatrix(mat, 5, 5);
        System.out.println("trocando diagonais: ");
        printMatrix(trocaDiagon(mat,5,5),5,5);
        
        
        
    }
    
    
    
    public int[][] trocaDiagon (int mat[][],int ni,int nj) {
        int aux;
        for (int i =0 ; i<ni; i++) {
            aux = mat[i][i];
            mat[i][i] = mat[i][(ni-1)-i];
            mat[i][(ni-1)-i] = aux;
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
