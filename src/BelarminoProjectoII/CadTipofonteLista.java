/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BelarminoProjectoII;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


// Falta tabela dos tipos de fonte
/**
 *
 * @author USER
 */
public class CadTipofonteLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame janelafonte = new JFrame ("Formulario de Tipo de Fonte");
    janelafonte.setSize (700,600);
    janelafonte.setLocationRelativeTo(janelafonte);
    janelafonte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    JPanel painelfonte = new JPanel ();
    painelfonte.setLayout(null);
    
    
    //Titulo
    JLabel Ltitulo = new JLabel ("Tipo de Fonte:");
    Ltitulo.setBounds(100, 5, 170, 50);
    Ltitulo.setForeground(Color.blue);
    Font fM = new Font("Tempus Sans ITC",Font.BOLD+Font.ITALIC,24);
    Ltitulo.setFont(fM);
    painelfonte.add(Ltitulo);
    
    JLabel Ltituloo = new JLabel ("Lista:");
    Ltituloo.setBounds(420, 5, 200, 50);
    Ltituloo.setForeground(Color.blue);
    Font fMM = new Font("Tempus Sans ITC",Font.BOLD+Font.ITALIC,24);
    Ltituloo.setFont(fMM);
    painelfonte.add(Ltituloo);
    
    //Label e Text Field tipo de fonte
    JLabel Lcodt = new JLabel("Codigo:");
    Lcodt.setBounds(20,40, 100, 20);
    JTextField tfcodt = new JTextField(150);
    tfcodt.setBackground(Color.yellow);
    tfcodt.setBounds(100, 40, 140, 20);
    painelfonte.add(Lcodt);
    painelfonte.add(tfcodt);
    
    JLabel Ltipo = new JLabel("Tipo:");
    Ltipo.setBounds(20,80,100,20);
    JTextField tftipo = new JTextField(150);
    tftipo.setBounds(100, 80, 140, 20);
    painelfonte.add(Ltipo);
    painelfonte.add(tftipo);
        
    JLabel Lsig = new JLabel("Sigla:");
    Lsig.setBounds(20,120,100,20);
    JTextField tfsig = new JTextField(150);
    tfsig.setBounds(100,120,140,20);
    painelfonte.add(Lsig);
    painelfonte.add(tfsig);
       
    JLabel Lcat = new JLabel("Categoria:");
    Lcat.setBounds(20,160,100,20);
    JTextField tfcat = new JTextField(150);
        tfcat.setBounds(100,160,140,20);
        painelfonte.add(Lcat);
        painelfonte.add(tfcat);            
                          
    //Botao
       
    JButton btnSalvartf = new JButton ("Salvar");
    btnSalvartf.setBounds(100, 450, 85, 20);
    // ouvinte do botao salvar  
    //btnSalvartf.addActionListener (new botaoatribuir());
    btnSalvartf.setForeground(Color.blue);    
    painelfonte.add(btnSalvartf);
    
    JButton btnEditartf = new JButton ("Editar");
    btnEditartf.setBounds(205, 450, 85, 20);
    // ouvinte do botao editar   
    //btnEditartf.addActionListener (new botaoatribuir());
    btnEditartf.setForeground(Color.blue); 
    painelfonte.add(btnEditartf);
    
    JButton btnApagartf = new JButton ("Apagar");
    btnApagartf.setBounds(310, 450, 85, 20);
    // ouvinte do botao apagar   
    //btnApagartf.addActionListener (new botaoatribuir());
    btnApagartf.setForeground(Color.blue);   
    painelfonte.add(btnApagartf);
    
    JButton btnmenutf = new JButton ("Menu");
    btnmenutf.setBounds(415, 450, 85, 20);
    // ouvinte do botao apagar   
    //btnmenutf.addActionListener (new botaoatribuir());
    btnmenutf.setForeground(Color.blue);   
    painelfonte.add(btnmenutf);
    
    JButton btnlistt = new JButton ("Listar");
    btnlistt.setBounds(520, 450, 85, 20);
    // ouvinte do botao apagar   
    //btnlistt.addActionListener (new botaoatribuir());
    btnlistt.setForeground(Color.blue);   
    painelfonte.add(btnlistt);
    
    
    
    
    
    
    
    janelafonte.add(painelfonte);
    janelafonte.setVisible(true);

        
        
        
        
    }
    
}
