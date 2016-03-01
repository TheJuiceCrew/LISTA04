/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4q16;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class checkmat {
   
    public void start() {
        String mat1[][] = new String[4][4];
        String mat2[][] = new String[4][4];
        
        System.out.println("Insira os valores para a primeira matriz");
        readAMatrix(mat1,4,4);
        
        System.out.println("Insira os valores para a segunda matriz");
        readAMatrix(mat2,4,4);
        
        System.out.println("Matriz 1: ");
        printMatrix(mat1,4,4);
        System.out.println("Matriz 2: ");
        printMatrix(mat2,4,4);
        
        if (IsPalindrom(mat1, 4, 4)) {
        System.out.println("a matriz 1 é palindromo em todas as direções");
        }
        else System.out.println("a matriz 1 não é palindromo");
        
        if (IsPalindrom(mat2, 4, 4)) {
        System.out.println("a matriz 2 é palindromo em todas as direções");
        }
        else System.out.println("a matriz 2 não é palindromo");
        
    }
    
    
    public String[][] readAMatrix(String mat[][],int ni, int nj) {
        Scanner read = new Scanner(System.in);
        for (int i=0; i<ni; i++) {
            for (int j=0; j<nj; j++) {
                System.out.print("[" + (i+1) +"][" + (j+1) + "]: ");
                mat[i][j] = read.next();
            }
        }
        
        return mat;
    }
    
    public void printMatrix(String matrix[][],int ni,int nj) {
        for (int i=0; i<ni; i++) {
            for (int j=0; j<nj; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public boolean IsPalindrom(String matrix[][],int ni,int nj) {
        boolean is = true;
        String text,formText1="",formText2="";
        
       // checar colunas e linhas
       for (int a=0; a<2; a++) {
        for (int i=0; i<ni; i++) {
            //forma uma palavra com a linha da matriz
            for (int j=0; j<nj; j++) {
            formText1 = formText1 + aux(matrix,a,i,j);    
            }
            //forma uma palavra com a leitura inversa
            for (int j=(nj-1); j>=0; j--) {
            formText2 = formText2 + aux(matrix,a,i,j);    
            }
            System.out.println(formText1 + " " + formText2);
            
            if (i==0) {
                text = formText1;
            } 
            
            if (!formText1.equals(formText2)) {
                return false;
            }
            formText1=formText2="";    
            System.out.println(is);    
        }
       }
       
       //diagonais principais e secundárias
       for (int a=0; a<2; a++) 
       {
           for (int i=0; i<ni; i++) 
           {
            //forma uma palavra com a diagonal da matriz
                for (int j=0; j<nj; j++) 
                { 
                        formText1 = formText1 + aux2(matrix,a,i,j,nj);       
                }
           }          
           for (int i=ni; i>=0; i--) 
           {
            //forma uma palavra com a diagonal da matriz
                for (int j=0; j<nj; j++) 
                {   
                        formText2 = formText2 + aux2(matrix,a,i,j,nj);       
                }
           }  
            //forma uma palavra com a leitura inversa
            System.out.println(formText1 + " " + formText2);
           if (!formText1.equals(formText2)) 
            {  
                return false;
            }
            formText1=formText2="";    
            System.out.println(is);    
        
       }  
    return is;
    }
    
    
    private String aux(String matrix[][],int a,int i,int j) 
    {
     String letter="";
        switch (a) {
            case 0:
                letter = matrix[i][j];
                break;
            case 1:
                letter = matrix[j][i];
                break;                
    }
    return letter;
    }
    
    private String aux2(String matrix[][],int a,int i,int j,int nj) 
     {
     String letter="";
        switch (a) 
        {
            case 0:
                if (i==j) 
                {
                    letter = matrix[i][j];    
                }
                break;
            case 1:
                if (((nj-1)-i)==(j)) 
                {
                    letter = matrix[i][j];
                }
                break;                
        }
    return letter;
    }
        
        
        
        
        
        
    
    
        
}
