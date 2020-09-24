package fatec.poo.model;

import java.text.DecimalFormat;

/**
 *
 * @author Caroline Lima
 */
public class Pedido {
    DecimalFormat df = new DecimalFormat("#,##0.00");
    
    private int numero;
    private double total;
    private Cliente cliente;
    private Vendedor vendedor;
    private ItemPedido[] itensPedido;
    private int numItemPed;

    public Pedido(int numero) {
        this.numero = numero;
        itensPedido = new ItemPedido[10];
        numItemPed = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getTotal() {
        return total;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public void addItemPedido(ItemPedido ItemPedido){
        itensPedido[numItemPed] = ItemPedido;
        cliente.atualizarLimite(itensPedido[numItemPed].getSubTotal());
        if (cliente.getLimite() > 0) {
            total += itensPedido[numItemPed].getSubTotal();
            numItemPed++;
        }
    }
    
    public void listar(){
        System.out.println("\n\nNúmero do Pedido: " + numero);
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("\nCódigo\t\tDescrição\t\tQtde. Vendida\t\tSubTotal");
        for (int x=0; x < numItemPed; x++){
                System.out.print(itensPedido[x].getProduto().getCodigo() + "\t\t");
                System.out.print(itensPedido[x].getProduto().getDescricao() + "\t\t");
                System.out.print(itensPedido[x].getQtdeVend() + "\t\t");
                System.out.println(df.format(itensPedido[x].getSubTotal()));
        }
        System.out.println("\t\t\t\t\t\tTotal Geral\t" + df.format(total));
    }
    
}
