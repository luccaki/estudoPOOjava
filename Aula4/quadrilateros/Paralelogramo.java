package quadrilateros;

public class Paralelogramo extends Quadrilatero{
    public Paralelogramo(){}

    public void setLados(double lado1, double lado2){
        this.ladoAB = lado1;
        this.ladoBC = lado2;
        this.ladoCD = lado1;
        this.ladoDE = lado2;
    } 

    public String getPropriedades(){
        return "Figura de quatro lados. Lados opostos paralelos.";
    }
}
