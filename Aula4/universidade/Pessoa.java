package universidade;

public class Pessoa{
    protected String nome;
    protected String sobreNome;
    public Pessoa(){}

    public void setNomeSobrenome(String nome, String sobrenome){
        this.nome = nome;
        this.sobreNome = sobrenome;
    }

    public String getEmail(){
        return nome + "." + sobreNome + "@dominio.generico.com.br";
    }

    public String getVinculo(){
        return "Sem vinculo com a UFABC";
    }
}