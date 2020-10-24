package criptografia;

public class CifraCesar implements Cifra{
    private int nShifts;

    public CifraCesar(int nShifts){
        while(nShifts >= 26) {
            nShifts = nShifts - 26;
        }
        this.nShifts = nShifts;
    }

    public String cifrar(String texto){
        String output = "";
        for (int i = 0; i < texto.length(); i++) { 
            if(texto.charAt(i) == ' '){
                output += " ";
            }
            else if (texto.charAt(i) >= 97 && texto.charAt(i) <= 122) {
                if ((int) (texto.charAt(i) + nShifts) > 122) {
                    char x = (char) (texto.charAt(i) + nShifts);
                    char y = (char) (x - 122);
                    String ascii = Character.toString((char) 96 + y);
                    output += ascii;
                } else {
                    String ascii = Character.toString((char) texto.charAt(i) + nShifts);
                    output += ascii;
                }
            }
        }
        return output;
    }

    public String decifrar(String texto){
        String output = "";
        for (int i = 0; i < texto.length(); i++) { 
            if(texto.charAt(i) == ' '){
                output += " ";
            }
            else if (texto.charAt(i) >= 97 && texto.charAt(i) <= 122) {
                if ((int) (texto.charAt(i) - nShifts) < 97) {
                    char x = (char) (texto.charAt(i) - nShifts);
                    char y = (char) (x + 122);
                    String ascii = Character.toString(y - 96);
                    output += ascii;
                } else {
                    String ascii = Character.toString(texto.charAt(i) - nShifts);
                    output += ascii;
                }
            }
        }
        return output;
    }
}