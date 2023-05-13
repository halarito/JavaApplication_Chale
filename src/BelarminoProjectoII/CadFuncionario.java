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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class CadFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    JFrame janelafonte = new JFrame ("Formulario de Funcionarios X Departamento");
    janelafonte.setSize (600,600);
    janelafonte.setLocationRelativeTo(janelafonte);
    janelafonte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    JPanel painelfonte = new JPanel ();
    painelfonte.setLayout(null);
    
    
    //Titulo
    JLabel Ltitulo = new JLabel ("Funcionario:");
    Ltitulo.setBounds(100, 5, 140, 50);
    Ltitulo.setForeground(Color.blue);
    Font fM = new Font("Tempus Sans ITC",Font.BOLD+Font.ITALIC,24);
    Ltitulo.setFont(fM);
    painelfonte.add(Ltitulo);
        
    
    //Label e Text Field Funcionario
    JLabel Lcodigo = new JLabel("Codigo:");
    Lcodigo.setBounds(20,40, 100, 20);
    JTextField tfcodigo = new JTextField(150);
    tfcodigo.setBackground(Color.yellow);
    tfcodigo.setBounds(100, 40, 140, 20);
    painelfonte.add(Lcodigo);
    painelfonte.add(tfcodigo);
    
    JLabel Lnomef = new JLabel("Nome:");
    Lnomef.setBounds(20,80,100,20);
    JTextField tfnomef = new JTextField(150);
    tfnomef.setBounds(100, 80, 140, 20);
    painelfonte.add(Lnomef);
    painelfonte.add(tfnomef);
        
    JLabel Lnuitf = new JLabel("NUIT:");
    Lnuitf.setBounds(20,120,100,20);
    JTextField tfnuitf = new JTextField(150);
    tfnuitf.setBounds(100,120,140,20);
    painelfonte.add(Lnuitf);
    painelfonte.add(tfnuitf);
       
    JLabel Ldep = new JLabel("Departament:");
        Ldep.setBounds(20,160,100,20);
        JTextField tfdep = new JTextField(150);
        tfdep.setBounds(100,160,140,20);
        painelfonte.add(Ldep);
        painelfonte.add(tfdep);    
        
    JLabel Lfuncao = new JLabel("Categoria:");
        Lfuncao.setBounds(20,200,100,20);
        JTextField tfuncao = new JTextField(150);
        tfuncao.setBounds(100,200,140,20);
        painelfonte.add(Lfuncao);
        painelfonte.add(tfuncao);    
        
    JLabel LdataN = new JLabel("DataNomeac:");
        LdataN.setBounds(20,240,100,20);
        JTextField tfdataN = new JTextField(150);
        tfdataN.setBounds(100,240,140,20);
        painelfonte.add(LdataN);
        painelfonte.add(tfdataN);    
        
    JLabel Lcelf = new JLabel("Celular:");
        Lcelf.setBounds(20,280,100,20);
        JTextField tfcelf = new JTextField(150);
        tfcelf.setBounds(100,280,140,20);
        painelfonte.add(Lcelf);
        painelfonte.add(tfcelf);    
        
        
    JLabel Luser = new JLabel("Usuario:");
        Luser.setBounds(20,320,100,20);
        JTextField tfuser = new JTextField(150);
        tfuser.setBounds(100,320,140,20);
        painelfonte.add(Luser);
        painelfonte.add(tfuser);    
        
    JLabel Lsenha = new JLabel("Senha:");
        Lsenha.setBounds(20,360,100,20);
        JTextField tfsenha = new JTextField(150);
        tfsenha.setBounds(100,360,140,20);
        painelfonte.add(Lsenha);
        painelfonte.add(tfsenha);
        
    JLabel Lemail = new JLabel("Email:");
        Lemail.setBounds(20,400,100,20);
        JTextField tfemail = new JTextField(150);
        tfemail.setBounds(100,400,140,20);
        painelfonte.add(Lemail);
        painelfonte.add(tfemail);        
                
    //Botao
       
    JButton btnSalvarf = new JButton ("Salvar");
    btnSalvarf.setBounds(105, 450, 85, 20);
    // ouvinte do botao salvar  
    //btnSalvarf.addActionListener (new botaoatribuir());
    btnSalvarf.setForeground(Color.blue);    
    painelfonte.add(btnSalvarf);
    
    JButton btnEditarf = new JButton ("Editar");
    btnEditarf.setBounds(220, 450, 85, 20);
    // ouvinte do botao editar   
    //btnEditarf.addActionListener (new botaoatribuir());
    btnEditarf.setForeground(Color.blue); 
    painelfonte.add(btnEditarf);
    
    JButton btnApagarf = new JButton ("Apagar");
    btnApagarf.setBounds(325, 450, 85, 20);
    // ouvinte do botao apagar   
    //btnApagarf.addActionListener (new botaoatribuir());
    btnApagarf.setForeground(Color.blue);   
    painelfonte.add(btnApagarf);
    
    JButton btnvoltarf = new JButton ("Voltar");
    btnvoltarf.setBounds(430, 450, 85, 20);
    // ouvinte do botao apagar   
    //btnvoltarf.addActionListener (new botaoatribuir());
    btnvoltarf.setForeground(Color.blue);   
    painelfonte.add(btnvoltarf);
    
    
    
    
    janelafonte.add(painelfonte);
    janelafonte.setVisible(true);

        
        
    }
    
}
