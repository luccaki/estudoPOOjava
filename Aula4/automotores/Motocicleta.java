package automotores;

public class Motocicleta extends Veiculo {
    public Boolean carroLateral;

    public Motocicleta(){}

    public void setTemCarroLateral(Boolean carroLateral){
        this.carroLateral = carroLateral;
    }
    
    public Boolean getTemCarroLateral(){
        return this.carroLateral;
    }

    public String getTipo(){
        return "Motocicleta modelo " + this.modelo; 
    }
}
