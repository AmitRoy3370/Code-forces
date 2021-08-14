
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class E_Assiut_Chess {

          static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
    static int testCases;
    
    static String s;
    
    static void solve() throws IOException{
        
     String g="";
     
     int x=0,y=0;
	for(int i=1;i<=7;i++){
		int d=1;
		if(y==1)d=2;
		for(int j=d;j<=8;j++){
//			cout<<i<<" "<<j<<endl;
	
                        out.println(i+" "+j);
                        out.flush();
                        
                        x=i;y=j;
			//cin>>g;

                        g=in.next();
                        
                        if("Done".equals(g))return;
			if("Down".equals(g)||"Down-Left".equals(g)||"Down-Right".equals(g))break; 
			else if("Up".equals(g)||"Up-Left".equals(g)||"Up-Right".equals(g))
				if(j!=1)j=0;
		}
		x++;
		
                //cout<<x<<" "<<y<<endl;
	
                out.println(x+" "+y);
                out.flush();
                
                g=in.next();
		
                if("Done".equals(g))return;
		if(y!=1){
			y=1;
			//cout<<x<<" "<<y<<endl;
			
                        out.println(x+" "+y);
                        out.flush();
                        
                        g=in.next();
			if("Done".equals(g))return;
		}
	}
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
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
/*

1
Left
Right
Done

*/