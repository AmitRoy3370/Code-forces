import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Number_Circle{
			
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n;

static long a[];

	public static void main(String [] amit) throws IOException{
		
		n=in.nextInt();
		
		a=new long[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextLong();
			
		}
		
		sort(a,0,n-1);
		
		if( a[n-1]>=a[n-2]+a[n-3] ){
			
			out.println("NO");
			out.flush();
			
		}else{
			
			out.println("YES");
			out.flush();
			
			long temp=a[n-1];
			a[n-1]=a[n-2];
			a[n-2]=temp;
			
			for(long i: a){
				
				out.print(i+" ");
				out.flush();
				
			}
			
		}
		
		/*long ans[]=new long[n];
		
		int i=0;
		
		for( i=0;i<n/2;i++){
			
			ans[i]=a[i];
			
		}
		
		int k=i;
		
		for(int j=n-1;j>=i;j--){
			
			ans[k++]=a[j];
			
		}
	
	for( i=0;i<n;i++){
		
		if(  a[i%n]>=a[(int)Math.abs(i-1)%n]+a[(i+1)%n] ){
			
			out.println("NO");
			out.flush();
			
			return;
			
		}
		
	}
	
out.println("YES");
out.flush();
	
		for(long i1: ans){
			
			out.print(i1+" ");
			out.flush();
			
		}*/
		
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