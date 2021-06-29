
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Canine_poetry {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases;
    
    static String s;
    
    static void solve1(){
        
        char ch[]=s.toCharArray();
        
        int n=ch.length,ans=0;
        
        boolean visited[]=new boolean[n];
        
        for(int i=1;i<n;i++){
            
            boolean visit=false;
            
            if( ch[i-1]==ch[i] && !visited[i-1] ){
                
                visit=true;
                
            }
            
            if(i>1 && ch[i-2]==ch[i] && !visited[i-2] ){
                
                visit=true;
                
            }
            
            visited[i]=visit;
            
            if(visited[i]){
                
                ans++;
                
            }
            
        }
        
        out.println(ans);
        out.flush();
        
    }
    
    static void solve(){
        
        char ch[]=s.toCharArray();
        
        int ans=0,n=ch.length;
    
        boolean visited[]=new boolean[n];
        
        if(n==1){
            
            out.println(0);
            out.flush();
            
            return;
            
        }
        
        for(int i=0;i<n-1;i++){
            
            if(ch[i]==ch[i+1]){
            
                ans++;
            
               // visited[i]=true;
                
                out.println("increase for: i: "+i+" j: "+(i+1) );
                out.flush();
                
                try{
               
                    if( !visited[i] && ch[i]==ch[i+2]){
                 
                        visited[i]=true;
                        
                    out.println("increase for: i: "+(i+1)+" j: "+(i+2) );
                out.flush();
                   i++;
                   ans++;
                   
               }
                    
              else if( !visited[i+1] && ch[i+1]==ch[i+3]){
                   
                  visited[i+1]=true;
                  
                    out.println("increase for: i: "+(i+1)+" j: "+(i+3) );
                out.flush();
                 
                   ans++;
               
                   i++;
                   
               }
               
               }catch(ArrayIndexOutOfBoundsException e){
                   
                
               }
                
                visited[i]=true;
                
                i++;
                
           /*     if(i==n-2){
                    
                    if(ch[n-3]==ch[n-1]){
                        
                            out.println("increase for: i: "+(n-3)+" j: "+(n-1) );
                out.flush();
                        
                        ans++;
                      //  i++;
            
                      break;
                      
                    }
                    
                }*/
                
            }
            
          else  if( i<n-2 && !visited[i] && ch[i]==ch[i+2] ){
                
              visited[i]=true;
              
               out.println("increase for: i: "+i+" j: "+(i+2) );
                out.flush();
              
               try{
               
               if( !visited[i+1] && ch[i+1]==ch[i+3]){
                   
                   visited[i+1]=true;
                   
                  out.println("increase for: i: "+(i+1)+" j: "+(i+3) );
                out.flush();
                   
                   ans++;
                   
               }
               
               }catch(ArrayIndexOutOfBoundsException e){
                   
               }
               
               visited[i]=true;
               
                i+=2;
                
                ans++;
                
            }
            
        }
        
     /*   if( n%2==1 && ch[n-2]==ch[n-1]){
            
            ans++;
            
        }*/
        
        out.println(ans);
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            s=in.next();
            
            solve1();
            
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

7
babba
abaac
codeforces
zeroorez
abcdcba
bbbbbbb
a


*/

/*

1
abcdcba

*/

/*

1
babba

*/

/*

1
aarraapprraaa

*/

/*

1
mnmnmamaelelobob

*/

/*

1
mmmmmmmtmsammmmmmfm

*/

/*

1
abdabdbbbbbbbbbb

*/

/*

1
ccacbbababaabbacbbbaa

*/