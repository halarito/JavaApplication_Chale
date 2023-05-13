/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class TelaLista {
    
    void Lista (){
    
    JFrame janelafonte = new JFrame ("Lista de Fonte");
    janelafonte.setSize (700,600);
    janelafonte.setLocationRelativeTo(janelafonte);
    janelafonte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    JPanel painelfonte = new JPanel ();
    painelfonte.setLayout(null);
    
    
    //Titulo
    JLabel Ltitulo = new JLabel ("Lista de Fontes");
    Ltitulo.setBounds(300, 70, 200, 50);
    Ltitulo.setForeground(Color.blue);
    Font fM = new Font("Tempus Sans ITC",Font.BOLD+Font.ITALIC,24);
    Ltitulo.setFont(fM);
    painelfonte.add(Ltitulo);
    
    //combobox pesquisar
    String[] opcoes ={"Vedacao Electrica","Posto Transformacao","Moageria","Gerador"};
    JComboBox ListaOpcoestf=new JComboBox(opcoes);
    ListaOpcoestf.setBounds(200,40, 160, 20);
    ListaOpcoestf.setSelectedIndex(1);
    painelfonte.add(ListaOpcoestf);  
    
    // Campo de pesquisa
    JTextField tfpesf = new JTextField(150);
    tfpesf.setBounds(370,40, 190, 20);
    painelfonte.add(tfpesf);
    
    // Botao 
    JButton btnpf = new JButton ("Pesquisar");
    btnpf.setBounds(570, 40, 100, 20);
    // ouvinte do botao apagar   
    //btnpf.addActionListener (new botaoatribuir());
    btnpf.setForeground(Color.blue);   
    painelfonte.add(btnpf);
                         
    //Botao
           
    JButton btnSf = new JButton ("Sair");
    btnSf.setBounds(195, 450, 95, 20);
    // ouvinte do botao editar   
    btnSf.addActionListener (new botaotl());
    btnSf.setForeground(Color.blue); 
    painelfonte.add(btnSf);
    
    JButton btnCadf = new JButton ("Cadastrar");
    btnCadf.setBounds(300, 450, 95, 20);
    btnCadf.setForeground(Color.blue);   
    painelfonte.add(btnCadf);
    
    // ouvinte do botao Cadastrar   
   // btnCadf.addActionListener (new botaotl());
    btnCadf.addActionListener( (ActionListener) this);         
    
    janelafonte.add(painelfonte);
    janelafonte.setVisible(true);
}
      
    
}

//evento

class botaotl implements ActionListener { 
    
    @Override
    public void actionPerformed (ActionEvent e) { 
        
        String str = e.getActionCommand(); 
                
        if (str.equals ("Cadastrar")) {
                                                   //CadfonteEtitular cad=new CadfonteEtitular();
                   
        }
          
        else if(str.equals("Sair")){System.exit(0);
                                                }
       
                                           }
        }
