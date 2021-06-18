import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class C_Two_Shuffled_Sequences{
	
	 static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int n;
	
	static int a[];

static boolean checkValidity(){
	
	for(int i=0;i<n-2;i++){
		
		if( a[i]==a[i+1] && a[i+1]==a[i+2] ){
			
			return false;
			
		}
		
	}
	
	return true;
	
}	

	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		
		a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		Arrays.sort(a);
		
		if( !checkValidity() ){
			
			out.println("NO");
			out.flush();
			
			return;
			
		}
		
		List<Integer> increasing=new ArrayList<>();
		List<Integer> decreasing =new ArrayList<>();
		
		for(int i=0;i<n-1;i++){
			
			if(a[i]==a[i+1]){
				
				increasing.add(a[i]);
			
                decreasing.add(a[i+1]);     
		
i++;
		
			}else{
				
				increasing.add( a[i] );
				
			}
			
		}
		
		if( increasing.size()+decreasing.size()!=n ){
			
			increasing.add(a[n-1]);
			
		}
	
out.println("YES");
out.flush();
	
		out.println( increasing.size() );
		out.flush();
		
		for(int i: increasing){
			
			out.print(i+" ");
			out.flush();
			
		}
		
		out.println();
		out.flush();
		
		out.println( decreasing.size() );
		out.flush();
		
		n=decreasing.size();
		
		for(int i=n-1;i>=0;i--){
			
			out.print( decreasing.get(i)+" " );
			out.flush();
			
		}
		
		out.println();
		out.flush();
		
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