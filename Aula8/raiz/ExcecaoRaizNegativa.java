package raiz;

public class ExcecaoRaizNegativa extends Exception {
    public double raiz;

    public ExcecaoRaizNegativa(double in) {
        this.raiz = in;
    }

    public String dominioComplexos() {
        return "0 + " + raiz + "i";
    }

    @Override
    public String toString() {
        return "Raiz quadrada de numero negativo nao existe no dominio dos reais";
    }
}
