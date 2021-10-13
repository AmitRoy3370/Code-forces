import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class A_Elections {

	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases;
    
    static long a,b,c;
    
    static Map<Boolean,Integer> map=new HashMap<>();
    
    static void solve(){
    
        if(a==0 && b==0 && c==0){
            
            out.println(1+" "+1+" "+1);
            out.flush();
            
            return;
            
        }
         
        long max=Math.max( a,Math.max(b,c) );
        
        long haveToAdd=map.get(a==max)+map.get(b==max)+map.get(c==max);
        
           if(a==max && haveToAdd==1){
        
               out.print(0+" ");
               out.flush();
           
           }else{
       
               out.print((max-a+1)+" ");
               out.flush();
        
           }
           
           if(b==max && haveToAdd==1){
        
               out.print(0+" ");
               out.flush();
           
           }else{
        
               out.print((max-b+1)+" ");
               out.flush();
           
           }
           
           if(c==max && haveToAdd==1){
       
               out.print("0 \n");
               out.flush();
           
           }else{
        
               out.print((max-c+1)+" \n");
               out.flush();
        
           }
        
    }
    
    public static void main(String[] sumit) throws IOException {
        
        testCases=in.nextInt();
        
        map.put(true,1);
        map.put(false,0);
        
        for(int t=0;t<testCases;t++){
            
            a=in.nextLong();
            
            b=in.nextLong();
            
            c=in.nextLong();
            
            solve();
            
        }
        
        in.close();
        
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

5
0 0 0
10 75 15
13 13 17
1000 0 0
0 1000000000 0


*/