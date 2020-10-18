package quadrilateros;

public class Quadrado extends Retangulo{
    public Quadrado(){}

    public void setLados(double lado){
        this.ladoAB = lado;
        this.ladoBC = lado;
        this.ladoCD = lado;
        this.ladoDE = lado;
    }

    public String getPropriedades(){
        return "Figura de quatro lados. Lados opostos paralelos. Angulo de 90 graus em todos os vertices. Todos os lados tem mesmo tamanho.";
    }
}
