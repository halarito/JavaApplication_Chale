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

/**
 *
 * @author USER
 */
public class atribuititular {

    
    //Falta tabelas
    /*** 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    JFrame janelatitular = new JFrame ("Lista Fonte X Titular");
    janelatitular.setSize (700,600);
    janelatitular.setLocationRelativeTo(janelatitular);
    janelatitular.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    JPanel paineltitular = new JPanel ();
    paineltitular.setLayout(null);
       
    //Titulo
    JLabel Ltitulo = new JLabel ("Fonte:");
    Ltitulo.setBounds(140, 5, 90, 50);
    Ltitulo.setForeground(Color.blue);
    Font fF = new Font("Tahoma",Font.BOLD+Font.ITALIC,24);
    Ltitulo.setFont(fF);
    paineltitular.add(Ltitulo);
        
    JLabel Ltituloo = new JLabel ("Titular:");
    Ltituloo.setBounds(440, 5, 90, 50);
    Ltituloo.setForeground(Color.blue);
    Font fMM = new Font("Tahoma",Font.BOLD+Font.ITALIC,24);
    Ltituloo.setFont(fMM);
    paineltitular.add(Ltituloo);
    
    //Botao
       
    JButton btnatrib = new JButton ("Atribuir");
    btnatrib.setBounds(105, 450, 85, 20);
    // ouvinte do botao salvar  
    btnatrib.addActionListener (new botaoatribuir());
    btnatrib.setForeground(Color.blue);    
    paineltitular.add(btnatrib);
    
    JButton btnlist = new JButton ("Listar");
    btnlist.setBounds(220, 450, 85, 20);
    // ouvinte do botao editar   
    btnlist.addActionListener (new botaoatribuir());
    btnlist.setForeground(Color.blue); 
    paineltitular.add(btnlist);
    
    JButton btnvoltarl = new JButton ("Voltar");
    btnvoltarl.setBounds(325, 450, 85, 20);
    // ouvinte do botao apagar   
    btnvoltarl.addActionListener (new botaoatribuir());
    btnvoltarl.setForeground(Color.blue);   
    paineltitular.add(btnvoltarl);
    
    JButton btnmenul = new JButton ("Menu");
    btnmenul.setBounds(430, 450, 85, 20);
    // ouvinte do botao apagar   
    btnmenul.addActionListener (new botaoatribuir());
    btnmenul.setForeground(Color.blue);   
    paineltitular.add(btnmenul);
    
    
    
    
    janelatitular.add(paineltitular);
    janelatitular.setVisible(true);
    
    }
    
}
