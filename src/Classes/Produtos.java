package Classes;

public class Produtos {

    private String descricao;
    private int familia;
    private double saldoMinimo;
    private double saldoMaximo;
    private double saldoAtual;

    public Produtos(String descricao, int familia, double saldoMin, double saldoMax) {
        this.descricao = descricao;
        this.familia = familia;
        saldoMinimo = saldoMin;
        saldoMaximo = saldoMax;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    /**
     * @return the saldoMinimo
     */
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    /**
     * @param saldoMinimo the saldoMinimo to set
     */
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    /**
     * @return the saldoMaximo
     */
    public double getSaldoMaximo() {
        return saldoMaximo;
    }

    /**
     * @param saldoMaximo the saldoMaximo to set
     */
    public void setSaldoMaximo(double saldoMaximo) {
        this.saldoMaximo = saldoMaximo;
    }

}
