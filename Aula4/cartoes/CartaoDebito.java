package cartoes;

public class CartaoDebito {
    public String titular;
    public double saldo;

    public CartaoDebito(){
        this.saldo = 0.0;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void adicionarSaldoDebito(double saldo){
        this.saldo += saldo;
    }

    public double verificarSaldoDebito(){
        return this.saldo;
    }
    
    public boolean pagarComDebito(double valor){
        if(valor>saldo)
            return false;
        else{
            this.saldo -= valor;
            return true;
        }
    }
}
