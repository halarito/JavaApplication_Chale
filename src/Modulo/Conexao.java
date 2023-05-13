package Modulo;


import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    
    public static Connection conector(){
        
        Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
     
        try {
            Class.forName(driver);
            
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/edm", "root", "");
            return conexao;
             } 
        catch (Exception e) {JOptionPane.showMessageDialog(null,e);
        
                            }
        return null;
    
    }
    
    //Metodo main para testar a conexao
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Connection conn=conector();
        
        if(conn!=null){JOptionPane.showMessageDialog(null,"Conexao obtida com sucesso!"+conn);
                
                              //System.out.println("Conexao obtida com sucesso!"+conn);
                        conn.close();
                      }
                                                            }
    //termina main
    
}
