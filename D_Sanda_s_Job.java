
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

public class D_Sanda_s_Job {

         static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
    static long a,s;
   
    static char digit[]={'0','1','2','3','4','5','6','7','8','9'};
    
    static Map<Character,Integer> countB=new HashMap<>();
    
    static Map<Character,Integer> countA=new HashMap<>();
    
    public static void main(String[] amit) throws IOException {
        
        a=in.nextLong();
       s= in.nextLong();

long b=s-a;
        
if(b<=0){
    
    out.println("NO");
    out.flush();
    
    return;
    
}

for(int i=0;i<10;i++){
    
    countB.put(digit[i], 0);
    
    countA.put(digit[i], 0);
    
}

char digitB[]=String.valueOf(b).toCharArray();

char digitA[]=String.valueOf(a).toCharArray();

for(char i: digitA){
    
    if( countA.containsKey(i) ){
        
        countA.put(i, countA.get(i)+1 );
        
    }else{
        
        countA.put(i, 1);
        
    }
    
}

for(char i: digitB){
    
    if( countB.containsKey(i) ){
        
        countB.put(i, countB.get(i)+1 );
        
    }else{
        
        countB.put(i, 1);
        
    }
    
}

for(Character i: countA.keySet()){
    
    if( !Objects.equals(countA.get(i), countB.get(i)) ){
        
        out.println("NO");
        out.flush();
        
        return;
        
    }
    
}

out.println("YES");
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

1000 1001

*/

/*

123 255

*/