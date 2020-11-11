package raiz;

public class RaizQuadrada {
    public static double calcular(double in) throws ExcecaoRaizNegativa {
        if (in < 0)
            throw new ExcecaoRaizNegativa(Math.sqrt(Math.abs(in)));
        else
            return Math.sqrt(in);
    }
}
