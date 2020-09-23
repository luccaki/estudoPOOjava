import java.util.Scanner;

public class E5Pitagoras {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if(a==0){
            System.out.println(String.format("%.1f", Math.sqrt((c*c)+(b*b))));
        }else if(b==0){
            if(c>a)
                System.out.println(String.format("%.1f", Math.sqrt((c*c)-(a*a))));
            else
                System.out.println(String.format("%.1f", Math.sqrt((a*a)-(c*c))));
        }else if(c==0){
            if(b>a)
                System.out.println(String.format("%.1f", Math.sqrt((b*b)-(a*a))));
            else
                System.out.println(String.format("%.1f", Math.sqrt((a*a)-(b*b))));
        }
    }
}
