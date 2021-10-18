import java.util.Scanner;

public class A_Happy_Birthday_Polycarp {

    static Scanner in=new Scanner(System.in);
    
    static int testCases;
    
    static long n;
    
    static void solve(){
        
        long b=0,ans=0;
        
        for(int len=0;len<=9;len++){
            
            b=b*10+1;
            
            for(int i=1;i<=9;i++){
                
                if( b*i<=n ){
                    
                    ans++;
                    
                }
                
            }
            
        }
        
        System.out.println(ans);
        
    }
    
    public static void main(String[] amit) {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextLong();
            
            solve();
            
        }
        
    }
    
}
/*

6
18
1
9
100500
33
1000000000


*/