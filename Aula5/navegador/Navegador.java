import java.util.ArrayList;
import java.util.List;

package navegador;

public class Navegador{
    private int limiteAbas;
    public List<AbaNavegador> list = new ArrayList<AbaNavegador>();
    public int countList = 0;

    public Navegador(int limiteAbas){
        this.limiteAbas = limiteAbas;
        this.list = new AbaNavegador[limiteAbas];
    }

    public AbaNavegador abrirAba(int tipo, String titulo){
        if(limiteAbas <= countList)
            return null;
        AbaNavegador novaAba;
        if(tipo == 1){
            novaAba = new AbaBuscador(titulo);
        }
        else if(tipo == 2){
            novaAba = new AbaRedeSocial(titulo);
        }
        list.Add(novaAba);
        this.countList++;
        return novaAba;
    }

    public void fecharAba(AbaNavegador aba){
        list.Remove(aba);
        countList--;
    }

    public String[] getAbas(){
        int count = 0;
        String[] output = new String[countList];
        for (AbaNavegador aba : this.list) {
            output[count] = aba.getTipo() + " " + aba.getTitulo();
            count++;
        }
        return output;
    }

    public String[] getHistorico(){
        int count = 0;
        String[] output = new String[100];
        for(AbaNavegador aba : this.list){
            for(String histo : aba.historico){
                output[count] = histo;
                count++;
            }
        }
        return output;
    }
}