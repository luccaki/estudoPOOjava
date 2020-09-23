import java.util.Scanner;

public class E3Triangular {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(triangular(num)){
            System.out.println("SIM");
        }
        else{
            System.out.println("NAO");
        }
    }
    public static boolean triangular(int num){
        int sum = 1;
        while(sum < num){
            if(sum*(sum+1)*(sum+2)==num){
                return true;
            }
            sum++;
        }
        return false;
    }
}
