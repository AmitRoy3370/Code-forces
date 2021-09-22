import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Vacations{
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
	
	static int n;
	
	static int a[];
	
	static int solve( int index,String activity ){
		
		if(index==0){
			
			return 0;
			
		}
		
		int choice=a[index-1];
		
		if( activity=="R" ){
		
if( choice==0 ){
	
	return solve(index-1,"R" )+1;
	
}else if(choice==1){
	
	return solve(index-1,"C" );
	
}else if(choice==2){
	
	return solve( index-1,"G" );
	
}else{
	
	return solve(index-1,"R" );
	
}		
			
		}else if( activity=="C" ){
			
		if( choice==0 ){
	
	return solve(index-1,"R" )+1;
	
}else if(choice==1){
	
	return solve(index-1,"R" )+1;
	
}else if(choice==2){
	
	return solve( index-1,"G" );
	
}else{
	
	return solve(index-1,"G" );
	
}			
			
		}else if(activity=="G"){
			
			if( choice==0 ){
	
	return solve(index-1,"R" )+1;
	
}else if(choice==1){
	
	return solve(index-1,"C" );
	
}else if(choice==2){
	
	return solve( index-1,"R" )+1;
	
}else{
	
	return solve(index-1,"C" );
	
}		
			
		}else{
			
			if( choice==0 ){
	
	return solve(index-1,"R" )+1;
	
}else if(choice==1){
	
	return solve(index-1,"C" );
	
}else if(choice==2){
	
	return solve( index-1,"G" );
	
}else{
	
	return solve(index-1,"G" );
	
}		
				
		}
		
	}
	
	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		
		a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		out.println( solve(n,"R" ) );
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