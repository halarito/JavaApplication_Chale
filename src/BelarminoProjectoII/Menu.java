/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BelarminoProjectoII;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author USER
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    void menu() {
        // TODO code application logic here
        
    JFrame janelamenu = new JFrame("Menu Pricipal");
    janelamenu.setSize (600,500);
    janelamenu.setLocationRelativeTo(janelamenu);
    janelamenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    JPanel painelmenu = new JPanel ();
    painelmenu.setLayout(null);
    painelmenu.setBackground(Color.orange);
    janelamenu.add(painelmenu);
    
    
    //Label
    JLabel LMenu = new JLabel ("Pagina Principal");
    LMenu.setBounds(200, 10, 200, 40);
    LMenu.setForeground(Color.black);
    Font fM = new Font("Tempus Sans ITC",Font.BOLD+Font.ITALIC,24);
    LMenu.setFont(fM);
    painelmenu.add(LMenu);
    
    //Calculadora
    JLabel Lcal = new JLabel ("Calculadora:");
    Lcal.setBounds(30, 210, 140, 30);
    Lcal.setForeground(Color.black);
    Font fcal = new Font("Tempus Sans ITC",Font.BOLD+Font.ITALIC,24);
    Lcal.setFont(fcal);
    painelmenu.add(Lcal);
    
    JLabel Lp = new JLabel("Potencia(KVA):");
    Lp.setBounds(30,250, 140, 20);
    JTextField tfp = new JTextField(150);
    //tfp.setForeground(Color.black);
    //tfp.setBackground(Color.black);
    tfp.setBounds(30, 270, 90, 20);
    painelmenu.add(Lp);
    painelmenu.add(tfp);
    
    //Combobox categorias
    String[] opcoes ={"1Cat","2Cat","3Cat","4Cat","5Cat"};
    JComboBox ListaOpcoes=new JComboBox(opcoes);
    ListaOpcoes.setBounds(125,270, 90, 20);
    ListaOpcoes.setSelectedIndex(1);
    painelmenu.add(ListaOpcoes);
    
    JLabel LC = new JLabel("Comprimento(Km):");
    LC.setBounds(220,250, 140, 20);
    JTextField tfC = new JTextField(150);
    tfC.setBounds(220, 270, 110, 20);
    painelmenu.add(LC);
    painelmenu.add(tfC);
    
    JLabel LT = new JLabel("Tensao(KV):");
    LT.setBounds(335,250, 140, 20);
    JTextField tfT = new JTextField(150);
    tfT.setBounds(335, 270, 90, 20);
    painelmenu.add(LT);
    painelmenu.add(tfT);
    
    JLabel LTE = new JLabel("Taxa Estabel...:");
    LTE.setBounds(30,320, 140, 20);
    JTextField tfTE = new JTextField(150);
    tfTE.setBounds(120, 320, 90, 20);
    painelmenu.add(LTE);
    painelmenu.add(tfTE);
    
    JLabel LTExp = new JLabel("Taxa Explorac.:");
    LTExp.setBounds(30,350, 140, 20);
    JTextField tfTExp = new JTextField(150);
    tfTExp.setBounds(120, 350, 90, 20);
    painelmenu.add(LTExp);
    painelmenu.add(tfTExp);
    
    //Botao
    JButton btnfuncio = new JButton ("1. FUNCIONARIOS");
    btnfuncio.setBounds(210, 70, 140, 30);
    btnfuncio.setForeground(Color.blue);
    painelmenu.add(btnfuncio);
    btnfuncio.addActionListener (new botaomen());
    
    
    JButton btnfonte = new JButton ("2. FONTES ENERGETICAS");
    btnfonte.setBounds(30, 140, 175, 30);
    btnfonte.setForeground(Color.blue);
    painelmenu.add(btnfonte);
    btnfonte.addActionListener (new botaomen());
    
    
    JButton btntitular = new JButton ("3. Titular");
    btntitular.setBounds(350, 140, 175, 30);
    btntitular.setForeground(Color.blue);
    painelmenu.add(btntitular);
    btntitular.addActionListener (new botaomen());
    
    JButton btncalcula = new JButton ("Calcular");
    btncalcula.setBounds(30, 370, 85, 20);
    btncalcula.setForeground(Color.red);
    btncalcula.setBackground(Color.orange);
    painelmenu.add(btncalcula);
    btncalcula.addActionListener (new botaomen());
    
    JButton btnsairm = new JButton ("Sair");
    btnsairm.setBounds(120, 410, 90, 30);
    btnsairm.setForeground(Color.blue);
    painelmenu.add(btnsairm);
    btnsairm.addActionListener (new botaomen());
    
    janelamenu.setVisible(true); 
    
    
    }


}
        

//evento

class botaomen implements ActionListener { 
    
    @Override
    public void actionPerformed (ActionEvent e) { 
        
        String str = e.getActionCommand(); 
                
        if (str.equals ("FUNCIONARIOS")) {java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadfonteEtitular().setVisible(true);
            }
        });          }
          
        else if(str.equals("FONTES ENERGETICAS")){
                                                }
        
        else if(str.equals("Titular")){}
        else if(str.equals("Calcular")){Calculadora calcula=new Calculadora();
                                                    calcula.Calculadora();}
        
        else if(str.equals("Sair")){System.exit(0);}
                
       
                                           }
        }
   

