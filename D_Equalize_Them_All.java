import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class D_Equalize_Them_All{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int n;
	
	static long a[];
	
	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		
		a=new long[n];
		
		//Map<Long,Integer>  map=new HashMap<>();
		
		Set<Long> set=new HashSet<>();
		
		long maximum=0;
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextLong();
			
			set.add(a[i]);
			
			maximum=Math.max(maximum,a[i]);
			
			//map.put(a[i],0);
			
		}
		
		if( set.size()==1 ){
			
			out.println(0);
			out.flush();
			
			return;
			
		}
		
		int b[]=new int[(int)maximum+1];
		
		for(int i=0;i<n;i++){
			
			b[(int)a[i]]++;
			
		}
		
		int fast=0;
		
		maximum=0;
		
		for(int i=0;i<b.length;i++){
			
			if( b[i]>maximum ){
				
				maximum=b[i];
				fast=i;
				
			}
			
		}
		
		int j=0;
		
		for(int i=0;i<n;i++){
			
			if(a[i]==fast){
				
				j=i;
				break;
				
			}
			
		}
		
		out.println( n-maximum );
		out.flush();
		
for(int i=j-1;i>=0;i--){
	
	if(a[i]<fast){
out.println("1 "+(i+1)+" "+(i+2));out.flush(); }
            else{
			out.println(2+" "+(i+1)+" "+(i+2));out.flush(); }
	
}		
		
		for(int i=j+1; i<n; i++)
        {
            if(a[i]==fast)
                continue;
            if(a[i]<fast){
			
			out.println(1+" "+(i+1)+" "+(i));
			out.flush();
			}
            else{
			out.println(2+" "+(i+1)+" "+i);
			out.flush(); }
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