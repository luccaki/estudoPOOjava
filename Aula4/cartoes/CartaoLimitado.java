package cartoes;

public class CartaoLimitado extends CartaoCredito {
    public double devido;
    public CartaoLimitado(){
        this.saldo = 0.0;
        this.devido = 0.0;
    }

    public boolean pagarComCredito(double valor){
        if(this.devido + valor >= 200)
            return false;
        else{
            this.devido += valor;
            return true;
        }
    }

}
