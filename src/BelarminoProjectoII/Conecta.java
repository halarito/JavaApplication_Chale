/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelarminoProjectoII;

import BelarminoChaleProjectoJava.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Conecta {
    
    private static PreparedStatement PrepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Connection conn;
    public PreparedStatement pstmt;
    public ResultSet rs; 
    
    public Connection open() { 
       
        try{
        Class.forName("com.mysql.jdbc.Driver");
        
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/edm", "root", "");
        
        JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
        return conn;
        
        }catch(Exception l){
        
             JOptionPane.showMessageDialog(null, l.getMessage());
        
        
                     }
    
    }
    
    public void Entrar(String texto1,String texto2) {
            
       String sql = "Select * from   funcionario  where usuario=? and senha=?";
        
        try {
            PreparedStatement pstmt = Conecta.PrepareStatement(sql);
            
            pstmt = Conecta.prepareStatement(sql);
            
            pstmt.setString(1, texto1);
            
            pstmt.setString(2, texto2);
            
           // String captura = new String(texto2.getPassword());
            
            //pst.setString(2, captura);
            
            ResultSet rs = pstmt.executeQuery();
             
            // a linha abaix obtem conteudo no campo perfil da tabela logine
             if (rs.next()) { if (texto1.equals(texto1)) { Menu men = new Menu();
                                                                    men.menu();
                                                                                        }
                              else{java.awt.EventQueue.invokeLater(new Runnable() {
                                    @Override
                                    public void run() { new Login().setVisible(true);}
                                       });  
                                  }

            } else {
                JOptionPane.showMessageDialog(null, "Invalido");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    
/*
public void pesquisar(String hg, String gh) {
        String sql = "select * from logar where Nome=? and Senha=?";
        try {
            pstmt= conn.prepareStatement(sql);
            pstmt.setString(1, hg );
            pstmt.setString(2, gh );
            rs = pstmt.executeQuery();
            if (rs.next()) {
               CompraVenda Tur = new CompraVenda();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario nao encontrado");
                // as linha abaixo limpa os campos

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
*/


    private void Excluir(String tfcodigo) {
        // a estrutura abaixo confirma a remocao do Cliente
        
        int confirma = JOptionPane.showConfirmDialog(null, "Tem Certeza Que Deseja apagar esta fonte?", "Antenção", JOptionPane.YES_NO_OPTION);
        
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from fonte where cod=?";
            try {
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, tfcodigo.getText());
                int apagado = pstmt.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Fonte Removida Com Exito");
                   //limparFonte();
                    //  btnAdicionar.setEnabled(true);
                   
                }
            } catch (Exception e) {
                                   JOptionPane.showMessageDialog(null, e);
                                   }
        }
    }
    

    
        public void Registar(String co,String tip,String nli, String nrec,String da,String di,String ba,String Po,String La,String Lo){
        String sql = "insert into fonte (cod,tipo_id,nr_licenca,nr_recibo,data_pag,distrito,bairro,Potencia,Latitude,Longitude) values(?,?,?,?,?,?,?,?,?,?)";
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, co);
            pstmt.setString(2, tip);
            pstmt.setString(3, nli);
            pstmt.setString(4, nrec);
            pstmt.setString(5, da);
            pstmt.setString(6, di);
            pstmt.setString(7, ba);
            pstmt.setString(8, Po);
            pstmt.setString(9, La);
            pstmt.setString(10, Lo);
            
           
            //validacao dos campos obrigaorios
           
            if ((co.getText().isEmpty()) || (nli.getText().isEmpty())|| (tip.getText().isEmpty())
                    || (ba.getText().isEmpty())|| (Po.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha Dividamente Os Campos Em Falta");
            
           //a linha abaixo atualiza a tabela usuarios  com os dados do formulario
           //a estrutura abaixo e usada para confirmar a insercao dos dados na tabela
                
                          
                         int adicionado = pstmt.executeUpdate();
                        if (adicionado > 0){  
                           {JOptionPane.showMessageDialog(null, "Fonte Adicionada Com Sucesso");                 
                               //limparFonte();
                               //TextFabricante.setText(null);
                                    }
                                       }
            }} catch (Exception e) {JOptionPane.showMessageDialog(null, e);
                                         }
        }
    
        
void limparFonte() {

        tfcodigo.setText(null);
        tftipoid.setText(null);
        tfnrlicenca.setText(null);
        tfrecibo.setText(null);
        tfdatapag.setText(null);
        tfdistrito.setText(null);
        tfbairro.setText(null);
        tfpotencia.setText(null);
        tflatitude.setText(null);
        tflongitude.setText(null);
        JOptionPane.showMessageDialog(null, "Todos os campos limpos");

    }

}




    
    
    
    

