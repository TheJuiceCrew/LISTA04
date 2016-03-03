package pkg4.lista_4;

import java.util.Scanner;


public class Lista_4 {

   
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[40];
        System.out.println("Crie um novo vetor:");
        System.out.println("-------------------------");
        for (int i = 0; i < 40; i++)
        {
            System.out.println("Insira o item " + (i+1) + " do vetor");
            vetor[i] = scan.nextInt();  
            System.out.println("-------------------------");
        }
        
        int contador = 0;
        for (int i = 0; i < 40; i++)
        {
            if ((vetor[i] % 2) == 0)
            {
                contador = contador + 1;
            }
        }
        
        
        System.out.println("\nO vetor possui " + contador + " valores pares.");
        System.out.println("\n-------------------------");
    }
    
}
