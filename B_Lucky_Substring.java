
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Lucky_Substring {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[] amit) throws IOException {
        
        char []ch=in.next().toCharArray();
           
        int n=ch.length;
        
        int four=0,seven=0;
        
     for(int i=0;i<n;i++){
         
         if(ch[i]=='4'){
             
             four++;
             
         }else if(ch[i]=='7'){
             
             seven++;
             
         }
         
     }
         
     if(four==0 && seven==0){
         
         out.println(-1);
         out.flush();
         
         return;
         
     }
     
     if(four>=seven){
         
         out.println(4);
         out.flush();
         
     }else{
         
         out.println(7);
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
//047
//16
//472747
