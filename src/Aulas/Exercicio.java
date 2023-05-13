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
//import java.io.IOException;
import java.util.Scanner;

//class Media {
//CalcularMedia (double notaa, double notab, double notac) { return (notaa+notab+notac)/3;
//       }}
//throws IOException
public class Exercicio {
      
    public static void main(String[] args){ // throws IOExc responde ao sistem.in.read
        
       // int nrnotas=1;
       // int nrest=0;
        int nrtt=0;
        int nrtotal;
        //int k=0;
        //int j=0;
        double nota; //s []= new double[nrtt];
       
        String nome; //[]= new String [nrest];
        
        Scanner l= new Scanner(System.in);
        
        
        System.out.println("Bem Vindo ao Programa de Calculo de Media\nCadastre os estudantes");
        
        System.out.println("Digite o nr total dos estudantes");
        nrtotal=l.nextInt();
       // nrtotal=nrtotal+1;
        
        System.out.println("Digite o nr de testes");
        nrtt=l.nextInt();
        
        //nrtt=nrtt+1;
        //k=nrtt;
     
        
        for (int i=0;i<=nrtotal;i++){if(i!=nrtotal){ int k=i+1; 
                                                     System.out.println("Digite o nome "+k+" do estudante");     
                                                     nome =l.nextLine();
                                                     //nome[i]= nomee;
                                                     System.in.read( ); //=Input.next();c=System.in.read()
                                                     String [] nomee=new String [nrtotal];
                                                     nomee[i]=nome;
                                                     System.out.println(nome); }
                                    
                                    else {System.out.println("Digite os testes do estudante");
                                                 
                                         }
        
                                      }
        
        for (int j=0;j<nrtt;j++){nota=l.nextDouble(); 
                                 double notas[]= new double [nrtt];
                                 notas[j]=nota;}                                                          
         //System.out.println("Digite os testes estudante");                           
                                  
        //for (int j=1;j<nrtt;j++){notas [j]=l.nextDouble();}
                                  
        
                                             
                        
       /*System.out.println("Escolha oque deseja efectuar:");
       System.out.println("1-Saber estudante com nota negativa\n2-Conhecer estudante com maior nota\n3-Saber estudantes com maoir nota");
       int sw=l.nextInt();*/
    
    }}
       /*
       
       switch(sw) { case 1: for(int i=1;i<nrtt;i++) { If (notas[i]<c){c=notas[i]};
                                                      else {c=c;}
                                                      
                                                      System.out.println(nome[i]); break;}}
                                                                              
       
                   } 
                     case 2: System.out.println("A maior nota e:"+nota); break;
                     case 1: System.out.println("Os estudantes com maior nota:"+nrest"-"+nome); break;
    }
                                          
        
        
        
        /*
        //int j=0;
        int nrt; //nomero de testes
        int aj;  //variavel ajustar notas
        double a,b,c; //notas
        double ac=0;  //acumulador de notas, inicializadas estao dentro de um metodo for
        double axac=0; //Auxiliar  ac
        double resul=0; //Soma das notas 
        
        Scanner l = new Scanner(System.in);
        
        System.out.println("Digite 3 notas e ache a media");
        
        a=l.nextDouble();
        b=l.nextDouble();
        c=l.nextDouble();
        
        double media = (a+b+c)/3;
        System.out.println("A sua Media e = " + media);
        
        System.out.println("1-Ajustar as notas  2-Ficou satisfeito");
        
        aj=l.nextInt();
        
        if (aj==1){ System.out.println("Quantos testes Realizou?");
                   
                   //Receber valor da variavel nrt (numero de testes)
                   nrt=l.nextInt();
                   
                   //criar vector de nrt espacos
                   double notas []= new double [nrt]; 
                   
                   System.out.println("Digite as notas");
                   
                          //receber e guardar notas no vetor notas                   
                   for (int j=0; j<nrt; j++) {notas[j]=l.nextDouble();                                                                            
                                               }
                          //somar os valores do vetor                  
                   for (int j=0; j<nrt; j++) {ac=notas[j];
                                              
                                              resul=axac+ac;
                                              axac=resul;
                                            }
                   media = resul/nrt;
                   
                   System.out.println("A sua Media e = " + media);
                   }
        
        else { System.out.println("Obrigado pelo retorno");
                  };              
        */        
                        
                  
           
         
    
                        
