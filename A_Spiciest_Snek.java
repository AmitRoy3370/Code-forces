
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Spiciest_Snek {

    static Scanner in=new Scanner();
        
    static PrintWriter out=new PrintWriter(System.out);
    
    static class snake implements Comparable<snake> {
        
        String name;
        double time;

        public snake(String name, double time) {
            this.name = name;
            this.time = time;
        }

        @Override
        public String toString() {
            return  name ;
        }

        @Override
        public int compareTo(snake t) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(this.time>t.time){
            
            return 1;
            
        }else if(this.time<t.time){
            
            return -1;
            
        }
        
        return 0;
        
        }
        
    }
    
    static int n;
    
    static snake s[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        s=new snake[n];
        
        for(int i=0;i<n;i++){
            
            s[i]=new snake(in.next(),in.nextDouble());
            
        }
        
        Arrays.sort(s);

out.println(s[0].toString());
out.flush();
        
    }
 
    static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader(new InputStreamReader(System.in));
            
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
    }    
    
}
/*

8
black_mamba 0.28
coastal_taipan 0.106
indian_cobra 0.80
common_krait 0.365
eastern_brown_snake 0.03
russells_viper 0.162
king_cobra 1.09
common_death_adder 0.4


*/