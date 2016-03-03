
package pkg6.lista_4;


public class nToT 
{
    
    
    
    String unidade (int a5, int a4, int a3, int a2, int a1)
    {
        String dado = new String();
        
        if (a5 == 0 && a4 == 0 && a3 == 0 && a2 == 0 && a1 == 0)
        {
            dado = "Zero";
        }
        
        else if (a5 == 0 && a4 == 0 && a3 == 0 && a2 == 1 && a1 != 0)
        {
            dado = "";
        }
        
        else if (a5 == 0 && a4 == 0 && a3 == 0 && a2 == 0 && a1 != 0)
        {
            if (a1 == 1)
            {
                dado = "um";
            }
            
            else if (a1 == 2)
            {
                dado = "dois";
            }
            
            else if (a1 == 3)
            {
                dado = "três";
            }
            
            else if (a1 == 4)
            {
                dado = "quatro";
            }
            
            else if (a1 == 5)
            {
                dado = "cinco";
            }
            
            else if (a1 == 6)
            {
                dado = "seis";
            }
            
            else if (a1 == 7)
            {
                dado = "sete";
            }
            
            else if (a1 == 8)
            {
                dado = "oito";
            }
            
            else if (a1 == 9)
            {
                dado = "nove";
            }
        }
        
        
        else if (a2 != 1 && a1 != 0)
        {
            if (a1 == 1)
            {
                dado = "e um";
            }
            
            else if (a1 == 2)
            {
                dado = "e dois";
            }
            
            else if (a1 == 3)
            {
                dado = "e três";
            }
            
            else if (a1 == 4)
            {
                dado = "e quatro";
            }
            
            else if (a1 == 5)
            {
                dado = "e cinco";
            }
            
            else if (a1 == 6)
            {
                dado = "e seis";
            }
            
            else if (a1 == 7)
            {
                dado = "e sete";
            }
            
            else if (a1 == 8)
            {
                dado = "e oito";
            }
            
            else if (a1 == 9)
            {
                dado = "e nove";
            }
        }
        
        
        return dado;
    }
    
    String dezena (int a5, int a4, int a3, int a2, int a1)
    {
        String dado = new String();
        
        if (a5 == 0 && a4 == 0 && a3 == 0 && a2 != 0 && a1 != 0)
        {
            if (a2 == 1)
            {
                if (a1 == 1)
                {
                    dado = "onze";
                }
                
                else if (a1 == 2)
                {
                    dado = "doze";
                }
                
                else if (a1 == 3)
                {
                    dado = "treze";
                }
                
                else if (a1 == 4)
                {
                    dado = "catorze";
                }
                
                else if (a1 == 5)
                {
                    dado = "quinze";
                }
                
                 else if (a1 == 6)
                {
                    dado = "dezesseis";
                }
                
                 else if (a1 == 7)
                {
                    dado = "dezessete";
                }
                
                 else if (a1 == 8)
                {
                    dado = "dezoito";
                }
                
                 else if (a1 == 9)
                {
                    dado = "dezenove";
                }
                
            }
            
            else if (a2 != 1)
            {
                if (a2 == 2)
                {
                    dado = "vinte ";
                }
                
                if (a2 == 3)
                {
                    dado = "trinta ";
                }
                
                if (a2 == 4)
                {
                    dado = "quarenta ";
                }
                
                if (a2 == 5)
                {
                    dado = "cinquenta ";
                }
                
                if (a2 == 6)
                {
                    dado = "sessenta ";
                }
                
                if (a2 == 7)
                {
                    dado = "setenta ";
                }
                
                if (a2 == 8)
                {
                    dado = "oitenta ";
                }
                
                if (a2 == 9)
                {
                    dado = "noventa ";
                }
            }
        }
        
        
        else if (a5 == 0 && a4 == 0 && a3 == 0 && a2 != 0 && a1 == 0)
        {
                if (a2 == 1)
                {
                    dado = "dez ";
                }
                
                if (a2 == 2)
                {
                    dado = "vinte ";
                }
                
                if (a2 == 3)
                {
                    dado = "trinta ";
                }
                
                if (a2 == 4)
                {
                    dado = "quarenta ";
                }
                
                if (a2 == 5)
                {
                    dado = "cinquenta ";
                }
                
                if (a2 == 6)
                {
                    dado = "sessenta ";
                }
                
                if (a2 == 7)
                {
                    dado = "setenta ";
                }
                
                if (a2 == 8)
                {
                    dado = "oitenta ";
                }
                
                if (a2 == 9)
                {
                    dado = "noventa ";
                }
            
        }
        
        
         else if ((a5 != 0 || a4 != 0 || a3 != 0) && a2 != 0 && a1 == 0)
        {
                if (a2 == 1)
                {
                    dado = "e dez ";
                }
                
                if (a2 == 2)
                {
                    dado = "e vinte ";
                }
                
                if (a2 == 3)
                {
                    dado = "e trinta ";
                }
                
                if (a2 == 4)
                {
                    dado = "e quarenta ";
                }
                
                if (a2 == 5)
                {
                    dado = "e cinquenta ";
                }
                
                if (a2 == 6)
                {
                    dado = "e sessenta ";
                }
                
                if (a2 == 7)
                {
                    dado = "e setenta ";
                }
                
                if (a2 == 8)
                {
                    dado = "e oitenta ";
                }
                
                if (a2 == 9)
                {
                    dado = "e noventa ";
                }
            
        }
        
        else if (a5 != 0 || a4 != 0 || a3 != 0 && a2 != 0 && a1 != 0)
        {
            
            if (a2 == 1)
            {
                if (a1 == 1)
                {
                    dado = "e onze ";
                }
                
                else if (a1 == 2)
                {
                    dado = "e doze ";
                }
                
                else if (a1 == 3)
                {
                    dado = "e treze ";
                }
                
                else if (a1 == 4)
                {
                    dado = "e catorze ";
                }
                
                else if (a1 == 5)
                {
                    dado = "e quinze ";
                }
                
                 else if (a1 == 6)
                {
                    dado = "e dezesseis ";
                }
                
                 else if (a1 == 7)
                {
                    dado = "e dezessete ";
                }
                
                 else if (a1 == 8)
                {
                    dado = "e dezoito ";
                }
                
                 else if (a1 == 9)
                {
                    dado = "e dezenove ";
                }
                
            }
            
            else if (a2 != 1)
            {
                if (a2 == 2)
                {
                    dado = "e vinte ";
                }
                
                if (a2 == 3)
                {
                    dado = "e trinta ";
                }
                
                if (a2 == 4)
                {
                    dado = "e quarenta ";
                }
                
                if (a2 == 5)
                {
                    dado = "e cinquenta ";
                }
                
                if (a2 == 6)
                {
                    dado = "e sessenta ";
                }
                
                if (a2 == 7)
                {
                    dado = "e setenta ";
                }
                
                if (a2 == 8)
                {
                    dado = "e oitenta ";
                }
                
                if (a2 == 9)
                {
                    dado = "e noventa ";
                }
            }
            
            
        }
        
        return dado;
    }
    
