/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    
    public static Connection abrirConexao(){
        Connection con = null;
        
        try{
            String url = "jdbc:mysql://localhost/sistema?user=root&password=";
            con = (Connection) DriverManager.getConnection(url);
            //JOptionPane.showMessageDialog(null,"Conectou");
           
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"Erro ao conectar","Erro", JOptionPane.ERROR_MESSAGE);
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"Erro","Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return con;    
    }
    
   public static void fecharConexao(com.mysql.jdbc.Connection con){
        try{
            con.close();
        }catch(SQLException e){
            e.getMessage();
        }
    }
   
    public static void main(String[] args) {
        abrirConexao();
    }
}
