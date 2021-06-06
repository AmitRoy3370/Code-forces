
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C_Songs_Compression {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static long m;
    
    static class Pair implements Comparable<Pair> {
        
        long first,second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair t) {
     //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
     if( this.first-this.second>t.first-t.second ){
         
         return -1;
         
     }else if(this.first-this.second<t.first-t.second){
         
         return 1;
         
     }
     
    return 0;
     
        }
        
    }
    
    static Pair pair[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        m=in.nextLong();
        
        pair=new Pair[n];
        
        long sum=0;
        
        for(int i=0;i<n;i++){
            
            pair[i]=new Pair(in.nextLong(),in.nextLong());
            
            sum+=pair[i].first;
            
        }
        
      Arrays.sort(pair);
        
   /*   for(Pair i: pair){
          
          out.println(i.first+" "+i.second);
          out.flush();
          
      }*/
      
      for(int i=0;i<n;i++){
          
          if(sum<=m){
              
              out.println(i);
              out.flush();
              
              return;
              
          }
          
          sum-=pair[i].first-pair[i].second;
          
      }
        
      if(sum<=m){
          
          out.println(n);
          out.flush();
          
      }else{
          
          out.println(-1);
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
/*

4 21
10 8
7 4
3 1
5 4


*/