import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class C_Boats_Competition{
	
	static int testCases,n;
	
	static long a[];
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static void solve(){
		
		Map<Long,Integer> map=new HashMap<>();
		
		for(long i=0;i<=2*n+1;i++){
			
			map.put(i,0);
			
		}
		
		for(long i: a){
			
			if( map.containsKey(i) ){
				
				map.put( i,map.get(i)+1 );
				
			}else{
				
				map.put(i,1);
				
			}
			
		}
		
		long ans=0;
		
		for(long i=2;i<=2*n;i++){
			
			long current=0;
			
			for(long x=1;x<=i/2;x++){
				
				if( 2*x==i ){
					
					current+=map.get((long)x)/2;
					
				}else{
					
					current+=Math.min( map.get((long)x),map.get( (long)(i-x) ) );
					
				}
				
			}
			
			ans=Math.max(ans,current );
			
		}
		
		out.println(ans);
		out.flush();
		
		/*sort(a,0,n-1);
		
		int ans=Integer.MIN_VALUE;
		
		for(int i=0;i<=n/2;i++){
			
			long sum=a[i]+a[n-i-1];
			
			int tempAns=0;
			
			int left=i,right=n-1;
			
			while(right>left){
				
				long tempSum=a[left]+a[right];
				
				if(sum==tempSum){
					
					tempAns++;
					
					ans=Math.max(ans,tempAns);
					
				}
				
				left++;
				right--;
				
				if(left==right){
					
					break;
					
				}
				
			}
			
		}
		
		out.println(ans);
		out.flush();*/
		
	} 

	public static void main(String [] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new long[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextLong();
				
			}
			
			solve();
			
		}
		
                in.close();
                
	}
	
	static long gcd(long a, long b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
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

1
6
1 1 3 4 2 2

*/