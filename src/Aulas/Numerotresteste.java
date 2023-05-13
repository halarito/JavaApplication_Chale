/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aulas;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Numerotresteste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int n=0;
        Double val1;
        Double val2;
        int soma=0;
        Scanner l= new Scanner (System.in);
        
        System.out.println("Digite dois numeros");
        
        val1=l.nextDouble();
        val2=l.nextDouble();
        
        while(val1<val2){ System.out.println("O valor 1 deve ser maior que valor 2, volte a digitar");
                           val1=l.nextDouble();
                           val2=l.nextDouble();}
                     
        int a=(int)(val1);
        int b=(int)val2;
        
        
        int diferenca=a-b;
        if(diferenca<1){System.out.println("Intervalo Vazio");}
        else{for(int i=a;a>b;i--){soma=soma+a;                   //n=n+1; soma= (n/2*(a+b)
                                   System.out.println("A soma e: "+soma);}
        
        
        
        
        }
        
    }
    
}
