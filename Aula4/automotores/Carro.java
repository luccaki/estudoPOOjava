package automotores;

public class Carro extends Veiculo {
    public int portas;

    public Carro(){}

    public void setNumeroPortas(int portas){
        this.portas = portas;
    }
    
    public int getNumeroPortas(){
        return this.portas;
    }

    public String getTipo(){
        return "Carro modelo " + this.modelo; 
    }
}
