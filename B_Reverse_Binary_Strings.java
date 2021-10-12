import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Reverse_Binary_Strings{
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n,testCases;

static char a[];

static char b[]={'0','1'};

static void solve(){
	
	if(n==2){
		
		out.println(0);
		out.flush();
		
		return;
		
	}
	
	int dismatch=0;
	
	for(int i=0;i<n-1;i++){
		
	    if(a[i]==a[i+1]){
			
			dismatch++;
			
		}
		
	}
	
	out.println( (int)Math.ceil( (double)dismatch/2 ) );
	out.flush();
	
/*	StringBuilder sb=new StringBuilder();
	
	StringBuilder sb1=new StringBuilder();
	
	int index=0;
	
	for(int i=0;i<n;i++){
		
		sb.append( b[ (index++)%2 ] );
		
	}
	
	index=1;
	
	for(int i=0;i<n;i++){
		
		sb1.append( b[ (index++)%2 ] );
		
	}
	
	char wanted[]=sb.toString().toCharArray();
	
	char wanted1[]=sb1.toString().toCharArray();
	
	int moves=0;
	
	char arr[]=new char[n];
	
	for(int i=0;i<n;i++){
		
		arr[i]=a[i];
		
	}
	
	for(int i=0;i<n;i++){
		
		if( a[i]!=wanted[i] ){
			
			int j=i+1;
			
			while(j<n && a[j]==wanted[j]){
				
				j++;
				
			}
			
			int y=i,m=((j-1==i)?j:j);
			
			if( m-y==1 ){

if(m>=n){
	
	m--;
	
}		

				char temp=a[m];
				a[m]=a[y];
				a[y]=temp;
				
			}else{
			
			for(int k=y;k<=m/2;k++){
				
			//	out.println("enter "+a[y]+" "+a[k]+" "+new String( wanted )+" "+y+" "+k);
				//out.flush();
				
				char temp=a[k];
				a[k]=a[m-k];
				a[m-k]=temp;
				
			}

			}

out.println("temp a: "+new String(a));
out.flush();			
			
			moves++;
			
		}
		
	}
	
	int moves1=0;
	
	//out.println( "wanted: "+new String(wanted) );
	//out.flush();
	
	//out.println("wanted1: "+new String(wanted1));
	//out.flush();
	
	for(int i=0;i<n;i++){
		
		if( arr[i]!=wanted1[i] ){
			
			int j=i+1;
			
			while(j<n && arr[j]==wanted1[j]){
				
				j++;
				
			}
			
			int y=i,m=((j-1==i)?j:j);
			
	//		out.println("y: "+y+" m: "+m);
		//	out.flush();

if(m-y==1){
	
	//m--;
	
	if(m>=n){
		
		m--;
		
	}
	
	char temp=arr[m];
	arr[m]=arr[y];
	arr[y]=temp;
	
}else{
			
			for(int k=y;k<=m/2;k++){
				
				//out.println("enter "+arr[y]+" "+arr[k]+" "+new String( wanted1 )+" "+y+" "+k);
				//out.flush();
				
				char temp=arr[k];
				arr[k]=arr[m-k];
				arr[m-k]=temp;
				
			}
	
}
	
out.println( "temp arr: "+new String(arr) );
out.flush();	
	
			moves1++;
			
		}
		
	}
	
	out.println( Math.min(moves,moves1) );
	out.flush();*/
}

	public static void main(String [] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=in.next().toCharArray();
			
			solve();
			
		}
		
		in.close();
		
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

1
6
110100

*/