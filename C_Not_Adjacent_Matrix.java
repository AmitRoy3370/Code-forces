
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Not_Adjacent_Matrix {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,testCases;
    
    static boolean vis[][];
    
    static long mat[][];
    
    static void solve(){
        
        if(n==1){
            
            out.println(1);
            out.flush();
            
            return;
            
        }
        
        if(n==2){
            
            out.println(-1);
            out.flush();
            
            return;
            
        }
        
        long t=1;
        
      /*  for(int i=0;i<n-1;i++){
            
            for(int j=0;j<n-1;j++){
                
                if(!vis[i][j]){
                 
                    int l=i,l1=i;
                    
                    for(int k=j;k<n;k++){

try{
                        
                        mat[l++][k]=((t++));
                        
                        vis[l1++][k]=true;
    
}catch(Exception e){
    
    
}
                        
                    }
                    
                }
                
            }
            
        }
        
        mat[0][n-1]=n*n-1;
        mat[n-1][0]=n*n;
        
        vis[0][n-1]=true;
        vis[n-1][0]=true;*/
        
/*        for(boolean i[]: vis){
            
            for(boolean j: i){
                
                out.print(j+" ");
                out.flush();
                
            }
            
            out.println();
            out.flush();
            
        }
        
/*for(int j=0;j<n;j++){
    
    int l=j,l1=j;
    
    for(int i=0;i<n;i++){
        
        if( !vis[i][j] ){
            
            try{
            
            mat[i][l1++]=t++;
            
            vis[i][l++]=true;
            
            }catch(Exception e){
                
                
            }
            
        }
        
    }
    
}

mat[0][n-1]=n*n-1;
mat[n-1][0]=n*n;*/

for(int i=0;i<n;i++){
    
    mat[i][i]=t++;
    
}

for(int i=1;i<n;i++){
    
    for(int j=0;j<n && i+j<n;j++){
        
        mat[j][i+j]=t++;
        
    }
    
    for(int j=0;j<n && i+j<n;j++){
        
        mat[i+j][j]=t++;
        
    }
    
}

       for(long i[]: mat){
           
           for(long j: i){
               
               out.print(j+" ");
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
        
            vis=new boolean[n][n];
            
            mat=new long[n][n];
            
            solve();
            
        }
        
    }
    
     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer( in.readLine() );
                
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
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
    
}
