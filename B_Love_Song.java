
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B_Love_Song {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,q,l,r;
    
    static String s;
    
    static Map<Character,Integer> map=new HashMap<>();
    
    static char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    static Pair freq[];
    
    static class Pair{
        
        char element;
        int count;

        public Pair(char element, int count) {
            this.element = element;
            this.count = count;
        }

        public Pair() {
        
            count=0;
        
        }

        @Override
        public String toString() {
            return element + " " + count ;
        }
        
    }
    
    static char ch[];
    
    static int per[];
    
    static void solveFreq(){
        
        ch=s.toCharArray();
        
        freq=new Pair[n];
       
       for(int i=0;i<n;i++){
           
           freq[i]=new Pair(ch[i],map.get(ch[i]));
           
       }
        
    }
    
    static void solve(){
        
        int ans=0;
        
        l--;
        r--;
        
        if(l==r){
            
            out.println( map.get( ch[l] ) );
            out.flush();
            
            return;
            
        }
        
      /* while(r>l){
           
           ans+=freq[l].count+freq[r].count;
           
           l++;
           r--;
           
           if(l==r){
               
               ans+=freq[l].count;
               
           }
           
       }*/
        
    if(l==0){
        
        ans=per[r];
        
    }else{
    
    ans=per[r]-per[l-1];
    
    }
    
       out.println(ans);
       out.flush();
       
    }
    
    public static void main(String[] amit) throws IOException {
        
      //  solveFreq();
        
        for(int i=0;i<26;i++){
            
            map.put(a[i], i+1);
            
        }
        
        n=in.nextInt();
        q=in.nextInt();
        
        s=in.next();
        
        solveFreq();
        
        /*for(Pair i: freq){
            
            out.println(i.toString());
            out.flush();
            
        }*/
    
        per=new int[n];
        
        per[0]=freq[0].count;
        
        for(int i=1;i<n;i++){
            
            per[i]=per[i-1]+freq[i].count;
            
        }
        
        /*for(int i: per){
            
            out.print(i+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();*/
        
        for(int i=0;i<q;i++){
            
            l=in.nextInt();
            r=in.nextInt();
            
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

7 3
abacaba
1 3
2 5
1 7


*/

/*

13 7
sonoshikumiwo
1 5
2 10
7 7
1 13
4 8
2 5
3 9


*/

/*

7 4
abbabaa
1 3
5 7
6 6
2 4


*/

/*

7 1
abbabaa
1 3

*/