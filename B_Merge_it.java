
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Merge_it {

 static Scanner in=new Scanner();
        
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static int a[];
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n];
            
            int cnt[]=new int[3];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
                cnt[a[i]%3]++;
                
            }
            
            int ans=cnt[0];
            
           // Arrays.sort(cnt,1,2);
            
            int min=Math.min(cnt[1],cnt[2]);
            
            ans+=min;
            
            cnt[1]-=min;
            cnt[2]-=min;
            
            ans+=(cnt[1]+cnt[2])/3;
            
            out.println( ans );
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
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
    }    
    
}
/*

2
5
3 1 2 3 1
7
1 1 1 1 1 2 2


*/