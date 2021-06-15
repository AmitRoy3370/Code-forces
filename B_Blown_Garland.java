
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Blown_Garland {

      static Scanner in=new Scanner();
        
    static PrintWriter out=new PrintWriter(System.out);
   
    public static void main(String[] amit) throws IOException {
        
        //kr, kb, ky, kg 
        
   char ch[]=in.next().toCharArray();
        
  int a[]=new int[4];
  
  int b[]=new int[256];
  
  int n=ch.length;
  
  for(int i=0;i<n;i++){
      
      if(ch[i]=='!'){
          
          a[i%4]++;
          
      }else{
          
          b[ch[i]]=i%4;
          
      }
      
  }
  
  out.println(a[ b['R'] ]+" "+a[b['B'] ]+" "+a[b['Y'] ]+" "+a[b['G']]  );
  out.flush();
  
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
//RYBGRYBGR
//!RGYB
//!!!!YGRB
//!GB!RG!Y!
//!Y!!!Y!!G!!!G!!B!!R!!!!B!!!!!Y!!G!R!!!!!!!!!!!!B!!!!GY!B!!!!!YR!G!!!!!!B!Y!B!!!!!!R!G!!!!!!!G!R!!!!B
//20 18 19 18