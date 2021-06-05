
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class C_Vanya_and_Exams {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static class Pair implements Comparable<Pair> {
        
        int first,second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "Pair{" + "first=" + first + ", second=" + second + '}';
        }

        @Override
        public int compareTo(Pair t) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
if(this.second>t.second){
    
    return 1;
    
}else if(this.second<t.second){
    
    return -1;
    
}else if(this.second==t.second){
    
  return 0;
    
}

return 0;

        }
        
    }
    
    static int n,r,avg;
    
    static List<Pair> list=new ArrayList<>();
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        r=in.nextInt();
        avg=in.nextInt();
        
        long sum=(long)n*avg;
        
        for(int i=0;i<n;i++){
        
            list.add( new Pair( in.nextInt(),in.nextInt() ) );
            
            sum-=list.get(i).first;
            
        }
            
        Collections.sort(list);
        
       /* list.stream().map((i) -> {
            out.println(i.toString());
            return i;
        }).forEachOrdered((_item) -> {
            out.flush();
        });*/
        
        int cmp=avg*n,i=0; long rez=0;
        
        while(sum>0){
            
            long temp=Math.min(sum,r-list.get(i).first);
            
            rez+=list.get(i).second*temp;
            
            sum-=temp;
              
            //rez+=list.get(i).first*temp;
            
            i++;
            
            if(i>=n){
                
                break;
                
            }
            
        }
        
        out.println(rez);
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next());
            
        }
        
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
    }
    
}
/*

5 5 4
5 2
4 7
3 1
3 2
2 5


*/