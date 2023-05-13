/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NewMainexercicio4;

/**
 *
 * @author USER
 */

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class NewMainexercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
JFrame janela = new JFrame("Janela Ola Mundo");
janela.setSize(300,300);

JPanel painel = new JPanel();
painel.setBackground(Color.orange);
janela.add(painel);

JLabel Nome = new JLabel("Nome");
Nome.setBounds(30,30,20,20);
painel.add(Nome);
JTextField Nomee = new JTextField(20);
painel.add(Nomee);

JLabel Senha = new JLabel("Senha");
painel.add(Senha);
JTextField Senhaa = new JTextField(20);
painel.add(Senhaa);

JButton btnEntrar = new JButton("Entrar");
painel.add(btnEntrar);

JButton btncancelar = new JButton("Cancelar");
painel.add(btncancelar);

janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//frame.setLocationRelativeTo(null);
janela.setVisible(true);
    }
    
}
