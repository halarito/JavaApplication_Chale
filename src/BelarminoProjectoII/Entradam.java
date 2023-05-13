/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BelarminoProjectoII;


import java.sql.*;
import Modulo.Conexao;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


// metodo Login

//Fim do login
    
public class Entradam {   
    
    JTextField Username = new JTextField (50);
public static void main(String[] args) {
      
    JFrame janela = new JFrame ("Login:Cadastro de Fontes Energeticas");
    janela.setSize (600,400);
    janela.setLocationRelativeTo(janela);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    JPanel painel = new JPanel ();
    painel.setLayout(null);
    
    //Logotipo
    ImageIcon icon=new ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\JavaApplication\\src\\BelarminoProjectoII\\Imagem\\Lotipojpg.jpg");
    JLabel LFoto = new JLabel();
    LFoto.setBounds(280, 10, 60, 60);
    LFoto.setIcon(icon);    
    painel.add(LFoto);
    
        
    //Label SPI
    JLabel Lspi = new JLabel ("SPI_Tete");
    Lspi.setBounds(240, 70, 200, 40);
    Lspi.setForeground(Color.black);
    Font fspi = new Font("Tahoma",Font.BOLD+Font.ITALIC,30);
    Lspi.setFont(fspi);
    painel.add(Lspi);
    
    
    //Usuario    
    JLabel LUsername = new JLabel ("Usuario/Username:");
    LUsername.setBounds(90, 120, 140, 20);
    painel.add(LUsername);
    
    
    Username.setBounds(210, 120, 225, 20);
    painel.add(Username);
    // ouvinte do botao usuario   
    Username.addActionListener (new botaoSair());

    
    //Senha
    JLabel LSenha = new JLabel ("Senha/Password:");
    LSenha.setBounds(90, 170, 200, 20);
    painel.add(LSenha);
    
    JTextField Senha = new JTextField (50);
    Senha.setBounds(210, 170, 225, 20);
    painel.add(Senha);
    // ouvinte do botao senha   
    Senha.addActionListener (new botaoSair());

    
    //Botao
    JButton btnSair = new JButton ("Sair");
    btnSair.setBounds(350, 220, 85, 20);
    btnSair.setForeground(Color.blue);
    painel.add(btnSair);
    // ouvinte do botao sair   
    btnSair.addActionListener (new botaoSair());
    
    JButton btnLogin = new JButton ("Entrar");
    btnLogin.setBounds(210, 220, 85, 20);    
    btnLogin.setForeground(Color.blue);
    painel.add(btnLogin);
    // ouvinte do botao Entrar   
    btnLogin.addActionListener (new botaoSair());
    
    
    janela.add(painel);

    janela.setVisible(true);
    
}}

//evento
 
class botaoSair implements ActionListener { 
    
    @Override
    public void actionPerformed (ActionEvent e) { 
       
        String str = e.getActionCommand();
        
        try{
        
       if(str.equals("Entrar")) { Conecta bn = new Conecta();
                                           bn.open();
           if (Username.getText().isEmpty()&& Senha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha os campos");
       
           }
           else {
               bn.pesquisar(Username.getText(), Senha.getText());
               
           }
                        }
       else if(str.equals("Sair")){System.exit(0);}
        
     }catch(Exception ex) { JOptionPane.showMessageDialog(null,ex);}}     
    } 
        
       /* switch (str) {
            case "Sair":
                System.exit(0);
                
               // JOptionPane.showMessageDialog(null,"Clicou para sair");
                break;
            case "Entrar":
                //Ir chamar a tela Menu
                Entrada mEntrada= new Entrada();
                mEntrada.login();
                
               // JOptionPane.showMessageDialog(null,"Clicou para Entrar");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Botão desconhecido.");
                break;
                      }*/
    
        






    
            



    
    