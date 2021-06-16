
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Phone_numbers {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[] amit) throws IOException {
        
        int n=in.nextInt();
        
        char []ch=in.next().toCharArray();
        
        StringBuilder sb=new StringBuilder();
        
        if(n%2==0){
            
            for(int i=0;i<n;i+=2){
                
                if( i!=n-2  ){
                
                sb.append(ch[i]).append(ch[i+1]).append("-");
                
                }else{
                    
                    sb.append(ch[i]).append(ch[i+1]);
                    
                }
                
            }
            
        }else{
            
            for(int i=0;i<n;i++){
                
                if(i!=0 && i!=n-1 && i%2==0 ){
                    
                    sb.append("-");
                    
                }
                
                sb.append(ch[i]);
                
            }
            
        }
        
        out.println(sb.toString());
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
/*

6
549871


*/

/*

7
1198733


*/