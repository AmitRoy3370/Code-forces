import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Birthday {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n;
    
    static long a[];
    
    static void solve(){
        
		for(int i=0;i<n;i+=2){
			
			out.print(a[i]+" ");
			out.flush();
			
		}
		
		if(n%2==0){
			
			for(int i=n-1;i>=0;i-=2){
				
				out.print(a[i]+" ");
				out.flush();
				
			}
			
		}else{
			
			for(int i=n-2;i>=0;i-=2){
				
				out.print(a[i]+" ");
				out.flush();
				
			}
			
		}
		
		out.println();
		out.flush();
		
        /*int i=0;
        long previous=a[0]+1;
        
        while(true){
            
            boolean r=false;
            
            if(a[i]!=0 && Math.abs(previous-a[i])==1 ){
            
            out.print(a[i]+" ");
            out.flush();
            
            r=true;
            
            }
            
            int j=i;
            
            while( i+1<n && a[i]==a[i+1] ){
                
                i++;
                
            }
            
            if(r){
            
                previous=a[j];
                
            a[j]=0;
            
            }
            
            int countZero=0;
            
            for(int k=0;k<n;k++){
                
                if(a[k]==0){
                    
                    countZero++;
                    
                }
                
            }
            
            if(countZero==n){
                
                break;
                
            }
            
            i=(++i)%n;
            
        }*/
          
    }
    
    public static void main(String[] amit) throws IOException  {
        
        n=in.nextInt();
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        in.close();
        
        sort(a,0,n-1);
        
        /*boolean already=false;
        
        for(int i=0;i<n-1;i++){
            
            if( a[i]==a[i+1] ){
                
                already=true;
                
                break;
            }
            
        }*/
        
        /*if(!already){
            
            for(long i: a){
                
                out.print(i+" ");
                out.flush();
                
            }
            
            out.println();
            out.flush();
            
        }else{*/
            
            solve();
            
        //}
        
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

5
2 1 1 3 2


*/

/*

5
900 153 2825 93 2819

*/