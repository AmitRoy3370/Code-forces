import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Sasha_and_Magnetic_Machines{
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n;

static long a[];

	public static void main(String [] amit) throws IOException{
		
		n=in.nextInt();
		
		a=new long[n];
		
		long sum=0;
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextLong();
			
			sum+=a[i];
			
		}
		
		in.close();
		
		sort(a,0,n-1);
		
		long index=0;
		
		for(int i=n-1;i>=1;i--){
			
			if( !isPrime(a[i]) ){
				
				for(int j=2;j<=(int)a[i];j++){
					
					if( a[i]%j==0 ){
						
					index=Math.max(index,a[0]+a[i]-a[i]/j-a[0]*j );	
						
					}
					
				}
				
			}
			
		}
		
		/*if(index==-1){
			
			out.println(sum);
			out.flush();
			
			return;
			
		}else if( a[index]%2==0 ){
			
			a[index]/=2;
			
			a[0]*=2;
			
		}else{
			
			a[index]/=3;
			
			a[0]*=3;
			
		}*/
		
		long ans=0;
		
		for(long i: a){
			
			ans+=i;
			
		}
		
		out.println( (ans-index) );
		out.flush();
		
	}
		
		static boolean isPrime(long x){
			
			for(long i=2;i<=(long)Math.sqrt(x);i++ ){
				
				if(x%i==0){
					
					return false;
					
				}
				
			}
			
			return true;
			
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

/*

2
94 70

*/

/*

184
81 32 32 64 17 64 17 32 16 2 32 9 9 17 17 49 8 2 16 9 2 4 27 27 17 8 17 2 32 17 8 2 32 8 17 9 29 8 17 8 16 2 9 8 8 32 13 9 64 8 27 2 32 27 16 8 8 9 32 2 81 16 16 2 4 81 64 49 17 2 2 17 32 9 2 17 17 8 16 64 13 8 64 2 3 9 64 32 17 49 31 13 2 8 27 16 16 32 32 2 49 16 81 32 27 9 17 32 27 32 17 4 4 17 32 9 32 8 2 4 27 16 4 7 32 29 9 8 8 27 32 31 32 3 2 8 17 64 2 5 8 2 17 81 27 9 64 3 9 2 49 49 25 4 16 32 17 64 16 3 8 8 32 2 9 2 32 27 27 9 4 32 2 8 64 13 64 29 8 64 13 2 27 2

*/