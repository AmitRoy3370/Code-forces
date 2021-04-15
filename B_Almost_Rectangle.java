
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_Almost_Rectangle {

    static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static String s[][];
    
    static class pair{
        
        int frst,second;

        public pair(int frst, int second) {
            this.frst = frst;
            this.second = second;
        }

        public int getFrst() {
            return frst;
        }

        public void setFrst(int frst) {
            this.frst = frst;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }
        
    }
    
    static void solve() throws IOException{
        
        List< pair > list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            
            String t=in.next();
            
            for(int j=0;j<t.length();j++){
                
                s[i][j]=  String.valueOf(t.charAt(j));
                
            }
            
        }
        
        for(int i=0;i<n;i++){
            
          //  s[i]=in.next();
        
            for(int j=0;j<n;j++){
                
                if( "*".equals(s[i][j]) ){
                    
        list.add( new pair(i,j) );
                    
                }
                
            }
            
        }
        
        list.add( list.get(0) );
        list.add( list.get(1) );
        
        if( list.get(0).getFrst()==list.get(1).getFrst() ){
            
            list.get(2).setFrst( (list.get(2).getFrst()+1)%n );
            
            list.get(3).setFrst( (list.get(3).getFrst()+1)%n );
            
        }else if( list.get(0).getSecond()==list.get(1).getSecond() ){
            
             list.get(2).setSecond( (list.get(2).getSecond()+1)%n );
            
            list.get(3).setSecond( (list.get(3).getSecond()+1)%n );
            
        }else{
            
            int tmp=list.get(2).getFrst();
            
            list.get(2).setFrst( list.get(3).getFrst() );
            
            list.get(3).setFrst(tmp);
            
        }
        
        int i=list.get(2).getFrst();
        
        int j=list.get(2).getSecond();
        
        char ch='*';
        
        s[i][j]=String.valueOf(ch);
        
  //  s[ i ]=sb.toString();
    
    i=list.get(3).getFrst();
    j=list.get(3).getSecond();
    
    s[ i ][j]=String.valueOf(ch);
    
    //s[ i ].charAt( j )=ch;   
    
    for(String i1[]: s){
        
        for(String j1: i1){
            
    out.print(j1);
    out.flush();        
            
        }
   
        out.println();
       
        out.flush();
        
    }
    
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            s=new String[n][n];
            
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
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
        
    }
    
}
/*

6
4
..*.
....
*...
....
2
*.
.*
2
.*
.*
3
*.*
...
...
5
.....
..*..
.....
.*...
.....
4
....
....
*...
*...

*/

/*

1
4
..*.
....
*...
....

*/