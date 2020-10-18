package quadrilateros;

public class Quadrilatero{
    public double ladoAB;
    public double ladoBC;
    public double ladoCD;
    public double ladoDE;

    public Quadrilatero(){}

    public void setLados(double ladoAB, double ladoBC, double ladoCD, double ladoDE){
        this.ladoAB = ladoAB;
        this.ladoBC = ladoBC;
        this.ladoCD = ladoCD;
        this.ladoDE = ladoDE;
    }

    public double getPerimetro(){
        return this.ladoAB + this.ladoBC + this.ladoCD + this.ladoDE;
    }

    public String getPropriedades(){
        return "Figura de quatro lados.";
    }
}