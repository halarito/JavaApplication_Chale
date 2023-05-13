/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AgendaContactos;

/**
 *
 * @author USER
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conecta{
    static Connection con;
               static void getConexao () {
                    try {
                            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        }catch(ClassNotFoundException e) {
                                                           System.out.println("Classe do driver nao encontrada!");
                                                           System.exit(1);
                                                           }
                    try {
                           String url = "jdbc:mysql://localhost:3306/agenda";
                           con = DriverManager.getConnection(url, "root", "");
                           } catch (SQLException e) {
                           // TODO Auto-generated catch block
                          }
                          }
    
public static void main(String[] args) {
        // TODO code application logic here
        
String sql = "insert into contactos values (" ","Belarmino",20,12/03/1980)";


        try {Statement comandoSQL;
            comandoSQL = con.createStatement();
            int resultado = comandoSQL.executeUpdate(sql);
            comandoSQL.close();
        } catch (SQLException ex) {
            Logger.getLogger(conecta.class.getName()).log(Level.SEVERE, null, ex);
                                 }

        
    }

}
    
    

    /**
     * @param args the command line arguments
     */
    
    

