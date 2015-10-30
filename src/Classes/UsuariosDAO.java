package Classes;

import java.sql.*;
import Classes.Usuarios;
import javax.swing.JOptionPane;

public class UsuariosDAO {

    private Connection conexao;

    public UsuariosDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void adicionar(Usuarios usuario) throws SQLException {
        String sql = "INSERT INTO USUARIOS(NOME, USUARIO, SENHA)VALUES(?,?,?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, usuario.getNome());
        stm.setString(2, usuario.getUsuario());
        stm.setString(3, usuario.getSenha());
        stm.execute();
        stm.close();

    }

    public boolean pesquisa(String usuario, String Senha) throws SQLException {

        boolean result = false;
        String sql = "SELECT id_usuario FROM USUARIOS WHERE USUARIO = ? AND SENHA = ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        try {

            stm.setString(1, usuario);
            stm.setString(2, Senha);
            stm.execute();
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, " [Erro ao processar adicionar " + sqlE.getMessage() + "]");

        } finally {
            stm.close();
        }

        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            if (rs != null) {
                result = true;
            }
        }

        return false;
    }

}