    String centena (int a5, int a4, int a3, int a2, int a1)
    {   
        String dado = new String();
        
        if (a2 != 0 || a1 !=0)
        {
            if (a3 == 1)
            {
                dado = "cento ";
            }
            
            if (a3 == 2)
            {
                dado = "duzentos ";
            }
             
            if (a3 == 3)
            {
                dado = "trezentos ";
            }
              
            if (a3 == 4)
            {
                dado = "quatrocentos ";
            }
               
            if (a3 == 5)
            {
                dado = "quinhentos ";
            }
                
            if (a3 == 6)
            {
                dado = "seiscentos ";
            }
                 
            if (a3 == 7)
            {
                dado = "setecentos ";
            }
                  
            if (a3 == 8)
            {
                dado = "oitocentos ";
            }
                   
            if (a3 == 9)
            {
                dado = "novecentos ";
            }
        }
        
        
          if (a5 == 0 && a4 == 0 && a2 == 0 && a1 == 0)
        {
            if (a3 == 1)
            {
                dado = "cem ";
            }
            
            if (a3 == 2)
            {
                dado = "duzentos ";
            }
             
            if (a3 == 3)
            {
                dado = "trezentos ";
            }
              
            if (a3 == 4)
            {
                dado = "quatrocentos ";
            }
               
            if (a3 == 5)
            {
                dado = "quinhentos ";
            }
                
            if (a3 == 6)
            {
                dado = "seiscentos ";
            }
                 
            if (a3 == 7)
            {
                dado = "setecentos ";
            }
                  
            if (a3 == 8)
            {
                dado = "oitocentos ";
            }
                   
            if (a3 == 9)
            {
                dado = "novecentos ";
            }
        }
          
           if ((a5 != 0 || a4 != 0) && a2 == 0 && a1 == 0)
        {
            if (a3 == 1)
            {
                dado = "e cem ";
            }
            
            if (a3 == 2)
            {
                dado = "e duzentos ";
            }
             
            if (a3 == 3)
            {
                dado = "e trezentos ";
            }
              
            if (a3 == 4)
            {
                dado = "e quatrocentos ";
            }
               
            if (a3 == 5)
            {
                dado = "e quinhentos ";
            }
                
            if (a3 == 6)
            {
                dado = "e seiscentos ";
            }
                 
            if (a3 == 7)
            {
                dado = "e setecentos ";
            }
                  
            if (a3 == 8)
            {
                dado = "e oitocentos ";
            }
                   
            if (a3 == 9)
            {
                dado = "e novecentos ";
            }
        }
          
          
        
        if ((a5 != 0 || a4 != 0) && (a2 == 0 && a1 == 0))
        {
            if (a3 == 1)
            {
                dado = "e cem ";
            }
            
            if (a3 == 2)
            {
                dado = "e duzentos ";
            }
             
            if (a3 == 3)
            {
                dado = "e trezentos ";
            }
              
            if (a3 == 4)
            {
                dado = "e quatrocentos ";
            }
               
            if (a3 == 5)
            {
                dado = "e quinhentos ";
            }
                
            if (a3 == 6)
            {
                dado = "e seiscentos ";
            }
                 
            if (a3 == 7)
            {
                dado = "e setecentos ";
            }
                  
            if (a3 == 8)
            {
                dado = "e oitocentos ";
            }
                   
            if (a3 == 9)
            {
                dado = "e novecentos ";
            }
        }
        
        
        
        return dado;
    }
    
