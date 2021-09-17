
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C1_The_Great_Julya_Calendar {

      static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

  static long digit;  
  
  static long maxDigit(long number){
      
      char a[]=String.valueOf(number).toCharArray();
      
      long max=Long.MIN_VALUE;
      
      for(char i: a){
          
          max=Math.max(max,Long.parseLong( String.valueOf(i) ) );
          
      }
      
      return max;
      
  }
  
    public static void main(String[] amit) throws IOException {
        
        digit=in.nextLong();
     
        in.close();
        
        long steps=0;
        
        while(digit!=0){
            
            digit-=maxDigit(digit);
            
            steps++;
            
        }
        
        out.println(steps);
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
//24