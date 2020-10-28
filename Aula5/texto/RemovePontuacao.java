package texto;

public class RemovePontuacao implements PluginFormatacao {
    public String aplicar(String texto){
        String out = "";
        for(int i=0; i<texto.length(); i++){
            if(!(texto.charAt(i)==':' || texto.charAt(i)==',' || texto.charAt(i)=='.' || texto.charAt(i)==':')){
                out += texto.charAt(i);
            }
        }
        return out;
    }
}
