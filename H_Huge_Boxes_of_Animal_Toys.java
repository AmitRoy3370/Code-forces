import java.util.Scanner;

public class H_Huge_Boxes_of_Animal_Toys {

    static Scanner in=new Scanner(System.in);
    
    static int testCases,a,b,c,d;
    
    static void solve(){
        
        if( a==0 && d==0 ){
            
            if(b%2==1){
                
                System.out.println("Tidak Ya Tidak Tidak");
                
            }else{
                
                System.out.println("Tidak Tidak Ya Tidak");
                
            }
            
        }else if(b==0 && c==0){
            
            if(a%2==1){
                
                System.out.println("Ya Tidak Tidak Tidak");
                
            }else{
                
                System.out.println("Tidak Tidak Tidak Ya");
                
            }
            
        }else{
            
            if( (a+b)%2==1 ){
                
                System.out.println("Ya Ya Tidak Tidak");
                
            }else{
                
                System.out.println("Tidak Tidak Ya Ya");
                
            }
            
        }
        
    }
    
    public static void main(String[] amit) {
        
        testCases=in.nextInt();
        
        for(int i=0;i<testCases;i++){
            
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            d=in.nextInt();
            
            solve();
            
        }
        
    }
    
}
/*

2
1 2 0 1
0 1 0 0


*/