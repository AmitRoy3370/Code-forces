import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_MAX_MEX_Cut{
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
	
	static int testCases,n;
	
	static char a[];
	
	static char b[];
	
	static int mex(String a){
		
		int ans=0,n=a.length();
		
		for( int i=0;i<n;i++ ){
			
			if(a.charAt(i)=='0'){
				
				ans++;
				
			}
			
		}
		
		boolean ax=false,bx=false;
		
		//String s="";
		
		for(int i=0;i<n;i++){
			
			if( a.charAt(i)=='0' ){
				
				ax=true;
				
			}
			
			if(a.charAt(i)=='1'){
				
				bx=true;
				
			}
			
			if( ax && bx ){
				
				++ans;
				
				ax=false;
				
				bx=ax;
				
			}
			
		}
		
		return ans;
		
	}
	
	static void solve(){
		
		int ans=0;
		
		/*String s="";
		
		for(int i=0;i<n;i++){
			
			if( a[i]!=b[i] ){
				
		//		char t[]=s.toCharArray();
				
				ans+=2+mex(s);
				
				s="";
				
			}else{
				
				s+=a[i];
				
			}
			
		}
		
		//char t[]=s.toCharArray();
		
		ans=ans+mex(s);
		
		out.println(ans);
		out.flush();*/
		
		for(int i=0;i<n;i++){
			
			if( a[i]=='0' && b[i]=='0' ){
				
				if(i!=n-1 && a[i+1]=='1' && b[i+1]=='1' ){
					
					i++;
					
					ans+=2;
					
				}else{
					
					ans++;
					
				}
				
			}else if(a[i]=='0' && b[i]=='1' ){
				
				ans+=2;
				
			}else if(a[i]=='1' && b[i]=='0' ){
				
				ans+=2;
				
			}else if(a[i]=='1' && b[i]=='1' ){
				
				if(i!=n-1 && a[i+1]=='0' && b[i+1]=='0' ){
					
					i++;
					
					ans+=2;
					
				}
				
			}
			
		}
		
		out.println(ans);
		out.flush();
		
	}
	
	public static void main(String []amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=in.next().toCharArray();
			
			b=in.next().toCharArray();
			
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