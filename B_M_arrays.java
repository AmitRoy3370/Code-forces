
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B_M_arrays {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
    static int testCases,n,m;
    
    static long a[];
 
    static void solve(){
        
		int dp[]=new int[m+1];
		
		for(int i=0;i<n;i++){
			
			dp[ (int)(a[i]%m) ]++;
			
		}
		
		int ans=0;
		
		for(int i=0;i<m;i++){
			
			if(dp[i]>0 && (m-i)%m!=i ){
				
				int max=Math.max(dp[i],dp[(m-i)%m]);
				int min=Math.min( dp[i],dp[(m-i)%m] );
						
					if( min>=max-1 ){
						
						ans++;
						
					}else{
						
						ans+=1+max-min-1;
						
					}
					
					dp[i]=0;
					dp[ (m-i)%m ]=0;
				
			}else if(dp[i]>0){
				
				ans++;
				dp[i]=0;
				
			}
			
		}
		
		out.println(ans);
		out.flush();
		
      /* sort(a,0,n-1);
        
	   int maxLen=0,len=0;
	   
	   Map<Long,Boolean> map=new HashMap<>();
		
       for(int i=0;i<n;i++){
		   
		   long k=i;
		   len=0;
		   
		   for(int j=i+1;j<n;j++){
			   
			   //if( !map.containsKey(k) /*&& !map.containsKey(a[j]) ){
			   
			      if( (a[(int)k]+a[j])%m==0 ){
				   
				     len+=((map.containsKey(j) || map.containsKey(k))?1:2);
				   
				     //k=j;
				     
					 //map.put( a[j],true );
					 map.put(k,true);
					 
					 //out.print(a[(int)k]+" "+a[j]+" , ");
					 //out.flush();
					 
					 k=j;
					 
					 //out.println("true for the "+a[k]);
					 
					 map.put(k,true);
					 
					 //break;
				   
			        }
			   
			   //}
			   
		   }
		   
		   maxLen=Math.max(maxLen,len);
		   
		   //out.println("len: "+len);
		   //out.flush();
		   
		   map=new HashMap<>();
		   
		   //maxLen=len;
		   
	   }
        
		out.println(maxLen);
		out.flush();*/
		
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
           m=in.nextInt();
           
           a=new long[n];
            
           for(int i=0;i<n;i++){
               
               a[i]=in.nextLong();
               
           }
           
           solve();
           
        }
        
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
        
        int i=0,j=0,k=left;
        
        while(i<n1 && j<n2 ){
            
            if( L[i]<=R[j] ){
                
                a[k]=L[i];
                
                i++;
                
            }else {
                
                a[k]=R[j];
                
                j++;
                
            }
            
            k++;
            
        }
        
        while(i<n1){
            
            a[k]=L[i];
            
            i++;
            k++;
            
        }
        
        while(j<n2){
            
            a[k]=R[j];
            
            j++;
            k++;
            
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
