package universidade;

public class Professor extends Pessoa {
    public Professor(){}

    public String getEmail(){
        return nome + "." + sobreNome + "@ufabc.edu.br";
    }

    public String getVinculo(){
        return "Professor da UFABC";
    }
}
