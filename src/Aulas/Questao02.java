/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aulas;

/**
 *
 * @author USER
 */
//import java.awt.*;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Questao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir");
        System.out.print("informe o primeiro valor");
        int x = teclado.nextInt();
        System.out.print("Informe o segundo valor");
        int y = teclado.nextInt();
       
        try{ double r = x/y;
           System.out.println("o resultado da soma e" + r);}
        
        catch(Exception e) {System.out.println("Dado Invalido");}
               
        
    }}
    

