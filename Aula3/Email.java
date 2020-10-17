public class Email{
    public static String dominio = "@dominio.generico.com.br";
    public static int count = 0;
    public String _email;
    public Email(String email){
        _email = email;
        count++;
    }
    public String getEmail(){
        return _email + dominio;
    }
    public static int getTotalEmails(){
        return count;
    }

}