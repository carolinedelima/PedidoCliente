package fatec.poo.model;

/**
 *
 * @author Caroline Lima
 */
public class Produto{
    private int codigo;
    private String descricao;
    private double preco;
    private int qtdeEstoque;

    public Produto(int codigo, String descricao, int qtdeEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtdeEstoque = qtdeEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }
    
}
