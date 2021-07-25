
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Running_for_Gold {

           static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n;
    
    static int r[][];
    
    static class athelete implements Comparable<athelete> {
        
        int i,count;
        
        int a[];

        public athelete(int i, int[] a) {
            this.i = i;
            this.a = a;
            this.count=0;
        }

        public athelete() {
        
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int[] getA() {
            return a;
        }

        public void setA(int[] a) {
            this.a = a;
        }

        @Override
        public int compareTo(athelete t) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        int arr[]=this.getA();
        
        int arr1[]=t.getA();
        
        int cnt1=0,cnt2=0;
        
        for(int index=0;index<arr.length;index++){
            
            if( arr[index]<arr1[index] ){
                
                cnt1++;
                
                this.count=cnt1;
                
            }else if( arr[index]>arr1[index] ){
                
                cnt2++;
                
                t.count=cnt2;
                
            }
            
        }
        
        if(this.count>t.count){
            
            return -1;
            
        }else if(this.count<t.count){
            
            return 1;
            
        }
        
        return 0;
        }

        @Override
        public String toString() {
        
            return "athelete{" + "i=" + i + ", count=" + count + ", a=" + Arrays.toString(a) + '}';
       
        }
       
    }
    
    static void solve(){
        
      int ans=0,ansWin=0,newWin=0;
        
      for(int i=1;i<n;i++){
          
          ansWin=0;
          newWin=0;
          
           for (int j = 0; j < 5; j++) {
                    if(r[ans][j] < r[i][j])
                        ansWin++;
                    else
                        newWin++;
                }
                ans = newWin>ansWin ?i:ans;
          
      }
      
      for(int i=0;i<n;i++){
          
          if(i==ans){
              
              continue;
              
          }
          
          ansWin=0;
          newWin=0;
          
            for (int j = 0; j < 5; j++) {
                    if(r[ans][j] < r[i][j])
                        ansWin++;
                    else
                        newWin++;
                }
                if(newWin> ansWin)
                {
                    ans = -1;
                    break;
                }
          
      }
      
      ans=ans==-1?ans:ans+1;
      
      out.println(ans);
      out.flush();
      
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            r=new int[n][5];
            
            for(int i=0;i<n;i++){
                
                r[i][0]=in.nextInt();
                r[i][1]=in.nextInt();
                r[i][2]=in.nextInt();
                r[i][3]=in.nextInt();
                r[i][4]=in.nextInt();
                
            }
            
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

4
1
50000 1 50000 50000 50000
3
10 10 20 30 30
20 20 30 10 10
30 30 10 20 20
3
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
6
9 5 3 7 1
7 4 1 6 8
5 6 7 3 2
6 7 8 8 6
4 2 2 4 5
8 3 6 9 4


*/

/*

1
3
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3

*/