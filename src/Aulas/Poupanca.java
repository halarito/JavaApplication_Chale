/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aulas;

//import java.awt.*; 
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Poupanca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        JFrame f = new JFrame("Popanca");
        f.setSize(400,350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        JPanel p = new JPanel();
        p.setBackground(Color.LIGHT_GRAY);
        p.setLayout(null);
        
        JLabel l1 = new JLabel("Valor a Depositar");
        l1.setBounds(20,40, 150, 20);
        JTextField t1 = new JTextField(150);
        t1.setBounds(170, 40, 100, 20);
        
        JLabel l2 = new JLabel("Juros");
        l2.setBounds(20,80,150,20);
        JTextField t2 = new JTextField(150);
        t2.setBounds(170, 80, 100, 20);
        
        JLabel l3 = new JLabel("Anos");
        l3.setBounds(20,120,150,20);
        JTextField t3 = new JTextField(150);
        t3.setBounds(170,120,100,20);
        
        JLabel l4 = new JLabel("Total Poupado");
        l4.setBounds(20,180,150,20);
        JTextField t4 = new JTextField(150);
        t4.setBounds(170,180,100,20);
       
        JButton b1= new JButton("OK");
        b1.setBounds(190,220,60,20);
        
        b1.addActionListener (new TratadorDeBotao());
        
        p.add(l1);
        p.add(t1);
        
        p.add(l2);
        p.add(t2);
        
        p.add(l3);
        p.add(t3);
        
        p.add(l4);
        p.add(t4);
        
        p.add(b1);
        
        f.add(p);
        f.setVisible(true);
          
    }
    
}

class TratadorDeBotao implements ActionListener { 
    public void actionPerformed (ActionEvent e) { 
        String str = e.getActionCommand(); 
        
        
        if (str.equals ("OK")) 
            t1.setText("null");} 
}