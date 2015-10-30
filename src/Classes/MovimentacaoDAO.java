package Classes;

import Banco.ConexaoBanco;
import java.sql.Connection;

public class MovimentacaoDAO {
    
    private Connection conexao;
    public  MovimentacaoDAO(Connection conexao)
    {
      this.conexao = ConexaoBanco.getConexao();  
    }
}
