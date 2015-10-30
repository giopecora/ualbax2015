
package Classes;
import java.sql.*;
import Banco.ConexaoBanco;
import Classes.Familia;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FamiliaDAO {
    private Connection conexao;
    
    public  FamiliaDAO(Connection conexao)
    {
      this.conexao = ConexaoBanco.getConexao();  
    }
    public void adicionar(Familia familia) throws SQLException
    {
        String sql = "INSERT INTO FAMILIAS (DESCRICAO)VALUES(?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, familia.getDescricao());
        stmt.execute();
        stmt.close();

    }
    
    public ResultSet pesquisar(String nome) throws SQLException
    {
        String sql = "SELECT * FROM FAMILIAS WHERE DESCRICAO = ?";
        PreparedStatement stmt;
        stmt = conexao.prepareStatement(sql);
        //stmt.setString(1, '%' + nome + '%');
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        return rs;
    }
    public void alterar(int id, String descricao)
    {
        String sql = "UPDATE FAMILIAS SET DESCRICAO  = ? WHERE ID_FAMILIA =?";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, descricao);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(FamiliaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //stmt.setString(1, '%' + nome + '%');
    }
    
    public void excluir(int id)
    {
        String sql = "DELETE FROM FAMILIAS WHERE ID_FAMILIA = ?";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(FamiliaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
