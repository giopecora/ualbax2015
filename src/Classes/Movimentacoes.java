package Classes;

public class Movimentacoes {
    
    private int id_prod;
    private String data_entrada;
    private double quantidade;
    private char tipo;

    public Movimentacoes(int id_prod, String data_entrada, double quantidade, char tipo) {
        this.id_prod = id_prod;
        this.data_entrada = data_entrada;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public int getId_cod() {
        return id_prod;
    }

    public void setId_cod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    

           
    
}
