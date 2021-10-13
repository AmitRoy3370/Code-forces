import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class C_Save_More_Mice {

	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n,testCases;
    
    static int k;
    
    static long a[];
    
    static void solve(){
        
        if(k==1){
            
            out.println(1);
            out.flush();
            
            return;
            
        }
        
        sort(a,0,k-1);
        
        long cat=1;
        
		long dp[]=new long[k];
		
		for(int i=0;i<k;i++){
			
			dp[i]=n-a[i];
			
		}
		
		int ans=0;
		
		for(int i=k-1;i>=0;i--){
			
			if( n-cat>=dp[i] ){
				
				cat+=dp[i];
				
				ans++;
				
			}
			
			if( cat>=n ){
				
				break;
				
			}
			
			//ans++;
			
		}
		
		out.println(ans);
		out.flush();
		
        /*Map<Long,Boolean> map=new HashMap<>();
        
        Map<Long,Integer> counter=new HashMap<>();
        
        for(long i: a){
            
            map.put(i,true);
            
            if(counter.containsKey(i)){
                
                counter.put(i,counter.get(i)+1);
                
            }else{
                
                counter.put(i, 1);
                
            }
            
        }
        
        long ans=0;
        
        int j=0;
        
        for(int i=k-1;i>=0;i--){
            
            long was=a[i];
            
            a[i]=(n-a[i]);
            
            if( map.containsKey(was) && counter.get(was)<=1 ){
                
                map.remove(was);
            
                counter.remove(was);
			
            }else{
				
				int h=counter.get(was);
				
				counter.put(was,h-1 );
				
			}
            
            ans++;
            
       //     map.put( a[i],true );
            
            cat+=(n-was);
            
            //out.println("cat: "+cat);
            //out.flush();
            
            while( j<k && i!=j && cat>=a[j++] && cat<=n && map.containsKey(a[j-1]) ){
                
             //   ans++;
            
             if( counter.get(a[j-1])<=1 ){
             
             map.remove(a[j-1]);
             
             }else{
				 
				 int g=counter.get(a[j-1]);
				 
				 counter.put( a[j-1],g-1 );
				 
			 }
             
                if(j>=k){
                    
                    break;
                    
                }
                
            }
            
         //   out.println("ans: "+ans );
           // out.flush();
            
            if( j>=k || cat>=n ){
                
                break;
                
            }
            
            /*if( map.containsKey(cat)  ){
                
                ans++;
                
            }
            
        }
        
        out.println(ans-1);
        out.flush();*/
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            k=in.nextInt();
            
            a=new long[k];
            
            for(int i=0;i<k;i++){
                
                a[i]=in.nextLong();
                
            }
            
            solve();
            
        }
        
        in.close();
        
    }
     	
   static void merge(long a[],int left,int right,int mid){
        
        int n1=mid-left+1,n2=right-mid;
        
        long L[]=new long[n1];
        
        long R[]=new long[n2];
        
        for(int i=0;i<n1;i++){
            
            L[i]=a[left+i];
            
        }
        
        for(int i=0;i<n2;i++){
            
            R[i]=a[mid+1+i];
            
        }
        
        int i=0,j=0,k1=left;
        
        while(i<n1 && j<n2){
            
            if( L[i]<=R[j] ){
                
                a[k1]=L[i];
                
                i++;
                
            }else{
                
                a[k1]=R[j];
                
                j++;
                
            }
            
            k1++;
            
        }
        
        while(i<n1){
            
            a[k1]=L[i];
            
            i++;
            
            k1++;
            
        }
        
        while(j<n2){
            
            a[k1]=R[j];
            
            j++;
            k1++;
            
        }
        
    }
    
    static void sort(long a[],int left,int right){
        
        if(left>=right){
            
            return;
            
        }
        
        int mid=(left+right)/2;
        
        sort(a,left,mid);
        
        sort(a,mid+1,right);
        
        merge(a,left,right,mid);
        
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
10 6
8 7 5 4 9 4
2 8
1 1 1 1 1 1 1 1
12 11
1 2 3 4 5 6 7 8 9 10 11


*/

/*

1
10 6
8 7 5 4 9 4

*/

/*

1
4 2
2 2

*/