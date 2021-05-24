import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D_Corrupted_Array {
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
	
	static int testCases,n;
	
	static long a[];
	
	static void merge(long arr[],int left,int right,int mid){
		
		int n1=mid-left+1,n2=right-mid;
		
		long L[]=new long[n1];
		
		long R[]=new long[n2];
		
		for(int i=0;i<n1;i++){
			
			L[i]=arr[left+i];
			
		}
		
		for(int i=0;i<n2;i++){
			
			R[i]=arr[mid+1+i];
			
		}
		
		int i=0,j=0,k=left;
		
		while(i<n1 && j<n2){
			
			if( L[i]<=R[j] ){
				
				arr[k]=L[i];
				
				i++;
				
			}else{
				
				arr[k]=R[j];
				
				j++;
				
			}
			
			k++;
			
		}
		
		while(i<n1){
			
			arr[k]=L[i];
			
			k++;
			i++;
			
		}
		
		while(j<n2){
			
			arr[k]=R[j];
			
			j++;
			k++;
			
		}
		
	}
	
	static void sort(long arr[],int left,int right){
		
		if(left>=right){
			
			return;
			
		}
		
		int mid=(left+right)/2;
		
		sort(a,left,mid);
		
		sort(a,mid+1,right);
		
		merge(a,left,right,mid);
		
	}
	
	static void solve(){
		
//Arrays.sort(a);		
	
sort(a,0,a.length-1);
	
		long sum=0;
		
		for(int i=0;i<=n;i++){
			
			sum+=a[i];
			
		}
		
		int id=-1;
		
		for(int i=0;i<=n;i++){
			
			if( (sum-a[i])==a[n+1] ){
				
				id=i;
				break;
				
			}
			
		}
	
	if(id==-1){
		
		sum-=a[n];
		
		if(sum==a[n]){
			
			id=n;
			
		}
		
	}
	
	if(id==-1){
		
		out.println(-1);
		out.flush();
		
	}else{
		
		for(int i=0;i<=n;i++){
			
			if(i!=id){
				
				out.print(a[i]+" ");
				out.flush();
				
			}
			
		}
		
		out.println();
		out.flush();
		
	}
	
	}
	
	public static void main(String[] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new long[n+2];
			
			for(int i=0;i<n+2;i++){
				
				a[i]=in.nextLong();
				
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
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
    
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
    }
	
}