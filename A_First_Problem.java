import java.util.Scanner;

public class A_First_Problem {

    public static void main(String[] amit) {
        
        double p,d;
        
        Scanner in=new Scanner(System.in);
        
        d=in.nextDouble();
        
        p=in.nextDouble();
        
        double t=(d/p)+37.000;
        
        System.out.printf("%.3f",t);
        
    }
    
}
