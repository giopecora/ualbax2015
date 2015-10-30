package Banco;
import java.sql.*;
import javax.swing.JOptionPane;

//Classe de conexão com o banco de dados
public class ConexaoBanco {
    
    Connection conexao = null;
    public static Connection getConexao()
    {
         try {
            Class.forName("org.sqlite.JDBC");
            Connection conexao = DriverManager.getConnection("jdbc:sqlite:E:\\Facu\\Pi2\\Banco_Ualbax\\Ualbax.db");
            
            return conexao;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}
