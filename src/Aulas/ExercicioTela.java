

package Aulas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ExercicioTela {

   
    public static void main(String[] args) {
        
        JFrame Tela = new JFrame("Tela");
        Tela.setSize(600,400);
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tela.setLocationRelativeTo(null);
        
        JMenuBar Menu = new JMenuBar();
        Tela.setJMenuBar(Menu);
        
        JMenu Arquivar = new JMenu("Arquivar");
        Menu.add(Arquivar);
        JMenu Editar = new JMenu("Editar");
        Menu.add(Editar);
        JMenu Visualizar = new JMenu("Visualizar");
        Menu.add(Visualizar);
        
       JPanel painel = new JPanel();
       
       painel.setBackground(Color.LIGHT_GRAY); 
       painel.setLayout(null);
       
       
        JLabel lem = new JLabel("E-mail");
        lem.setBounds(100, 40, 40, 30);               
        painel.add(lem);
        
        JTextField tem = new JTextField(150);
        tem.setBounds(140,40,300,30);
        painel.add(tem);
        
        JButton bp =new JButton ("Pesquisar");
        bp.setBounds(140,100,100,30);
        painel.add(bp);
        
        JButton bc = new JButton("Cancelar");
        bc.setBounds(300,100,100,30);
        painel.add(bc);
        
                     
        String [] colunas={"Codigo","Nome","Email"};        
        
        Object[][] dados ={{"1","Belarmino","@gamil.com"},
                           {"2","joao","@gmail.com"},
                           {"3","manuel","@gmail.com"}
                           };
        JTable tabela = new JTable(dados,colunas);
       
// tabela.setBounds(60, 160, 200, 200);
        
        painel.add(tabela);
        
        JScrollPane barraRolagem = new JScrollPane(tabela);
        painel.add(barraRolagem);
        
        
        Tela.add(painel);
        
        Tela.setVisible(true);
        
      /// Tela.getContentPane().add(Botao); Aula de eventos
        
    }
    
}
