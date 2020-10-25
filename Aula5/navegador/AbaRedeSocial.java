import java.util.ArrayList;
import java.util.List;

package navegador;

public class AbaRedeSocial extends AbaNavegador {
    public List<String> historico = new ArrayList<String>();

    public AbaRedeSocial(String titulo){
        this.titulo = titulo;
    }

    public void postar(String expressao){
        historico.Add("Post: " + expressao);
    }

    public String getTipo(){
        return "RedeSocial";
    }
}
