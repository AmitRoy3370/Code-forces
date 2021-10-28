import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Discrete_Acceleration{
	
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n;
	
	static double l;
	
	static double a[];

    static void solve(){
		
		double x=0,y=l;
		
		int i=0,j=n-1;
		
		double time=0,xSpeed=1,ySpeed=1;
		
		while(y>x){
			
	       if(j<i){
			   
			   time+=Math.abs(y-x)/(xSpeed+ySpeed);
			   
			   break;
			   
		   }
			
			double leftElement=(a[i]-x)/xSpeed;
			
			double rightElement=(y-a[j])/ySpeed;
			
			x+=Math.min(leftElement,rightElement)*xSpeed;
			
			y-=Math.min( leftElement,rightElement )*ySpeed;
			
			time+=Math.min(leftElement,rightElement);
			
			if( rightElement>leftElement ){
				
				i++;
				
				xSpeed++;
				
			}else{
				
				ySpeed++;
				
				j--;
				
			}
			
		}
		
		out.println(time);
		out.flush();
		
	}

	public static void main(String [] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			l=in.nextDouble();
			
			a=new double[n];
			
		    for(int i=0;i<n;i++){
				
				a[i]=in.nextDouble();
				
			}
			
			solve();
			
		}
		
	}
		
    static long gcd(long a, long b)   
{   
  
if (a == 0)   
return b;   
if (b == 0)   
return a;   
if (a == b)   
return a;   
if (a > b)   
return gcd(a-b, b);   
return gcd(a, b-a);   
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