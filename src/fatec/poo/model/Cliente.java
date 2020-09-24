package fatec.poo.model;

/**
 *
 * @author Caroline Lima
 */
public class Cliente extends Pessoa{
    private double limite;
    private Pedido[] pedidos;
    private int numPed;

    public Cliente(int cod, String nome, double limite) {
        super(cod, nome);
        this.limite = limite;
        pedidos = new Pedido[10];
        numPed = 0;
    }

    public double getLimite() {
        return limite;
    }
    
    public void addPedido(Pedido p){
        pedidos[numPed] = p;
        numPed++;
    }
    
    public void atualizarLimite(double subTotal){
        limite -= subTotal;
    }    
    
}
