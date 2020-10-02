/*
Implemente a classe OperacoesStrings, que possui os seguintes métodos:

void setTexto(String texto): guarda uma String na instância
String getTexto(): retorna a String armazenada na instância
int contaPalavras(): retorna a quantidade de palavras na String armazenada por setTexto()
double comprimentoMedioPalavras(): retorna o comprimento médio das palavras na String armazenada por setTexto()
String maiorPalavra(): retorna uma String com a maior palavra na String armazenada por setTexto()
int comprimentoMaiorPalavra(): retorna o comprimento da maior palavra na String armazenada por setTexto()
Observação: a String de entrada pode ter mais de um espaço separando as palavras, além de possuir sinais de pontuação. Por exemplo: "Esta      eh uma    frase de  teste.   "

Importante: Submeta apenas o código da classe OperacoesStrings. A classe OperacoesStrings não pode realizar impressão na tela e utilizar import ou funções prontas para separar as palavras (por exemplo, split ou expressão regular). O programa (com main) já existe no sistema de correção. O programa lê uma String e fica lendo códigos de operação conforme descrito a seguir:

1: Conta palavras
2: Comprimento maior palavra
3: Média do comprimento do palavra
4: Maior palavra
0: encerra o programa
*/

public class E6OperacoesStrings {
    private String texto;

    public void setTexto(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    public int contaPalavras(){
        int sum = 1;
        for(int i = 0; i < texto.length()-1; i++){
            if((texto.charAt(i) == ' ' || texto.charAt(i) == '.') && !(texto.charAt(i+1) == ' ' || texto.charAt(i+1) == '.')){
                sum++;
            }
        }
        return sum;
    }

    public double comprimentoMedioPalavras(){
        double count = 0.0;
        for(int i = 0; i<this.texto.length(); i++){
            if(!(this.texto.charAt(i)==' ' || this.texto.charAt(i)=='.')){
                count ++;
            }
        }
        return count/(double)this.contaPalavras();
    }

    public String maiorPalavra(){
        String result;
        String[] palavras = new String[this.contaPalavras()];
        result = this.texto.replace('.',' ');
        palavras = result.split(" ");
        result = palavras[0];
        for (String string : palavras) {
            if(string.length() > result.length()){
                result = string;
            }
        }
        return result;
    }

    public int comprimentoMaiorPalavra(){
        return this.maiorPalavra().length();
    }
}
