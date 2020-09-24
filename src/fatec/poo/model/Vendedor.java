package fatec.poo.model;

import java.text.DecimalFormat;

/**
 *
 * @author Caroline Lima
 */
public class Vendedor extends Pessoa{
    DecimalFormat df = new DecimalFormat("#,##0.00");
    
    private String dataAdmissao;
    private double taxaComissao;
    private double totalVendas;
    private Pedido[] pedidos;
    private int numPed;

    public Vendedor(int cod, String nome, double taxaComissao) {
        super(cod, nome);
        this.taxaComissao = taxaComissao;
        pedidos = new Pedido[10];
        numPed = 0;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addPedido(Pedido p){
        pedidos[numPed] = p;
        numPed++;
    }
    
    public void listarPedidos(){
        System.out.println("\n\nRelação de Pedidos Emitidos");
        System.out.println("\nCódigo: " + getCodigo());
        System.out.println("Taxa de Comissão(%): " + taxaComissao);
        System.out.println("Nome: " + getNome());
        System.out.println("\nNo. Pedido\tValor do Pedido\t\tTotal Comissão");
        for (int x=0; x < numPed; x++){
            System.out.print(pedidos[x].getNumero() + "\t\t");
            System.out.print(df.format(pedidos[x].getTotal()) + "\t\t\t");
            System.out.println(df.format((taxaComissao * pedidos[x].getTotal()) / 100));
            totalVendas += pedidos[x].getTotal();
        }
        System.out.println("Total Geral\t" + df.format(totalVendas) + "\t\t\t" + df.format((totalVendas * taxaComissao) / 100));
    }
    
}
