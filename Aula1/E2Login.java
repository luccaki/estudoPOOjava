import java.util.Scanner;

public class E2Login {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String usuario = in.next();
        String senha = in.next();
        if(usuario.equals("flavio") && senha.equals("1234")){
            System.out.println("Usuario " + usuario + " logado com sucesso");
        }
        else if(usuario.equals("flavio") || senha.equals("1234") || usuario.equals("roberto")){
            System.out.println("Login ou senha invalidos.");
        }
        else{
            System.out.println("Usuário " + usuario + " logado com sucesso");
        }
    }
}