    String milhar (int a5, int a4, int a3, int a2, int a1)
    {
        String dado = new String();
        
        if(a5 != 1)
        {
            if (a4 == 1)
            {
                dado = "mil ";
            }
            
            if (a4 == 2)
            {
                dado = "dois mil ";
            }
            
            if (a4 == 3)
            {
                dado = "três mil ";
            }
            
            if (a4 == 4)
            {
                dado = "quatro mil ";
            }
            
            if (a4 == 5)
            {
                dado = "cinco mil ";
            }
            
            if (a4 == 6)
            {
                dado = "seis mil ";
            }
            
            if (a4 == 7)
            {
                dado = "sete mil ";
            }
            
            if (a4 == 8)
            {
                dado = "oito mil ";
            }
            
            if (a4 == 9)
            {
                dado = "nove mil ";
            }
        }
        return dado;
    }
    
    String dezenaDeMilhar (int a5, int a4, int a3, int a2, int a1)
    {
        String dado = new String();
        
        if (a4 == 0 && a5 != 0)
        {
            if (a5 == 1)
            {
                dado = "dez mil ";
            }
            
            if (a5 == 2)
            {
                dado = "vinte mil ";
            }
            
            if (a5 == 3)
            {
                dado = "trinta mil ";
            }
            
            if (a5 == 4)
            {
                dado = "quarenta mil ";
            }
            
            if (a5 == 5)
            {
                dado = "cinquenta mil ";
            }
            
            if (a5 == 6)
            {
                dado = "sessenta mil ";
            }
            
            if (a5 == 7)
            {
                dado = "setenta mil ";
            }
            
            if (a5 == 8)
            {
                dado = "oitenta mil ";
            }
            
            if (a5 == 9)
            {
                dado = "noventa mil ";
            }
        }
        
        if (a5 == 1 && a4 != 0)
        {
            if (a4 == 1)
            {
                dado = "onze mil ";
            }
            
            if (a4 == 2)
            {
                dado = "doze mil ";
            }
            
            if (a4 == 3)
            {
                dado = "treze mil ";
            }
            
            if (a4 == 4)
            {
                dado = "catorze mil ";
            }
            
            if (a4 == 5)
            {
                dado = "quinze mil ";
            }
            
            if (a4 == 6)
            {
                dado = "dezeseis mil ";
            }
            
            if (a4 == 7)
            {
                dado = "dezesete mil ";
            }
            
            if (a4 == 8)
            {
                dado = "dezoito mil ";
            }
            
            if (a4 == 9)
            {
                dado = "dezenove mil ";
            }
            
            
        }
        
        if (a5 != 1 && a5 != 0 && a4 != 0)
        {
            if (a5 == 2)
            {
                dado = "vinte e ";
            }
            
            if (a5 == 3)
            {
                dado = "trinta e ";
            }
             
            if (a5 == 4)
            {
                dado = "quarenta e ";
            }
              
            if (a5 == 5)
            {
                dado = "cinquenta e ";
            }
               
            if (a5 == 6)
            {
                dado = "sessenta e ";
            }
                
            if (a5 == 7)
            {
                dado = "setenta e ";
            }
                 
            if (a5 == 8)
            {
                dado = "oitenta e ";
            }
                  
            if (a5 == 9)
            {
                dado = "noventa e ";
            }
        }
        
        return dado;
    }
}
