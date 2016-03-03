/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l04q8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class L04Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a = 0,cont = 0,ajuste = 0;
        int matriz[][] = new int[10][10];
        int posicao[] = new int[10000];
        
        Scanner scan = new Scanner(System.in);
        
        for(int y=0;y<10;y++)
        {
            for(int x=0;x<10;x++)
            {
            System.out.println("Digite a posição "+(y+1)+" "+(x+1)+" da matriz");
            matriz[y][x] = scan.nextInt();
            }
        }
      
        
        
        System.out.println(matriz);
        
        for (int y=0; y<10; y++)
        {
            for (int x=0; x<10; x++)
            {
            if (matriz[y][x] > a)
            {
                cont = 1;
                ajuste = 1;
                a = matriz[y][x];
                posicao[0] = y;
                posicao[ajuste] = x;
            }
            else if (matriz[y][x] == a)
                cont++;
                ajuste++;
                posicao [ajuste] = y;
                ajuste++;
                posicao [ajuste] = x;
                                
            }
        }
        
        if (a == 0)
        {
            System.out.println("a matriz é nula. ;-;");
        }
        else
        {
            System.out.println("o maior número da matriz é "+a+" que se repete"+cont+"vezes");
            System.out.println("a(s) posição(ões) em que o número se encontra:");
            for (int g=0;g<ajuste;g++)
                System.out.println(posicao[g]);
        }
    }
}
