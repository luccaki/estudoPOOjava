import java.util.Scanner;
import java.lang.String;

public class E10ProgramaExpressao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada = in.nextLine();
        OperacaoMatematica mat = new OperacaoMatematica();
        Impressao imp = new Impressao();
        while (entrada.contains("*")) {
            int vezes = entrada.indexOf("*");
            int prox = vezes + 1;
            while(!(entrada.charAt(prox)=='*'|| entrada.charAt(prox)=='/'|| entrada.charAt(prox)=='+'|| entrada.charAt(prox)=='-' || entrada.charAt(prox)=='=')){
                prox++;
            }
            int ant = vezes - 1;
            while(!(entrada.charAt(ant)=='*'|| entrada.charAt(ant)=='/'|| entrada.charAt(ant)=='+'|| entrada.charAt(ant)=='-' || ant == 0)){
                ant--;
            }
            if(ant == 0) ant = -1;
            mat.setValor1(Integer.parseInt(entrada.substring(ant + 1, vezes)));
            mat.setValor2(Integer.parseInt(entrada.substring(vezes + 1, prox)));
            mat.executaOperacao(3);
            int result = mat.getResultado();
            entrada = entrada.replace(entrada.substring(ant + 1, prox), Integer.toString(result));
        }
        while (entrada.contains("/")) {
            int vezes = entrada.indexOf("/");
            int prox = vezes + 1;
            while(!(entrada.charAt(prox)=='*'|| entrada.charAt(prox)=='/'|| entrada.charAt(prox)=='+'|| entrada.charAt(prox)=='-' || entrada.charAt(prox)=='=')){
                prox++;
            }
            int ant = vezes - 1;
            while(!(entrada.charAt(ant)=='*'|| entrada.charAt(ant)=='/'|| entrada.charAt(ant)=='+'|| entrada.charAt(ant)=='-' || ant == 0)){
                ant--;
            }
            if(ant == 0) ant = -1;
            mat.setValor1(Integer.parseInt(entrada.substring(ant + 1, vezes)));
            mat.setValor2(Integer.parseInt(entrada.substring(vezes + 1, prox)));
            mat.executaOperacao(4);
            int result = mat.getResultado();
            entrada = entrada.replace(entrada.substring(ant + 1, prox), Integer.toString(result));
        }
        while (entrada.contains("+")) {
            int vezes = entrada.indexOf("+");
            int prox = vezes + 1;
            while(!(entrada.charAt(prox)=='*'|| entrada.charAt(prox)=='/'|| entrada.charAt(prox)=='+'|| entrada.charAt(prox)=='-' || entrada.charAt(prox)=='=')){
                prox++;
            }
            int ant = vezes - 1;
            while(!(entrada.charAt(ant)=='*'|| entrada.charAt(ant)=='/'|| entrada.charAt(ant)=='+'|| entrada.charAt(ant)=='-' || ant == 0)){
                ant--;
            }
            if(ant == 0) ant = -1;
            mat.setValor1(Integer.parseInt(entrada.substring(ant + 1, vezes)));
            mat.setValor2(Integer.parseInt(entrada.substring(vezes + 1, prox)));
            mat.executaOperacao(1);
            int result = mat.getResultado();
            entrada = entrada.replace(entrada.substring(ant + 1, prox), Integer.toString(result));
        }
        while (entrada.contains("-")) {
            int vezes = entrada.indexOf("-");
            int prox = vezes + 1;
            while(!(entrada.charAt(prox)=='*'|| entrada.charAt(prox)=='/'|| entrada.charAt(prox)=='+'|| entrada.charAt(prox)=='-' || entrada.charAt(prox)=='=')){
                prox++;
            }
            int ant = vezes - 1;
            while(!(entrada.charAt(ant)=='*'|| entrada.charAt(ant)=='/'|| entrada.charAt(ant)=='+'|| entrada.charAt(ant)=='-' || ant == 0)){
                ant--;
            }
            if(ant == 0) ant = -1;
            mat.setValor1(Integer.parseInt(entrada.substring(ant + 1, vezes)));
            mat.setValor2(Integer.parseInt(entrada.substring(vezes + 1, prox)));
            mat.executaOperacao(2);
            int result = mat.getResultado();
            entrada = entrada.replace(entrada.substring(ant + 1, prox), Integer.toString(result));
        }
        entrada = entrada.replace("=","");
        imp.imprimirResultado(Integer.parseInt(entrada));
    }
}
