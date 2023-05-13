/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aulas;
import java.awt.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NewMain {

    private static Component RootPane;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
       // int a=0;
        
       // int b=0;
        int a=0;
        int b=0;
        int soma=0;
              
        JOptionPane.showMessageDialog(RootPane,"introduza valor1 e valo2");
        
        Scanner l=new Scanner (System.in);
        a=l.nextInt(); //v2 menor que v1 [v1;v2] [5,1]
         
        b=l.nextInt(); 
        
       // int a = (int)c;
        //  int b = Integer.parseInt(""+y);
              a=a-1;
        //soma inteiros entre os dois
                   
        
       if(b<a){ for(int i=a;b<a;a--){soma=soma+a;}}     
                   
       else JOptionPane.showMessageDialog(RootPane,"O valor 2 deve ser menor que valor 1");
        
       JOptionPane.showMessageDialog(RootPane,"A soma e: " +soma);
              
            }}
    

