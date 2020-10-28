package texto;

public class PrimeiraLetraMaiuscula implements PluginFormatacao {
    public String aplicar(String texto){
        String out = "";
        for(int i=0; i<texto.length(); i++){
            if(i==0){
                if(texto.charAt(i) >= 97 && texto.charAt(i) <= 122){
                    out += (char) (texto.charAt(i)-32);
                }else{
                    out += texto.charAt(i);
                }
            }else{
                if(texto.charAt(i-1)==' '){
                    if(texto.charAt(i) >= 97 && texto.charAt(i) <= 122){
                        out += (char) (texto.charAt(i)-32);
                    }else{
                        out += texto.charAt(i);
                    }
                }else{
                    if(texto.charAt(i) >= 65 && texto.charAt(i) <= 90){
                        out += (char) (texto.charAt(i)+32);
                    }else{
                        out += texto.charAt(i);
                    }
                }
            }
        }
        return out;
    }
}
