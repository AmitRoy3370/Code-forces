
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Pashmak_and_Flowers {

        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n;
    
    static long a[];
     
    public static void main(String[] amit) throws IOException {
        
    n=in.nextInt();
        
    a=new long[n];
    
    long max=Long.MIN_VALUE,min=Long.MAX_VALUE;
    
    for(int i=0;i<n;i++){
        
        a[i]=in.nextLong();
        
        max=Math.max(max,a[i]);
        
        min=Math.min(min,a[i]);
        
    }
    
    in.close();
   
    long diff=max-min;
    
    long way=0,way1=0;
     
    int l=0,r=n-1;
    
    for(long i: a){
        
        if(i==max){
            
            way++;
            
        }else if(i==min){
            
            way1++;
            
        }
        
    }
    
  //  out.println("way: "+way+" way1: "+way1);
    //out.flush();
    
   // int ways=1;
    
   long n1=n;
   
    out.println(diff+" "+(max==min?( (n1*(n1-1))/2 ):way1*way) );
    out.flush();
    
    }
    
     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
        boolean nextBoolean() throws IOException{
            
            return Boolean.parseBoolean(next());
            
        }
        
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
    
}
/*

2
1 2


*/

/*

3
1 4 5


*/

/*

5
3 1 2 3 1


*/