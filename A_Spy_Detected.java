
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class A_Spy_Detected {

static Scanner in=new Scanner();
static PrintWriter out=new PrintWriter(System.out);
    
static int n,testCases;

static int a[];

static class count{
    
    int freq;
    
    List<Integer> index=new ArrayList<>();

        public count() {
        
            freq=0;
            
        }

        public int getFreq() {
            return freq;
        }

        public void setFreq(int freq) {
            this.freq = freq;
        }

        public List<Integer> getIndex() {
            return index;
        }

        public void setIndex(List<Integer> index) {
            this.index = index;
        }

}

static void solve(){

Map< Integer,Integer > map=new HashMap<>();
    
    for(int i=0;i<a.length;i++){
        
        //Integer c[]={0,i};
        
        map.put(a[i], 0 );
        
    }
    
     for(int i=0;i<a.length;i++){
        
        //Integer c[]={0,i};
        
        int c=map.get(a[i])+1;
        
        map.put(a[i], c );
        
    }
    
     int element=0;
     
     for(int i: map.keySet()){
         
         if( map.get(i)==1 ){
             
             element=i;
             
         }
         
     }
     
     for(int i=0;i<a.length;i++){
         
         if( a[i]==element ){
             
             out.println( (i+1) );
             out.flush();
             
             return;
             
         }
         
     }
     
}

    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
            }
            
            solve();
            
        }
        
    }
    
       static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
            
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
    }
    
}
/*

4
4
11 13 11 11
5
1 4 4 4 4
10
3 3 3 3 10 3 3 3 3 3
3
20 20 10

*/