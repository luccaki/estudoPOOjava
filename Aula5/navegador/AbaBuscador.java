import java.util.ArrayList;
import java.util.List;

package navegador;

public class AbaBuscador extends AbaNavegador {
    public List<String> historico = new ArrayList<String>();

    public AbaBuscador(String titulo){
        this.titulo = titulo;
    }

    public void buscar(String expressao){
        historico.Add("Busca: " + expressao);
    }

    public String getTipo(){
        return "Buscador";
    }
}
