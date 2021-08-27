
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Scenes_From_a_Memory {

        static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases,n;
  
  static boolean prime[]=new boolean[1_000_00];
  
  static String s;
  
  static boolean isPrime(int x) {
		if (x<2) return false;
		for (int i=2; (i*(long)i)<=x; i++) {
			if (x%i==0) return false;
		}
		return true;
	}
  
  static void solve(){
      
      int ans=0;
      
      for(int i=0;i<1_000_00;i++){
          
          if( prime[i] ){
              
              continue;
              
          }
          
          if( !contains( s,i ) ){
              
              continue;
              
          }
          
          ans=i;
          break;        
          
      }
      
      out.println( String.valueOf(ans).length()+"\n"+ans );
      out.flush();
      
  } 
  
  static boolean contains(String s, int x) {
		String me=x+"";
		int meInd=0;
		for (char c:s.toCharArray()) {
			if (c==me.charAt(meInd)) meInd++;
			if (meInd==me.length()) return true;
		}
		return meInd==me.length();
	}
  
    public static void main(String[] amit) throws IOException {
        
        for(int i=0;i<1_000_00;i++){
            
  prime[i]=isPrime(i);       
            
        }
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            s=in.next();
            
            solve();
            
        }
        
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

7
3
237
5
44444
3
221
2
35
3
773
1
4
30
626221626221626221626221626221


*/