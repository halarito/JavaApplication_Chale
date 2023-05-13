/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AgendaContactos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class FabricaConexoes {
    
    public static Connection conector(){
        
        Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
     
        try {
            Class.forName(driver);
            
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "");
            return conexao;
             } 
        catch (Exception e) {
        
                            return null;
                           }
    
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Connection conn=conector();
        
        if(conn!=null){System.out.println("Conexao obtida com sucesso!"+conn);
                        conn.close();
                      }
                                                            }
    
}
