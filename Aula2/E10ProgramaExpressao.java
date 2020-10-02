import java.util.Scanner;

public class E10ProgramaExpressao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada = in.nextLine();
        OperacaoMatematica mat = new OperacaoMatematica();
        while (entrada.contains("*")) {
            int vezes = entrada.indexOf("*");
            mat.setValor1(entrada.charAt(vezes - 1));
            mat.setValor2(entrada.charAt(vezes + 1));
            mat.executaOperacao(3);
            int result = mat.getResultado();
            entrada.replace(entrada.substring(vezes - 1, vezes + 1), Integer.toString(result));
        }
        while (entrada.contains("/")) {
            int vezes = entrada.indexOf("/");
            mat.setValor1(entrada.charAt(vezes - 1));
            mat.setValor2(entrada.charAt(vezes + 1));
            mat.executaOperacao(4);
            int result = mat.getResultado();
            entrada.replace(entrada.substring(vezes - 1, vezes + 1), Integer.toString(result));
        }
        while (entrada.contains("+")) {
            int vezes = entrada.indexOf("+");
            mat.setValor1(entrada.charAt(vezes - 1));
            mat.setValor2(entrada.charAt(vezes + 1));
            mat.executaOperacao(1);
            int result = mat.getResultado();
            entrada.replace(entrada.substring(vezes - 1, vezes + 1), Integer.toString(result));
        }
        while (entrada.contains("-")) {
            int vezes = entrada.indexOf("-");
            mat.setValor1(entrada.charAt(vezes - 1));
            mat.setValor2(entrada.charAt(vezes + 1));
            mat.executaOperacao(2);
            int result = mat.getResultado();
            entrada.replace(entrada.substring(vezes - 1, vezes + 1), Integer.toString(result));
        }
        System.out.println(entrada);
    }
}
