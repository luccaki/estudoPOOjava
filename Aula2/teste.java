import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        E6OperacoesStrings E6 = new E6OperacoesStrings();
        E6.setTexto(in.nextLine());
        System.out.println(E6.contaPalavras());
        System.out.println(E6.comprimentoMaiorPalavra());
        System.out.println(E6.comprimentoMedioPalavras());
        System.out.println(E6.maiorPalavra());
    }
}
