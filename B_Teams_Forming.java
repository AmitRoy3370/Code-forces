import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Teams_Forming{

static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
	
	static int n;
	
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
		
		sort(a,left,mid);
		
		sort(a, mid+1,right);
		
		merge( a,left,right,mid );
		
	}
	
	static void solve(){
		
		sort(a,0,n-1);
		
		/*for(int i: a){
			
			out.print(i+" ");
			out.flush();
			
		}
		
		out.println();
		out.flush();*/
		
		int ans=0;
		
		for(int i=0;i<n;i+=2){
			
			if( a[i]==a[i+1] ){
				
				//ans++;
				
			}else{
			
			ans+=( a[i+1]-a[i] );
			
			}
			
		//	out.println("ans: "+ans);
			//out.flush();
			
		}
		
		out.println(ans);
		out.flush();
		
	}
	
	public static void main(String amit[] ) throws IOException{
		
		n=in.nextInt();
	
a=new int[n];
	
	for(int i=0;i<n;i++){
		
		a[i]=in.nextInt();
		
	}
	
	in.close();
	
	solve();
	
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