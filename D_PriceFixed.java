
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D_PriceFixed {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static class Pair implements Comparable<Pair> {
        
        long first,second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair t) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
       if(this.second>t.second){
           
           return -1;
           
       }else if(this.second<t.second){
           
           return 1;
           
       }
       
       return 0;
        
        }
        
    }
    
    static int n;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
       Pair pair[]=new Pair[n];
       
       long ans=0;
       
       for(int i=0;i<n;i++){
           
           pair[i]=new Pair(in.nextLong(),in.nextLong());
           
           ans+=2*pair[i].first;
           
       }
       
       Arrays.sort(pair);
       
       int i=0,j=n-1;
    long cur =0;
    while(i<=j){
        long tar=pair[j].second;
        if(i==j){
            long can_take=pair[i].first;
            long to_take=Math.max(0,pair[i].second-cur);
            can_take=Math.max(0,can_take-to_take);
            ans-=can_take;
            break;
        }
        else if(cur>=tar){
            cur+=pair[j].first;
            ans-=pair[j].first;
            j--;
        }
        else if(cur+pair[i].first<=pair[j].second){
            cur+=pair[i].first;
            pair[i].first=0;
            i++;
        }
        else{
            long to_take=pair[j].second-cur;
            cur+=to_take;
            cur+=pair[j].first;
            pair[i].first-=to_take;
            ans-=pair[j].first;
            j--;
        }
    }
    out.println(ans);
    out.flush();
       
    }
    
    static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
    }
    
}
/*

3
3 4
1 3
1 5


*/

/*

5
2 7
2 8
1 2
2 4
1 8


*/