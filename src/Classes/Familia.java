
package Classes;

public class Familia {
    
    private String descricao;
    
    public Familia(String descricao)
    {
        this.descricao = descricao;
    }
    
    
    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }
    
    public boolean verficaCampos(Familia familia)
    {
        boolean vfCampos=false;
        
        if(!familia.descricao.equalsIgnoreCase(""))
        {
            vfCampos=true;
        }
        
        
        return vfCampos;        
    }
        
    
}
