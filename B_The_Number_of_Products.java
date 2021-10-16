import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class B_The_Number_of_Products{
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n;
	
	static long a[];
	
	static long prefix[];
	
	static long positive=0,negative=0;
	
	static Map<Map<Integer,Integer>,Boolean  > map=new HashMap<>();
    
    static long dp[][];
	
	static long dpSolution(int index,int k){
		
		if( index==0 ){
			
			if(k==1){
				
				dp[index][k]=( a[index]<0 )?1:0;
				
				return dp[index][k];
				
			}else{
				
				dp[index][k]=( a[index]>0 )?1:0;
				
				return dp[index][k];
				
			}
			
		}
		
		if( dp[index][k]!=-1 ){
			
			return dp[index][k];
			
		}
		
		long ans=0;
		
		if(k==0){
			
			if( a[index]>0 ){
			
			ans=1+dpSolution( index-1,0 );
			
			}else{
				
				ans=dpSolution(index-1,1);
				
			}
			
		}else{
		
		   if( a[index]>0 ){
			
			ans=dpSolution( index-1,1 );
		
		   }else{
			   
			   ans=1+dpSolution(index-1,0);
			   
		   }
		
		}
		
		dp[index][k]=ans;
		
		return dp[index][k];
		
	}
	
    /*static void solve(int left,int right){
		
		//out.println("left: "+left+" right: "+right);
		//out.flush();
		
		if( left>=n || right>=n  ){
			
			return;
			
		}
		
		if( left>right ){
			
			left=right;
			
			right=left;
			
			if(left>=n){
				
				return;
				
			}
			
		}
		
	//	out.println("left: "+left+" right: "+right);
		//out.flush();
		
		Map<Integer,Integer> visited=new HashMap<>();
		
		visited.put( left,right );
		
		if( !map.containsKey(visited) ){
		
		map.put( visited,true );
		
		if(left==0){
			
		  if( right<n && prefix[right]>0 ){
			  
			  positive++;
			  
		  }else{
			  
			  if(right<n){
			  
			  negative++;
			  
			  }
			  
		  }
			
			solve( left+1,right );
			
			solve( left,right+1 );
			
		}else if(left==right){
			
			if( left<n && a[left]>0 ){
				
				positive++;
				
			}else{
				
				if(left<n){
				
				negative++;
				
				}
				
			}
			
			solve(left+1,right);
			solve(left,right+1);
			
		}else{
			
			try{
			
		  if( right<n && left>0 && prefix[right]/prefix[left-1]>0 ){
			  
			  positive++;
			  
		  }else{
			  
			  if(left>0 && right<n){
			  
			  negative++;
			  
			  }
			  
		  }
			
			}catch(Exception exceptopn){
				
				//return;
				
			}
			
			solve( left+1,right );
			
			solve( left,right+1 );			
			
		}
		
		}
		
	}*/

	public static void main(String [] amit) throws IOException{
		
		n=in.nextInt();
		
		a=new long[n];
		
		prefix=new long[n];
		
		dp=new long[n][2];
		
		//0 for the odd
		//1 for the even
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextLong();
			
			dp[i][0]=-1;
			dp[i][1]=-1;
			
		}
		
		/*prefix[0]=a[0];
		
		for(int i=1;i<n;i++){
			
			prefix[i]=a[i]*prefix[i-1];
			
		}*/
		
		dpSolution(n-1,0  );
		dpSolution(n-1,1);
		
		for(int i=0;i<n;i++){
			
			positive+=dpSolution( i,0 );
			negative+=dpSolution(i,1);
			
		}
		
		/*for(long i: prefix){
			
			out.print(i+" ");
			out.flush();
			
		}
		
		out.println();
		out.flush();*/
		
		//solve(0,0);
		
		out.print( negative+" "+positive );
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

10
-27433367 -21216390 1 303383863 -799030648 -1 160141051 -1 -342089574 -215298491

*/