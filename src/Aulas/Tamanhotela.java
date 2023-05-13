/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aulas;

/**
 *
 * @author USER
 */

import java.awt.*;


public class Tamanhotela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double alt = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
double larg = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
int altura = (int) alt;
int largura = (int) larg;
       
 System.out.println("altura da tela:"+altura);
 System.out.println("largura da tela:"+largura);
        
    }
    
}
