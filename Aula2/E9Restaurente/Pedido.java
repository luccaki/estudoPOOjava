import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Mesa mesa;
    private Garcom garcom;
    private List<Prato> pratos = new ArrayList<>();

    public Pedido(Mesa mesa, Garcom garcom) {
        this.mesa = mesa;
        this.garcom = garcom;
    }

    public void incluirPrato(Prato prato) {
        pratos.add(prato);
    }

    public void imprimirPedido() {
        System.out.println(this.mesa.getNumero());
        System.out.println(this.garcom.getNome());
        double total = 0;
        for (Prato p : pratos) {
            System.out.println(p.getNome());
            total += p.getPreco();
        }
        System.out.println(total);
    }

    public void fechar() {
        this.imprimirPedido();
    }
}
