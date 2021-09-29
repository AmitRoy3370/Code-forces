import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_A_New_Technique{
		
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int testCases,n,m;

static int a[],coloumns[];

static StringBuilder sb=new StringBuilder();

static void solve(){
	
	int ans[][]=new int[n][m];
	
	for(int i=1;i<=n*m;i++){
		
		/*for(int j=0;j<n;j++){
			
			ans[j][i]=coloumns[i][j];
			
		}*/
		
		ans[ coloumns[i] ][ a[i] ]=i;
		
	}
	
	for(int i=0;i<n;i++){
		
		for(int j=0;j<m;j++){
			
//			out.print( ans[i][j]+" " );
	//		out.flush();
		
sb.append( ans[i][j] ).append(" ");
		
		}
		
		//out.println();
	//	out.flush();
		
		sb.append("\n");
		
	}
	
}

	public static void main(String []amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			m=in.nextInt();
			
			a=new int[n*m+1];
			
			coloumns=new int[m*n+1];
			
			for(int i=0;i<n;i++){
				
				for(int j=0;j<m;j++){
					
					int y=in.nextInt();
					
					a[y]=j;
					
				}
				
			}
			
			for(int i=0;i<m;i++){
				
				for(int j=0;j<n;j++){
					
					//coloumns[i][j]=in.nextInt();
					
			//	}
				
				int y=in.nextInt();
				
				coloumns[y]=j;
				
			}
				
			}
			
			solve();
			
		}
		
		in.close();
		
		out.println(sb);
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
2 3
6 5 4
1 2 3
1 6
2 5
3 4
3 1
2
3
1
3 1 2

*/

/*

1
2 3
6 5 4
1 2 3
1 6
2 5
3 4

*/
