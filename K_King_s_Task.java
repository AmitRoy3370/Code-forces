import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class K_King_s_Task{
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
	
	static int n,operation;
	
	static int a[];
	
	static int c[];
	
	static int b[];
	
	static boolean beEqual(){
		
		for(int i=0;i<2*n;i++){
			
			if(a[i]!=b[i]){
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	static boolean beEqual1(){
		
		for(int i=0;i<2*n;i++){
			
			if(c[i]!=b[i]){
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static void main( String[] amit ) throws IOException {
		
		n=in.nextInt();
		
		a=new int[2*n];
		
	 b=new int[2*n];	
		
		c=new int[2*n];
		
		for(int i=0;i<2*n;i++){
			
			a[i]=in.nextInt();
			
			b[i]=a[i];
			
			c[i]=a[i];
			
		}
		
		Arrays.sort(b);
	
if(n%2==0){
	
	operation=Math.max(2*n,4);
	
}else{
	
	operation=Math.max(2*n,4);
	
}
	
	int ans=0,size=2*n,ans1=0;
	
	if( beEqual() ){
		
		out.println(0);
		out.flush();
		
		return;
		
	}
	
	for(int o=1;o<=operation;o++){
		
		for(int i=0;i<size;i+=2){
			
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			
		}
		
		ans++;
		
		if(beEqual() ){
			
			break;
			
		}
		
		int swap=n;
		
		for(int i=0;i<n;i++){
			
			int temp=a[i];
			a[i]=a[swap];
			a[swap]=temp;
			
			swap++;
			
		}
		
		ans++;
		
		if( beEqual() ){
			
			break;
			
		}
		
	}
	
	//out.println( Arrays.toString(a) );
	//out.flush();
	
	if( beEqual() ){
		
//	out.println(ans);
	//out.flush();
	
	}else{
		
		//out.println(-1);
		//out.flush();
		
		ans=-1;
		
	}
	
	//out.println( "first: "+Arrays.toString(c) );
	//out.flush();
	
	for(int o=1;o<=operation;o++){
		
		int swap=n;
		
		for(int i=0;i<n;i++){
			
			int temp=c[i];
			c[i]=c[swap];
			c[swap]=temp;
			
			swap++;
			
		}
		
		ans1++;
		
		if(beEqual1() ){
			
			break;
			
		}
		
		for(int i=0;i<size;i+=2){
			
			int temp=c[i];
			c[i]=c[i+1];
			c[i+1]=temp;
			
		}
		
		ans1++;
		
		if( beEqual1() ){
			
			break;
			
		}
		
	}
	
	//out.println( Arrays.toString(c) );
	//out.flush();
	
	if( beEqual1() ){
		
//	out.println(ans);
	//out.flush();
	
	}else{
		
		//out.println(-1);
		//out.flush();
		
		ans1=-1;
		
	}
	
	if(ans!=-1 && ans1!=-1){
	
	//out.println("Here1");
	//out.flush();
	
	out.println( Math.min(ans,ans1) );
	
	out.flush();
	
	}else if(ans!=-1 && ans1==-1 ){
	
//out.println("Here2");
	//out.flush();
	
		out.println( (ans) );
	
	out.flush();
		
	}else if(ans1!=-1 && ans==-1 ){
		
		//out.println("Here3");
	//out.flush();
		
		out.println( (ans1) );
	
	out.flush();
		
	}else{
		
		out.println( (-1) );
	
	out.flush();
		
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

/*

9
16 5 18 7 2 9 4 11 6 13 8 15 10 17 12 1 14 3

*/