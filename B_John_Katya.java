
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B_John_Katya {

       static Scanner in=new Scanner();
        
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
   static BigInteger a[];     
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new BigInteger[n];
        
        int john=0,katya=0;
        
        BigInteger mul=new BigInteger("1");
        
        for(int i=0;i<n;i++){
            
            mul=mul.multiply(new BigInteger(String.valueOf(i+1)));
            
            a[i]=mul;
            
            //out.println("i: "+a[i].mod(new BigInteger("2")));
            //out.flush();
            
            if(a[i].mod(new BigInteger("2")).compareTo(new BigInteger("1"))==0  ){
                
           //     if( i%2==0){
                
                john++;
                
             //   }
                
            }else{
                
               // if( i%2!=0){
                
                katya++;
                
               // }
                
            }
            
        }
        
       /* for(BigInteger i: a){
            
            out.print(String.valueOf(i)+" ");
            out.flush();
            
        }
        
        out.println("\njohn: "+john+" katya: "+katya);
        out.flush();*/
        
        if(john>katya){
            
            out.println("Win");
            out.flush();
            
        }else if(john==katya){
            
             out.println("Draw");
            out.flush();
            
        }else{
            
             out.println("Lose");
            out.flush();
            
        }
        
    }
    
     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader(new InputStreamReader(System.in));
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
    }    
    
}
