
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1_Social_Network_easy_version {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n,k;
    
    static int a[];
   
   static Stack<Integer> stack=new Stack<>();
    
    public static void main(String[] amit) throws IOException, CloneNotSupportedException {
        
        n=in.nextInt();
        
        k=in.nextInt();
        
        a=new int[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
        }
        
        for(int i=0;i<n;i++){
            
            if( !stack.contains(a[i]) ){
         
          //      out.print("present stack: ");
            //    out.flush();
                
                //print();
                
                if( stack.size()==k ){
                    
                    stack.remove(0);
                    
                  //  out.println("after remove: ");
                   // out.flush();
                    
                 //   print();
                    
                 stack.add(a[i]);
                 
                    
                }else{
                
                stack.add(a[i]);
                
                }
                
                //out.print("after addition: ");
                //out.flush();
                
                //print();
                
            }
            
        }
     
        out.println(stack.size());
        out.flush();
        
        while( !stack.isEmpty() ){
            
            try{
            
            out.print(stack.pop()+" ");
            out.flush();
            
            }catch(ArrayIndexOutOfBoundsException | NullPointerException e){
                
                
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
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
    
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
    }
    
    
}
/*

7 2
1 2 3 2 1 3 2


*/

/*

1
10 4
2 3 3 1 1 2 1 2 3 3


*/