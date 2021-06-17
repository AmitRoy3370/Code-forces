
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class C_Lucky_Sum {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new BufferedOutputStream(System.out) );
    
    static int l,r;
    
 //   static long b[];
    
    public static void main(String[] amit) throws IOException {
        
        l=in.nextInt();
        r=in.nextInt();
        
        List<Long> list=new ArrayList<>();
         
        list.add(0L);
        
        //long b[]=new long[1039];
        
     //   int k=1;
        
        for(int i=0;i<515;i++){
            
            Long four=list.get(i)*10+4;
            Long seven=list.get(i)*10+7;
            
            list.add(four);
            list.add(seven);
            
          //  b[k++]=four;
            //b[k++]=seven;
            
        }
        
        long ans=0;
        
        //int q=0;
        
        for(Long i: list){
            
            while(l<=i && l<=r ){
                
                ans+=i;
                
                l++;
                
            }
            
        }
        
        out.println(ans);
  //      out.flush();
    
  out.close();
  
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
//2 7
//7 7
//47444 1000000000
//4 77777