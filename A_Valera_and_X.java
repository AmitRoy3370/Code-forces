import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class A_Valera_and_X{
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n;

static char a[][];

static void solve(){
	
	List<Character> left=new ArrayList<>();
	
	List<Character> right=new ArrayList<>();
	
	Set<Character> other=new HashSet<>();
	
	int k=n-1;
	
	for(int i=0;i<n;i++){
		
		for(int j=0;j<n;j++){
			
			if( i==j ){
				
				left.add(a[i][j]);
				
			}
			
			if(j==k){
				
right.add(a[i][j]);			
			
			}
			
			if(i!=j && j!=k ){
				
				other.add(a[i][j]);
				
			}
			
		}
		
		k--;
		
	}
	
	for(int i=0;i<left.size();i++ ){
	
	if( left.get(i)!=right.get(i) ){
		
		out.println("NO");
		out.flush();
		
		return;
		
	}
	
	}
	
	if( other.size()>1 ){
		
		out.println("NO");
		out.flush();
		
		return;
		
	}
	
	/*for(char i: left){
		
		out.print(i+" ");
		out.flush();
		
	}
	
	out.println();
	out.flush();
	
	for(char i: right){
		
		out.print(i+" ");
		out.flush();
		
	}
	
	out.println();
	out.flush();
	
	for(char i: other){
		
		out.print(i+" ");
		out.flush();
		
	}
	
	out.println();
	out.flush();*/
	
	List<Character> set=new ArrayList<>(other);
	
	Set<Character> setA=new HashSet<>();
	
	for(char i: left){
		
		setA.add(i);
		
	}
	
	Set<Character> setB=new HashSet<>();
	
	for(char i: right){
		
		setB.add(i);
		
	}
	
	if( setA.size()>1 || setB.size()>1 ){
		
		out.println("NO");
		out.flush();
		
		return;
		
	}
	
	if( !left.contains( set.get(0) ) && !right.contains( set.get(0) ) ){
		
		out.println("YES");
		out.flush();
		
	}else{
		
		out.println("NO");
		out.flush();
		
	}
	
}

	public static void main(String []amit) throws IOException{
		
		n=in.nextInt();
		
		a=new char [n][n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.next().toCharArray();
			
		}
		
		solve();
		
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