
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class H_Handling_the_Blocks{
		
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
	static int n,k;
	
	public static void main(String [] amit) throws IOException{
		
		n=in.nextInt();
		
		k=in.nextInt();
		
		element a[]=new element[n];
		
		element b[]=new element[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=new element(in.nextInt(),in.nextInt());
			
			b[i]=a[i];
			
		}
		
		sort(a,0,n-1);
		
		for(int i=0;i<n;i++){
			
			if( a[i].color!=b[i].color ){
				
				out.print("N");
				out.flush();
				
				return;
				
			}
			
		}
		
		out.print("Y");
		out.flush();
		
	}
	
	static class element{
		
		int a,color;
		
		public element(){
			
		}
		
		public element(int a,int color){
			
			this.a=a;
			this.color=color;
			
		}
		
	}
		
    static void merge(element a[],int left,int right,int mid){
        
        int n1=mid-left+1,n2=right-mid;
        
        element L[]=new element[n1];
        
        element R[]=new element[n2];
        
        for(int i=0;i<n1;i++){
            
            L[i]=a[left+i];
            
        }
        
        for(int i=0;i<n2;i++){
            
            R[i]=a[mid+1+i];
            
        }
        
        int i=0,j=0,k=left;
        
        while(i<n1 && j<n2 ){
            
            if( L[i].a<=R[j].a ){
                
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
    
    static void sort(element a[],int left,int right){
        
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