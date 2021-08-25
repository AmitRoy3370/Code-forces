import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Simply_Strange_Sort {

        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
static int n,testCases;
    
static int a[];

static boolean isSorted(int a[],int b[]){
    
    for(int i=0;i<a.length;i++){
        
        if(a[i]!=b[i]){
            
            return false;
            
        }
        
    }
    
    return true;
    
}

static void solve(){
    
    int ans=1;
    
   int b[]=new int[n+1];
    
            System.arraycopy(a, 0, b, 0, n+1);
   
   Arrays.sort(b);
   
   int i=1,count=0;
   
   while( !isSorted(a,b) ){
   
      if(ans%2==1){
       
       for(int j=1;j<=n-1;j++){
           
           if( j%2==1 && a[j]>a[j+1] ){
               
               int temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
           
               count++;
               
           }
           
       }
        
      }else{
          
          for(int j=1;j<=n-1;j++){
           
           if( j%2==0 && a[j]>a[j+1] ){
               
               int temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
           
               count++;
               
           }
           
       }
          
      }
       
      // System.out.println("a: "+Arrays.toString(a));
      // if(count!=0){
     
           ans++;
       
       //}
       
       i++;
    
       
   }
   
    out.println(ans-1);
    out.flush();
    
}

    public static void main(String[] amit) throws IOException {
        
    testCases=in.nextInt();
    
for(int t=0;t<testCases;t++){
    
    n=in.nextInt();
    
    a=new int[n+1];
    
    for(int i=1;i<=n;i++){
        
        a[i]=in.nextInt();
        
    }
    
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
        boolean nextBoolean() throws IOException{
            
            return Boolean.parseBoolean(next());
            
        }
        
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
    
}
/*

3
3
3 2 1
7
4 5 7 1 3 2 6
5
1 2 3 4 5


*/

/*

1
7
4 5 7 1 3 2 6

*/

/*

1
3
3 2 1

*/