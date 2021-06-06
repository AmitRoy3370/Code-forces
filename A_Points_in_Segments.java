
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;

public class A_Points_in_Segments {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,m,l,r;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        m=in.nextInt();
        
        int cnt[]=new int[m+2];
        
        for(int i=0;i<n;i++){
            
            cnt[in.nextInt()]++;
            cnt[in.nextInt()+1]--;
            
        }
        
       for(int i=1;i<=m;i++){
           
           cnt[i]+=cnt[i-1];
            
        }
        
       Vector<Integer> ans=new Vector<>();
       
       for(int i=1;i<=m;i++){
           
           if(cnt[i]==0){
               
               ans.add(i);
               
           }
           
       }
       
       out.println(ans.size());
       out.flush();
       
       ans.stream().map((i) -> {
           out.print(i+" ");
               return i;
           }).forEachOrdered((_item) -> {
               out.flush();
           });
       
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next());
            
        }
        
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
    }
    
}
