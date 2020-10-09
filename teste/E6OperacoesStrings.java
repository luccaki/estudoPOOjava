public class E6OperacoesStrings {
    private String texto;

    public void setTexto(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    public int contaPalavras(){
        int sum = 0;
        for(int i = 0; i < texto.length()-1; i++){
            if((texto.charAt(i) != ' ' && texto.charAt(i) != '.') && (texto.charAt(i+1) == ' ' || texto.charAt(i+1) == '.' || texto.charAt(i+1) == 0 || texto.charAt(i+1) == 3)){
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
