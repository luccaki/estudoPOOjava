package usuarios;

public class PerfilRedeSocial extends PerfilUsuario {
    public String menssagem;

    public PerfilRedeSocial(String nome, String login){
        super(nome,login);
        this.menssagem = "Sem mensagem";
    }

    public PerfilRedeSocial(String nome, String login, String mensagemPaginaInicial){
        this(nome,login);
        this.menssagem = mensagemPaginaInicial;
    }

    public String getPerfil(){
        return super.getNome() + " " + this.menssagem;
    }
}
