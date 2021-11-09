
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Cinema_Cashier{
	
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
	static int n,k;
	
	static int M[];
	
	static boolean visit[][];
	
	static void solve(){
		
		int x=0,y=0,center=(k+1)>>1;
		
		for(int request=0;request<n;request++){
			
			int min=Integer.MAX_VALUE;
			
			int m=M[request];
			
			//int center=(k+1)>>2;
			
			for(int i=1;i<=k;i++){
				
				for(int j=1;j<=k-m+1;j++){
					
					boolean ok=true;
					
					int count=0;
					
					for(int l=j;l<=j+m-1;l++){
						
						if( visit[i][l] ){
							
							ok=false;
							break;
							
						}else{
							
							count+=Math.abs(i-center)+Math.abs(l-center);
							
						}
						
					}
					
					if(ok && min>count){
						
						min=count;
						x=i;
						y=j;
						
					}
					
				}
				
			}
			
            if( min==Integer.MAX_VALUE ){
				
				out.println(-1);
				out.flush();
				
			}else{
				
				out.println(x+" "+y+" "+(y+m-1) );
				out.flush();
				
				for(int j=y;j<m+y;j++){
					
					visit[x][j]=true;
					
				}
				
			} 
			
		}
		
	}
	
	public static void main(String [] amit) throws IOException{
		
		n=in.nextInt();
		
		k=in.nextInt();
		
		M=new int[n];
		
		visit=new boolean[111][111];
		
		for(int i=0;i<n;i++){
			
			M[i]=in.nextInt();
			
		}
		
		in.close();
		
		solve();
		
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
