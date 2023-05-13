/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BelarminoProjectoII;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

// Falta tabela para listar
/**
 *
 * @author USER
 */
public class CadrepresentanteLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //void CadrepresentanteLista(){ }   
    JFrame janelafonte = new JFrame ("Formulario de Representante");
    janelafonte.setSize (700,600);
    janelafonte.setLocationRelativeTo(janelafonte);
    janelafonte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    JPanel painelfonte = new JPanel ();
    painelfonte.setLayout(null);
    
    
    //Titulo
    JLabel Ltitulo = new JLabel ("Representante:");
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
    
    //Combobox Pesquisar
    String[] opcoes ={"Codigo","Nome","BI"};
    JComboBox ListaOpcoes=new JComboBox(opcoes);
    ListaOpcoes.setBounds(420,40, 90, 20);
    ListaOpcoes.setSelectedIndex(1);
    painelfonte.add(ListaOpcoes);
    
    //botao
    JButton btnpesquisaf = new JButton ("Pesquisar");
    btnpesquisaf.setBounds(520, 40, 100, 20);
    // ouvinte do botao apagar   
    btnpesquisaf.addActionListener (new botaoatribuir());
    btnpesquisaf.setForeground(Color.blue);   
    painelfonte.add(btnpesquisaf);
     
    
    //Label e Text Field Representante
    JLabel Lcodrep = new JLabel("Codigo:");
    Lcodrep.setBounds(20,40, 100, 20);
    JTextField tfcodrep = new JTextField(150);
    tfcodrep.setBounds(100, 40, 140, 20);
    painelfonte.add(Lcodrep);
    painelfonte.add(tfcodrep);
    
    JLabel Lnomer = new JLabel("Nome:");
    Lnomer.setBounds(20,80,100,20);
    JTextField tfnomer = new JTextField(150);
    tfnomer.setBounds(100, 80, 140, 20);
    painelfonte.add(Lnomer);
    painelfonte.add(tfnomer);
        
    JLabel LBI = new JLabel("BI:");
    LBI.setBounds(20,120,100,20);
    JTextField tfBI = new JTextField(150);
    tfBI.setBounds(100,120,140,20);
    painelfonte.add(LBI);
    painelfonte.add(tfBI);
       
    JLabel Lres = new JLabel("Residencia:");
        Lres.setBounds(20,160,100,20);
        JTextField tfres = new JTextField(150);
        tfres.setBounds(100,160,140,20);
        painelfonte.add(Lres);
        painelfonte.add(tfres);    
        
            
        JLabel Lemailr = new JLabel("Email:");
        Lemailr.setBounds(20,200,100,20);
        JTextField tfemailr = new JTextField(150);
        tfemailr.setBounds(100,200,140,20);
        painelfonte.add(Lemailr);
        painelfonte.add(tfemailr);    
        
            
        JLabel Lcelf = new JLabel("Celular:");
        Lcelf.setBounds(20,240,100,20);
        JTextField tfcelf = new JTextField(150);
        tfcelf.setBounds(100,240,140,20);
        painelfonte.add(Lcelf);
        painelfonte.add(tfcelf);  
                  
    //Botao
       
    JButton btnSalvarf = new JButton ("Salvar");
    btnSalvarf.setBounds(165, 450, 85, 20);
    // ouvinte do botao salvar  
    //btnSalvarf.addActionListener (new botaoatribuir());
    btnSalvarf.setForeground(Color.blue);    
    painelfonte.add(btnSalvarf);
    
    JButton btnEditarf = new JButton ("Editar");
    btnEditarf.setBounds(260, 450, 85, 20);
    // ouvinte do botao editar   
    //btnEditarf.addActionListener (new botaoatribuir());
    btnEditarf.setForeground(Color.blue); 
    painelfonte.add(btnEditarf);
    
    JButton btnApagarf = new JButton ("Apagar");
    btnApagarf.setBounds(355, 450, 85, 20);
    // ouvinte do botao apagar   
    //btnApagarf.addActionListener (new botaoatribuir());
    btnApagarf.setForeground(Color.blue);   
    painelfonte.add(btnApagarf);
    
    JButton btnvoltarf = new JButton ("Voltar");
    btnvoltarf.setBounds(450, 450, 85, 20);
    // ouvinte do botao apagar   
    //btnvoltarf.addActionListener (new botaoatribuir());
    btnvoltarf.setForeground(Color.blue);   
    painelfonte.add(btnvoltarf);
    
    //Jtable se adiciona ao Frame ou Janela 
    
   //try { 
   JTable tabelar=new JTable();
    tabelar.setBounds(260,80,360,180);
    janelafonte.add(tabelar);
    /*
    String [] colunas={"Codigo","Nome","BI","Celular"};
    DefaultTableModel modelo=(DefaultTableModel)(new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;}});
      
    modelo.setColumnIdentifiers(colunas);
    modelo.setRowCount(0);
    Object[]objectos=new Object[4];
    
    objectos[0]="1";
    objectos[1]="Manuel";
    objectos[2]="1223344Q";
    objectos[3]="845675098";
    modelo.addRow(objectos);
    
    tabelar.setModel(modelo);
    }
   Catch(Exception e) {JOptionPane.showMessageDialog(null,e);}*/
    
    //Fim da tabela
    
    
    janelafonte.add(painelfonte);
    janelafonte.setVisible(true); 
       }
    }
    
    
    
    
    

        
    
    

