package criptografia;

public class ZenitPolar implements Cifra {
    public String cifrar(String texto){
        String output = "";
        for (int i = 0; i < texto.length(); i++) { 
            if(texto.charAt(i) == 'z'){
                output += "p";
            }else if(texto.charAt(i) == 'e'){
                output += "o";
            }else if(texto.charAt(i) == 'n'){
                output += "l";
            }else if(texto.charAt(i) == 'i'){
                output += "a";
            }else if(texto.charAt(i) == 't'){
                output += "r";
            }else if(texto.charAt(i) == 'p'){
                output += "z";
            }else if(texto.charAt(i) == 'o'){
                output += "e";
            }else if(texto.charAt(i) == 'l'){
                output += "n";
            }else if(texto.charAt(i) == 'a'){
                output += "i";
            }else if(texto.charAt(i) == 'r'){
                output += "t";
            }else{
                output += texto.charAt(i);
            }
        }
        return output;
    }

    public String decifrar(String texto){
        return this.cifrar(texto);
    }
}
