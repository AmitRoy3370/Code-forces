
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Stone_Game {

       static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
    
        static int testCases,n;
        
        static int a[];
        
        static void solve(){
            
       /*     int maxIndex=-1,minIndex=-1,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            
            for(int i=0;i<n;i++){
                
                if(max<a[i]){
                    
                    max=a[i];
                    
                    maxIndex=i;
                    
                }
                
                if(min>a[i]){
                    
                    min=a[i];
                    
                    minIndex=i;
                    
                }
                
            }
            
            minIndex++;
            maxIndex++;
             
            int minimum=Math.min(maxIndex,minIndex);
            int maximum=Math.max(maxIndex,minIndex );
            
            int x=Math.min(minimum-1, n-minimum);
            
            if(x==0){
                
                x=1;
                
            }else{
                
                x++;
                
            }
    
     //       n-=x;
            
            int y=Math.min(maximum-1,n-maximum);
            
            if(y==0){
                
                y=1;
                
            }else{
                
                y++;
                
            }
            
            out.println("x: "+x+" y: "+y);
            out.flush();
            
           int step=x+y;
            
          // step+=2;
           
           out.println(step);
           out.flush();*/
           
       int p1 = 0,p2 = 0;
       
       for(int i=0;i<n;i++){
           
           if(a[i]==1){
               
               p1=i;
               
           }
           
           if(a[i]==n){
               
               p2=i;
               
           }
           
       }
       
      int lp1=p1+1;
       int lp2=p2+1;
       
       int rp1=n-p1;
       int rp2=n-p2;
       
       int ans1=Math.max(lp1,lp2);
       
       int ans2=Math.max(rp1,rp2);
       
       int ans3=Math.min(lp1+rp2, lp2+rp1);
       
       int ans=Math.min(ans1, Math.min(ans2,ans3));
       
       out.println(ans);
       out.flush();
       
        }
        
    public static void main(String[] amit) throws IOException {
        
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
/*

1
8
2 1 3 4 5 6 8 7

*/

/*

5
5
1 5 4 3 2
8
2 1 3 4 5 6 8 7
8
4 2 3 1 8 6 7 5
4
3 4 2 1
4
2 3 1 4


*/

/*

1
5
1 5 4 3 2

*/

/*

1
4
2 3 1 4

*/

/*

1
4
3 4 2 1

*/