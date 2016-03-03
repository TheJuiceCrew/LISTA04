/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l04q7;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class L04Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = new int[10];
        Scanner scan = new Scanner(System.in);
        
        for(int y=0;y<10;y++)
        {
            System.out.println("Digite o "+(y+1)+"º valor do vetor");
            vetor[y] = scan.nextInt();
        }
        
        for(int y=0;y<10;y++)
        {
            for(int x=0;x<10;x++)
            {
                if (x!= y && vetor[x] == vetor[y])
                    System.out.println("Valores iguais encontrados em vetor["+(x+1)+"] e vetor["+(y+1)+"]");
            }
        }
    }
    
}
