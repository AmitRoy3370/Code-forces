import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Eevee {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n;
    
    static char a[];
    
    static String have[]={"vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon",  "sylveon"};
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=in.next().toCharArray();
     
        in.close();
        
        int y=0;
        
        for(char i: a){
            
            if(i=='.'){
                
                y++;
                
            }
            
        }
        
        if(y==n){
            
            for(String i: have){
                
                if(i.length()==n){
                    
                    out.println(i);
                    out.flush();
                    
                    
                    return;
                }
                
            }
            
        }
        
      for(String i: have){
     
          if(i.length()==n){
              
              int equal=0;
              
             for(int j=0;j<n;j++){
                 
              if(a[j]!='.' && a[j]==i.charAt(j) ){
                  
                  equal++;
                  
              }else if( a[j]!='.' && a[j]!=i.charAt(j) ){
                  
                  equal=0;
                  
                  break;
                  
              }
                 
             }
              
             if(equal>0){
                 
                 out.println(i);
                 out.flush();
                 
                 return;
                 
             }
             
          }
          
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

7
j......


*/

/*

7
...feon

*/

/*

7
.l.r.o.


*/

/*

6
......

*/