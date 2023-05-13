/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aulas;

/**
 *
 * @author USER
 */
public class Excepcao {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       System.out.println("Inicio do main");
       //try{
       metodo1();
       //}
       //catch(Exception e) {System.out.println("Dado desconhecido");}           
       System.out.println("fim do main");
    }
    
    static void metodo1(){
    System.out.println("inicio do metodo1");
    metodo2();
    System.out.println("fim do metodo1");
    }
       
    static void metodo2(){
    System.out.println("inicio do metodo2");
    
    try {
    int[]array= new int[10];
    for(int i = 0; i <= 15; i++){
    array[i] = i;
    System.out.println(i);
    }
    }
    catch(Exception e) {System.out.println("Erro Desconhecido");}
    System.out.println("fim do metodo2");
    }     
  
}
    

