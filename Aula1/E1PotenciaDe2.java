import java.util.Scanner;

public class E1PotenciaDe2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for(int i=0; i<num; i++){
            int a = in.nextInt();
            if(potenciaDe2(a)){
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static boolean potenciaDe2(int num){
        while(num % 2 == 0 && num != 2){
            num = num/2;
        }
        if(num%2==1){
            return false;
        }
        else{
            return true;
        }

    }
}