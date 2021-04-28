
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Helpful_Maths {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static String s;
    
    public static void main(String[] amit) throws IOException {
        
        s=in.next();
        
        if( !s.contains("+") ){
            
            out.print(s);
            out.flush();
            
            return;
            
        }
        
        int count=0;
        
        for(int i=0;i<s.length();i++){
            
            if( s.charAt(i)!='+' ){
                
                count++;
                
            }
            
        }
        
        String x[]=new String[count];
     
        int a[]=new int[x.length];
        
        int index=0;
     
        for(int i=0;i<s.length();i++){
            
            if( s.charAt(i)!='+' ){
                
                x[index++]=( String.valueOf(s.charAt(i)) );
                
            }
            
        }
        
        index=0;
        
        for(String i: x){
            
            try{
            
            a[index++]=Integer.parseInt(i);
            
            }catch(NumberFormatException e){
                
                
            }
            
        }
        
        Arrays.sort(a);
        
        for(int i=0;i<a.length-1;i++){
            
   //         if(a[i]!=0){
            
            out.print(a[i]+"+");
            
            out.flush();
            
     //       }
            
        }
        
        out.print(a[a.length-1]);
        
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
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
    
}
