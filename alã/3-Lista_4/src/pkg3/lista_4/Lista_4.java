package pkg3.lista_4;

import java.util.Scanner;

public class Lista_4 {

    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[20];
        System.out.println("Crie um novo vetor:");
        System.out.println("-------------------------");
        for (int i = 0; i < 20; i++)
        {
            System.out.println("Insira o item " + (i+1) + " do vetor");
            vetor[i] = scan.nextInt();  
            System.out.println("-------------------------");
        }
        
        System.out.print("Insira o valor que desejas buscar: ");
        int x = scan.nextInt();
        int number = 0;
        String indices = "";
        System.out.println("-------------------------");
        
        for (int i = 0; i < 20; i++)
        {
            
            if (vetor[i] == x)
            {
                number = number + 1;
                indices = indices + String.valueOf((i + 1) + ", "); 
            }       
        }
        
         indices = indices.substring(0, indices.length() - 2);
         indices =  indices + ".";
        
         System.out.println("O numero " + x + " foi encontrado " + number + " vezes.");
         System.out.println("Nas posições " + indices);
        
    }
    
}
