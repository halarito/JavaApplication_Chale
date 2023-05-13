/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casting;

/**
 *
 * @author USER
 */
//import java.util.Scanner;

public class ConverteCaracteres {
    
    public static void main (String args []) {                        
    
      // double d = 3.1415;
     //int i = d;
        
    //Exemplo 1: Inteiro armazenar na variavel double
      /*  double x;
        int i = 20;
        x = i;
                  System.out.println ("Valor passou para: = " + x);
        */
      
    //Exemplo 2 Double para int
        double x = 9.997;
        int nx = (int) x;
                  System.out.println ("Valor Double de X = " + x);
                  System.out.println ("Passou para inteiro NX: = " + nx);
         
           
    //Exemplo 3

          int tres = 3;
          char um = '1';
          char quatro = (char) (tres+um);
          System.out.println ("Valor passou para: =" + quatro);
       
           
        //Exemplo 4
                   
             /*   int i = 3; char c = '1';

                   // converte char em inteiro. Ex: '1' -> 1
                  int res1 = Character.digit (c, 10);
                  
                  // converte inteiro em char. Ex: 1 -> '1'
                  char res2 = Character.forDigit (i, 10);
                  
                  System.out.println ("char -> int = " + res1);
                  System.out.println ("int -> char = " + res2);
               */   
   }}


