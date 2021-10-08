import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class D_Candy_Box_easy_version{
				
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int testCases,n;

static long a[];

static void solve(){
	
	sort(a,0,n-1);
	
	Map<Integer,Long> map=new HashMap<>();
	
	for(int i=0;i<n;i++){
		
		int have=0;
		
		long element=a[i],j=i;
		
		while( i+1<n && a[i]==a[i+1] ){
			
		have++;
			
			i++;
			
		}
		
	//	if(j!=i){
			
			have++;
			
		//}
		
		if( !map.containsKey( have ) ){
		
		map.put( have,element );
		
		}else{
			
			while( have>0 && map.containsKey(have) ){
				
				have--;
				
			}
			
			if(have>0){
				
				map.put(have,element);
				
			}
			
		}
		
	}
	
	long y=0;
	
for ( Map.Entry<Integer, Long> entry : map.entrySet()) {
    
//	out.println( entry.getKey()+" "+entry.getValue() );
	//out.flush();
	
	y+=entry.getKey();
    
}
	
	out.println(y);
	out.flush();
	
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