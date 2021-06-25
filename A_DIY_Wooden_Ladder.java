import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class A_DIY_Wooden_Ladder{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int testCases,n;
	
	static int a[];
	
	static void merge(int a[],int left,int right,int mid){
		
		int n1=mid-left+1,n2=right-mid;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for(int i=0;i<n1;i++){
			
			L[i]=a[left+i];
			
		}
		
		for(int i=0;i<n2;i++){
			
			R[i]=a[mid+1+i];
			
		}
		
		int i=0,j=0,k=left;
		
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
	
	static void sort(int a[],int left,int right){
		
		if(left>=right){
			
			return;
			
		}
		
		int mid=(left+right)/2;
		
		sort( a,left,mid );
		sort(a,mid+1,right);
		
		merge(a,left,right,mid);
		
	}
	
	static void solve(){
			
		sort(a,0,n-1);
				
		if( a[n-2]<=1 || n<=2 ){
			
			out.println(0);
			out.flush();
			
			return;
			
		}
		
		int ans=Math.min( a[n-2]-1,n-2 );
		
		out.println(ans);
		out.flush();
		
	}
	
	public static void main(String [] amit) throws IOException{
		
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