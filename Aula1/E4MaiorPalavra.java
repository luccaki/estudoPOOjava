import java.util.Scanner;

public class E4MaiorPalavra{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String palavra = in.nextLine();
        int sum = 0;
        int maior = 0;
        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) != ' '){
                sum++;
            }
            else{
                if(maior < sum){
                    maior = sum;
                }
                sum = 0;
            }
        }
        if(maior < sum){
            maior = sum;
        }
        System.out.println(maior);
    }
}