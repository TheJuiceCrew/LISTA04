package pkg2.lista_4;

import java.util.Arrays;
import java.util.Scanner;

public class Lista_4 {

   
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[16];
        int vetor2[] = new int[16];
        System.out.println("Crie um novo vetor:");
        System.out.println("-------------------------");
        for (int i = 0; i < 16; i++)
        {
            System.out.println("Insira o item " + (i+1) + " do vetor");
            vetor[i] = scan.nextInt();  
            System.out.println("-------------------------");
        }
        
        System.out.println("O vetor inserido é: ");
        System.out.println(Arrays.toString(vetor));
        System.out.println("-------------------------");
        
        for (int i = 0; i < 8; i ++)
        {
            vetor2[i + 8] = vetor[i];
        }
        
        for (int i = 0; i < 8; i ++)
        {
            vetor2[i] = vetor[i + 8];
        }
        
        System.out.println("O novo vetor é: ");
        System.out.println(Arrays.toString(vetor2));
        System.out.println("-------------------------");
    }
    
}
