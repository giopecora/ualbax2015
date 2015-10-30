package Classes;

import java.sql.*;
import Classes.Produtos;
import javax.swing.JOptionPane;

public class ProdutosDAO {

    private Connection conexao;

    public ProdutosDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void adicionar(Produtos produto) throws SQLException {
        String sql = "INSERT INTO PRODUTOS (FK_FAMILIA, DESCRICAO, SALDO_ATUAL, SALDO_MIN, SALDO_MAX)VALUES(?,?,0,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        try {
            stmt.setString(2, produto.getDescricao().trim());
            stmt.setInt(1, produto.getFamilia());
            stmt.setDouble(3, produto.getSaldoMinimo());
            stmt.setDouble(4, produto.getSaldoMaximo());
            stmt.execute();
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, " [Erro ao processar adicionar " + sqlE.getMessage() + "]");
        } finally {
            stmt.close();
        }

    }

    public ResultSet pesquisar(String descricao) throws SQLException {

        String sql = "SELECT * FROM PRODUTOS WHERE DESCRICAO = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, descricao);
        ResultSet rs = stmt.executeQuery();
        
        return rs;
    }
    public ResultSet pesquisarPorId(int id) throws SQLException {

        String sql = "SELECT * FROM PRODUTOS WHERE ID_CODIGO= ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        
        return rs;
    }

}
