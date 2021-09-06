import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Less_or_Equal{
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
     
	static int n,k;
	
	static long a[];
	
	static void merge(long a[],int left,int right,int mid){
		
		int n1=mid-left+1,n2=right-mid;
		
		long L[]=new long[n1];
		
		long R[]=new long[n2];
		
		for(int i=0;i<n1;i++){
			
			L[i]=a[left+i];
			
		}
		
		for(int i=0;i<n2;i++){
			
			R[i]=a[mid+i+1];
			
		}
		
		int k=left,i=0,j=0;
		
		while(i<n1 && j<n2){
			
			if( L[i]<=R[j] ){
				
				a[k]=L[i];
				
				i++;
				
			}else{
				
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
		
		if( left>=right ){
			
			return;
			
		}
		
		int mid=(left+right)/2;
		
		sort( a,left,mid );
		
		sort( a,mid+1,right );
		
		merge(a,left,right,mid);
		
	}
	
	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		
		k=in.nextInt();
		
		a=new long[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextLong();
			
		}
		
		long ans=0,cnt=0;
				
sort(a,0,n-1);
		
		if(k==0){
			
			//out.println( a[0]-1 );
			//out.flush();
			
			ans=a[0]-1;
			
		//	return;
			
		}else{
		
		ans=a[k-1];
		
		}
		
		for(long i: a){
			
			if( ans>=i ){
				
				cnt++;
				
			}
			
		}
		
		if( cnt!=k || !( 1<=ans && ans<=1000 * 1000 * 1000 ) ){
			
			out.println(-1);
			out.flush();
			
			return;
			
		}
		
		out.println( ans );
		out.flush();
		
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