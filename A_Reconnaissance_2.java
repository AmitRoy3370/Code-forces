
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Reconnaissance_2 {

    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static long a[];
    
    static class ansClass implements Comparable<ansClass> {
        
        long a,b;
        int index1,index2;

        public ansClass(long a, long b, int index1, int index2) {
            this.a = a;
            this.b = b;
            this.index1 = index1;
            this.index2 = index2;
        }

        public ansClass() {
        
        }

        public long getA() {
            return a;
        }

        public void setA(long a) {
            this.a = a;
        }

        public long getB() {
            return b;
        }

        public void setB(long b) {
            this.b = b;
        }

        public int getIndex1() {
            return index1;
        }

        public void setIndex1(int index1) {
            this.index1 = index1;
        }

        public int getIndex2() {
            return index2;
        }

        public void setIndex2(int index2) {
            this.index2 = index2;
        }

        @Override
        public String toString() {
        
            return  Math.max(index1,index2) + " " + Math.min(index2,index1) ;
        
        }

        @Override
        public int compareTo(ansClass t) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if( Math.abs(this.getA()-this.getB())>Math.abs(t.getA()-t.getB()) ){
            
            return 1;
            
        }else if( Math.abs(this.getA()-this.getB())<Math.abs(t.getA()-t.getB()) ){
            
            return -1;
            
        }
        
        return 0;
        
        }
        
    }
    
    static Scanner in=new Scanner();
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        long prev=a[0],diff=10000;
        
        int index1=0,index2=0;
        
      for(int i=1;i<=n-1;i++){
          
          long tempDiff=Math.abs(a[i]-prev);
          
          if( diff>tempDiff ){
              
              diff=tempDiff;
              
              index1=i-1;
              index2=i;
              
          }
      
          prev=a[i];
          
      }
        
      long diff1=Math.abs( a[0]-prev );
      
      if( diff>diff1 ){
          
          index1=n;
          index2=1;
          
          out.print(index1+" "+index2);
          
          out.flush();
          
          return;
          
      }
      
      out.print( (index1+1)+" "+(index2+1) );
      
      out.flush();
      
    }
 
     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }

double nextDouble() throws IOException{
    
    return Double.parseDouble( next() );
    
}
        
    }
    
}
/*

5
10 12 13 15 10

*/

/*

4
10 20 30 40

*/

/*

6
744 359 230 586 944 442

*/