/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aulas;

import java.util.Scanner;
        
public class Main {
    
    public static void main (String[] args) {
        
        Calculadora c = new Calculadora();
        
        double a,b;
        
        Scanner l = new Scanner (System.in);
      
        System.out.println("Digite dois Numeros");
        
        a=l.nextDouble();
        b=l.nextDouble();
        
        System.out.println("1-SOMA\n 2-SUB \n 3-MULT \n 4-DIV");
        
        System.out.println("Escolha uma Opcao");
        
        int o =l.nextInt();
        
        switch(o) {
            case 1: System.out.println(c.somar(a,b)); break;
            case 2: c.subtrair(a,b); break;
            case 3: System.out.println(c.multiplicar(a,b)); break;
            case 4: System.out.println(c.dividir(a,b)); break;
                  }
                                             }}
