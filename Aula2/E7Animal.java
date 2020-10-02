/*
Implemente a classe Animal, que possui os seguintes métodos:

void setIdade(int idade): guarda a idade do animal
void setFatorProporcao(int fator): guarda o fator de proporção em comparação aos seres humanos
int getIdadeReal(): retorna a idade do animal pelo fator de proporção
void setEspecie(String especie): guarda a espécie animal
String getSubReino(): retorna o sub-reino do Reino Metazoa associado a espécie animal
Observação: as Strings não consideram acentuação e todas em caixa baixa.

Considere a imagem abaixo como subreinos e espécies (em particular, utilize as sguintes espécies: coelho, escorpiao, elefante, lagarto, polvo e carangueijo). Qualquer elemento fora desta imagem - como uma ameba - devem ser classicados como "invalidos";
*/

public class E7Animal {
    private int idade;
    private int fatorProporcao;
    private String especie;

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setFatorProporcao(int fator){
        this.fatorProporcao = fator;
    }

    public int getIdadeReal(){
        return this.idade*this.fatorProporcao;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getSubReino(){
        if(this.especie.equals("coelho")){
            return "vertebrado";
        }
        else if(this.especie.equals("escorpiao")){
            return "invertebrado";
        }
        else if(this.especie.equals("elefante")){
            return "vertebrado";
        }
        else{
            return "invalido";
        }
    }
}
