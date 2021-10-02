
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A1_Oh_Sweet_Beaverette {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n;
    
    static int a[];
    
    static long sum(int i,int j){
        
        long sum=a[i]+a[j];
        
        for(int index=i+1;index<j;index++){
            
            if( a[index]>0 ){
                
                sum+=a[index];
                
            }
            
        }
        
        return sum;
        
    }
    
    static void solve(){
        
        long sum=Long.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                
                if( a[i]==a[j] ){
                    
                    sum=Math.max( sum,sum(i,j) );
                    
                   // out.println("sum: "+sum);
                    //out.flush();
                    
                }
                
            }
            
        }
        
        out.print(sum+" ");
        out.flush();
        
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                
                if( a[i]==a[j] && sum(i,j)==sum ){
                    
                    int total=0;
                    
                 //   out.println(i+":i j: "+j);
                   // out.flush();
                    
                    StringBuilder sb=new StringBuilder();
                    
                    if(i!=0){
                    
                    for(int k=0;k<i;k++){
                        
                        sb.append(k+1).append(" ");
                        
                        total++;
                        
                    }
                   
                    }
                    for(int k=i+1;k<j;k++){
                        
                        if( a[k]<0 ){
                            
                            total++;
                            
                            sb.append(k+1).append(" ");
                            
                        }
                        
                    }
                    
                    if(j+1<n){
                    
                    for(int k=j+1;k<n;k++){
                        
                        sb.append(k+1).append(" ");
                        
                        total++;
                        
                    }
                    
                    }
                    
                    out.println(( total));
                    out.flush();
                    
                    out.println(sb);
                    out.flush();
                    
                    return;
                    
                }
                
            }
            
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new int[n];
        
        long sum=0,neg=0,summation=0;
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
         
            if(a[i]==0){
            
            sum++;
            
            }
            
            if(a[i]<0){
                
                neg++;
                
            }
            
            summation+=a[i];
            
        }
        
      // else{
        
        solve();
        
        //}
        
        in.close();
        
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

5
1 2 3 1 2


*/

/*

5
1 -2 3 1 -2


*/

/*

3
0 -1 0

*/

/*

4
-1 1 1 -1

*/

/*

3
-1 0 -1

*/

/*

3
-1000000000 -1000000000 -1000000000

*/