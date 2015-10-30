
package Classes;


public class Usuarios {
    
    private String nome;
    private String usuario;
    private String senha;

    public Usuarios(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean verficaCampos(Usuarios usuario)
    {
        boolean vfCampos = false;
        if (! (usuario.nome.equalsIgnoreCase("")||
                usuario.usuario.equalsIgnoreCase("")||
                usuario.senha.equalsIgnoreCase("")))
        {
            vfCampos = true;
        }
        return vfCampos;
               
    }
    
}
