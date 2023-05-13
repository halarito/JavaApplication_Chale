/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BelarminoProjectoII;


import Aulas.Calculadora;
import BelarminoChaleProjectoJava.Login;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


// Esta pronta
/**
 *
 * @author USER
 */
public class CadfonteEtitular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    JFrame janelafonte = new JFrame ("Formulario de Fontes x Titular");
    janelafonte.setSize (700,600);
    janelafonte.setLocationRelativeTo(janelafonte);
    janelafonte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    //janelafonte.setExtendedState(JFrame.MAXIMIZED_BOTH);          //Maximiza a tela
    
    JPanel painelfonte = new JPanel ();
    painelfonte.setLayout(null);
    
    
    //Titulo
    JLabel Ltitulo = new JLabel ("Fonte:");
    Ltitulo.setBounds(140, 5, 90, 50);
    Ltitulo.setForeground(Color.blue);
    Font fM = new Font("Tempus Sans ITC",Font.BOLD+Font.ITALIC,24);
    Ltitulo.setFont(fM);
    painelfonte.add(Ltitulo);
        
    JLabel Ltituloo = new JLabel ("Titular:");
    Ltituloo.setBounds(440, 5, 90, 50);
    Ltituloo.setForeground(Color.blue);
    Font fMM = new Font("Tempus Sans ITC",Font.BOLD+Font.ITALIC,24);
    Ltituloo.setFont(fMM);
    painelfonte.add(Ltituloo);
    
    //Radio do titulo
    JRadioButton Rfonte=new JRadioButton("",true);
    Rfonte.setBounds(220,20,20,20);
    painelfonte.add(Rfonte);
    JRadioButton Rtitular=new JRadioButton("",false);
    Rtitular.setBounds(530,20,20,20);
    painelfonte.add(Rtitular);
    
    //Label e Text Field Fonte
    JLabel Lcodigo = new JLabel("Codigo:");
    Lcodigo.setBounds(20,40, 100, 20);
    JTextField tfcodigo = new JTextField(150);
    tfcodigo.setBounds(100, 40, 140, 20);
    painelfonte.add(Lcodigo);
    painelfonte.add(tfcodigo);
    
    JLabel Ltipoid = new JLabel("Tipo_ID:");
    Ltipoid.setBounds(20,80,100,20);
    JTextField tftipoid = new JTextField(150);
    tftipoid.setBounds(100, 80, 140, 20);
    painelfonte.add(Ltipoid);
    painelfonte.add(tftipoid);
        
    JLabel Lnrlicenca = new JLabel("Nr_Licenca:");
    Lnrlicenca.setBounds(20,120,100,20);
    JTextField tfnrlicenca = new JTextField(150);
    tfnrlicenca.setBounds(100,120,140,20);
    painelfonte.add(Lnrlicenca);
    painelfonte.add(tfnrlicenca);
       
    JLabel Lrecibo = new JLabel("Nr_Recibo:");
        Lrecibo.setBounds(20,160,100,20);
        JTextField tfrecibo = new JTextField(150);
        tfrecibo.setBounds(100,160,140,20);
        painelfonte.add(Lrecibo);
        painelfonte.add(tfrecibo);    
        
    JLabel Ldatapag = new JLabel("Data_Pag:");
        Ldatapag.setBounds(20,200,100,20);
        JTextField tfdatapag = new JTextField(150);
        tfdatapag.setBounds(100,200,140,20);
        painelfonte.add(Ldatapag);
        painelfonte.add(tfdatapag);    
        
    JLabel Ldistrito = new JLabel("Distrito:");
        Ldistrito.setBounds(20,240,100,20);
        JTextField tfdistrito = new JTextField(150);
        tfdistrito.setBounds(100,240,140,20);
        painelfonte.add(Ldistrito);
        painelfonte.add(tfdistrito);    
        
    JLabel Lbairro = new JLabel("Bairro:");
        Lbairro.setBounds(20,280,100,20);
        JTextField tfbairro = new JTextField(150);
        tfbairro.setBounds(100,280,140,20);
        painelfonte.add(Lbairro);
        painelfonte.add(tfbairro);    
        
        
    JLabel Lpotencia = new JLabel("Potencia:");
        Lpotencia.setBounds(20,320,100,20);
        JTextField tfpotencia = new JTextField(150);
        tfpotencia.setBounds(100,320,140,20);
        painelfonte.add(Lpotencia);
        painelfonte.add(tfpotencia);    
        
    JLabel Latitudee = new JLabel("Latitude:");
        Latitudee.setBounds(20,360,100,20);
        JTextField tflatitude = new JTextField(150);
        tflatitude.setBounds(100,360,140,20);
        painelfonte.add(Latitudee);
        painelfonte.add(tflatitude);
        
    JLabel Longitudee = new JLabel("Longitude:");
        Longitudee.setBounds(20,400,100,20);
        JTextField tflongitude = new JTextField(150);
        tflongitude.setBounds(100,400,140,20);
        painelfonte.add(Longitudee);
        painelfonte.add(tflongitude);        
        
       //Label e Text Field Titular
    JLabel Lcodigot = new JLabel("Codigo:");
    Lcodigot.setBounds(330,40, 100, 20);
    JTextField tfcodigot = new JTextField(150);
    tfcodigot.setBounds(420, 40, 140, 20);
    painelfonte.add(Lcodigot);
    painelfonte.add(tfcodigot);
    
    JLabel Lnomet = new JLabel("Nome:");
        Lnomet.setBounds(330,80,100,20);
        JTextField tfnomet = new JTextField(150);
        tfnomet.setBounds(420, 80, 140, 20);
        painelfonte.add(Lnomet);
        painelfonte.add(tfnomet);
        
    JLabel Lnuitt = new JLabel("NUIT:");
        Lnuitt.setBounds(330,120,100,20);
        JTextField tfnuitt = new JTextField(150);
        tfnuitt.setBounds(420,120,140,20);
        painelfonte.add(Lnuitt);
        painelfonte.add(tfnuitt);        
       
       JLabel Ldistritot = new JLabel("Distrito:");
        Ldistritot.setBounds(330,160,100,20);
        JTextField tfdistritot = new JTextField(150);
        tfdistritot.setBounds(420,160,140,20);
        painelfonte.add(Ldistritot);
        painelfonte.add(tfdistritot);
        
        JLabel Lbairrot = new JLabel("Bairro:");
        Lbairrot.setBounds(330,200,100,20);
        JTextField tfbairrot = new JTextField(150);
        tfbairrot.setBounds(420,200,140,20);
        painelfonte.add(Lbairrot);
        painelfonte.add(tfbairrot);
        
        JLabel Ltelefone = new JLabel("Telefone:");
        Ltelefone.setBounds(330,240,100,20);
        JTextField tftelefone = new JTextField(150);
        tftelefone.setBounds(420,240,140,20);
        painelfonte.add(Ltelefone);
        painelfonte.add(tftelefone);
        
        JLabel Lemailt = new JLabel("email:");
        Lemailt.setBounds(330,280,100,20);
        JTextField tfemailt = new JTextField(150);
        tfemailt.setBounds(420,280,140,20);
        painelfonte.add(Lemailt);
        painelfonte.add(tfemailt);
        
        
        JLabel Lsite = new JLabel("Site:");
        Lsite.setBounds(330,320,100,20);
        JTextField tfsite = new JTextField(150);
        tfsite.setBounds(420,320,140,20);
        painelfonte.add(Lsite);
        painelfonte.add(tfsite);
        
        JLabel Lcodr = new JLabel("Cod_rep:");
        Lcodr.setBounds(330,360,100,20);
        JTextField tfcodr = new JTextField(150);
        tfcodr.setBounds(420,360,140,20);
        painelfonte.add(Lcodr);
        painelfonte.add(tfcodr);
        
                
    
    //Botao
       
    JButton btnSalvar = new JButton ("Salvar");
    btnSalvar.setBounds(105, 450, 85, 20);
    // ouvinte do botao salvar  
    //btnSalvar.addActionListener (new botaoft());
    btnSalvar.setForeground(Color.blue);
    
    
    painelfonte.add(btnSalvar);
    
    JButton btnEditar = new JButton ("Editar");
    btnEditar.setBounds(220, 450, 85, 20);
    // ouvinte do botao editar   
    //btnEditar.addActionListener (new botaoft());
    btnEditar.setForeground(Color.blue); 
    painelfonte.add(btnEditar);
    
    JButton btnApagar = new JButton ("Apagar");
    btnApagar.setBounds(325, 450, 85, 20);
    // ouvinte do botao apagar   
    //btnApagar.addActionListener (new botaoft());
    btnApagar.setForeground(Color.blue);   
    painelfonte.add(btnApagar);
    
    JButton btnvoltar = new JButton ("Voltar");
    btnvoltar.setBounds(430, 450, 85, 20);
    // ouvinte do botao apagar   
    btnvoltar.addActionListener (new botaoft());
    btnvoltar.setForeground(Color.blue);   
    painelfonte.add(btnvoltar);
    
    JButton btnlistarf = new JButton ("Listar");
    btnlistarf.setBounds(535, 450, 85, 20);
    // ouvinte do botao apagar   
    btnlistarf.addActionListener (new botaoft());
    btnlistarf.setForeground(Color.blue);   
    painelfonte.add(btnlistarf);
    
    
    janelafonte.add(painelfonte);
    janelafonte.setVisible(true);
             
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

//Classe do evento do botao atribuir

class botaoft implements ActionListener { 
    
    @Override
    public void actionPerformed (ActionEvent e) { 
        
        String str = e.getActionCommand(); 
                
        if (str.equals ("Voltar")) {Menu men=new Menu(); men.menu();}
          
        else if(str.equals("Listar")){TelaLista tl= new TelaLista();
                                               tl.Lista();
                                                }
        else if(str.equals("voltarlista")){
                                           java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadfonteEtitular().setVisible(true);
            }
        });          
                                           }
        }
}
