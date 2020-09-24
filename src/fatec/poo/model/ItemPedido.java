package fatec.poo.model;

/**
 *
 * @author Caroline Lima
 */
public class ItemPedido{
    private int qtdeVend;
    private double subTotal;
    private Pedido pedido;
    private Produto produto;

    public ItemPedido(Produto produto, int qtdeVend) {
        if (produto.getQtdeEstoque() > 0) {
            this.produto = produto;
            this.qtdeVend = qtdeVend;
            subTotal = produto.getPreco() * qtdeVend;
            produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVend);
        }
    }

    public int getQtdeVend() {
        return qtdeVend;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Produto getProduto() {
        return produto;
    }
    
}
