package cartoes;

public class CartaoCredito extends CartaoDebito {
    public double devido;
    public CartaoCredito(){
        this.saldo = 0.0;
        this.devido = 0.0;
    }

    public boolean pagarComCredito(double valor){
        this.devido += valor;
        return true;
    }

    public void quitarCredito(double valor){
        this.devido -= valor;
    }

    public double verificarExtrato(){
        return this.devido;
    }
}
