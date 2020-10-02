/*
Implemente a classe Doenca, que possui os seguintes métodos:

void setSintomas(boolean tosse, boolean febre, boolean faltaDeAr): guarda os sintomas passados por parâmetro.  

String getDoenca(): retorna qual a doença associada ao quadro clinico configurado. Um quadro de coronavirus apresenta tosse, febre e falta de ar; 
um resfriado considera tosse e febre, já um quadro febril tem a presença de febre; asma é caracterizada pela presença de tosse com falta de ar; 
por fim, uma dor de gargante tem apenas tosse.

String getRecomendacoes(): retorna as recomendações indicadas ao paciente diante do quadro clinico. Em caso de coronavírus, a recomendação é procurar 
um centro de atendimento especializado, enquanto nos demais casos, recomenda-se “procure um médico”.

Observação: as Strings não consideram acentuação e todas em caixa baixa.
*/

public class E8Doenca {
    public boolean tosse;
    public boolean febre;
    public boolean faltaDeAr;

    public  void setSintomas(Boolean tosse,Boolean febre,Boolean faltaDeAr){
        this.tosse = tosse;
        this.febre = febre;
        this.faltaDeAr = faltaDeAr;
    }

    public String getDoenca(){
        if(this.tosse == true && this.febre == true && this.faltaDeAr == true){
            return "coronavirus";
        }
        else if(this.tosse == true && this.febre == true){
            return "resfriado";
        }
        else if(this.febre == true){
            return "quadro febril";
        }
        else if(this.faltaDeAr == true){
            return "asma";
        }
        else if(this.tosse == true && this.febre == false && this.faltaDeAr == false){
            return "dor de gargante";
        }
        else{
            return " ";
        }

    }

    public String getRecomendacao(){
        if(this.tosse == true && this.febre == true && this.faltaDeAr == true){
            return "procure um centro de atendimento especializado";
        }
        else{
            return "procure um medico";
        }
    }
    
}
