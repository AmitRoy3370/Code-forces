
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class E_Restaurant_Customers {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static long arrival[];
    
    static long reach[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        arrival=new long[n];
        
        reach=new long[n];
        
        for(int i=0;i<n;i++){
            
           arrival[i]=in.nextLong();
           reach[i]=in.nextLong();
            
        }
        
        Arrays.sort(arrival);
        
       Arrays.sort(reach);
        
        int i=0,j=0;
        
        long current=0,max=0;
        
        while(i<n && j<n){
            
            if(arrival[i]<reach[j]){
                
                current++;
                
                i++;
                
            }else{
                
                current--;
                j++;
                
            }
            
            if(current>max){
                
                max=current;
                
            }
            
        }
        
        out.println(max);
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
5 8
2 4
3 9


*/

/*

6
1 2
3 4
5 6
7 8
9 10
11 12

*/