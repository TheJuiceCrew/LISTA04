/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4q15;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class matrix {
    
    public void start() {
       
        int mat[][] = geraMatriz(8,8);
        System.out.println("A matriz: ");
        printMatrix(mat,8,8);
        System.out.println("maior valor da diagonal principal: ");
        System.out.println(dpMaiorValor(mat,8,8));
        System.out.println("Soma dos valores da diagonalsecundária: ");
        System.out.println(dsSoma(mat,8,8));
         
            
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
    
    public int dpMaiorValor (int mat[][], int ni, int nj) {
        int maiorvalor = 0;
        for (int i=0; i<ni; i++) {
            for (int j=0; j<nj; j++) {
                if (i==j) {
                if (mat[i][j]>maiorvalor) {
                    maiorvalor = mat[i][j];
                }
                }
            }
        } 
        return maiorvalor;      
  }
    
  public int dsSoma (int mat[][], int ni, int nj) {
      int soma = 0;
      for (int i=0; i<ni; i++) {
            for (int j=0; j<nj; j++) {
                if (((nj-1)-i) == j) {
                   soma = soma + mat[i][j];
                }
            }
        } 
      return soma;
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
     
    
    
}
