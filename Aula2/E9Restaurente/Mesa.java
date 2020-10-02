public class Mesa {
    private int numero;
    private boolean ocupada;

    public Mesa(int numero, boolean ocupada){
        this.ocupada = ocupada;
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean getOcupada() {
        return ocupada;
    }
}
