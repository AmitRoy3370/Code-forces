
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class D_Dividing_Candy {
    
       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n;
    
    static int a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new int[n];
        
        long ans=0;
       
        long sum=0;
        
        int x=0;
        
       // BigInteger s=new BigInteger("0");
        
     //   BigInteger two=new BigInteger("2");
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
            max=Math.max(a[i],max);
            
            //a[i]=(a[i]&x);
            
          //  if( a[i]==1 || !( (int)(Math.ceil((Math.log(a[i]) / Math.log(2)))) ==(int)(Math.floor(((Math.log(a[i]) / Math.log(2)) ) ) ) ) ){
            
            //   out.println("summation: "+a[i]);
              //  out.flush();
                
   //           s=s.add(two.pow(a[i])  );
              
   //    sum+=(long)Math.pow(2,a[i]);
            
        //    }
       
        }
       
        max=100020;
        
        if( (n<=1) ){
            
            out.println("N");
            out.flush();
            
            return;
            
        }
        
        int count[]=new int[max+1];
        
        for(int i: a){
            
            count[i]++;
            
        }
        
         x=0;
        
        for(int i=0;i<=max;i++){
            
            count[i]+=x;
            
            x=count[i]/2;
            
            count[i]=(count[i]&1);
            
        }
        
        ans=0;
        
        for(int i: count){
            
            ans+=i;
            
        }
        
        if(ans<=2){
            
            out.println("Y");
            out.flush();
            
            //return;
            
        }else{
            
            out.println("N");
            out.flush();
            
          //  return;
            
        }
        
      //  out.println(s);
        //out.flush();
        
        //out.println("sum: "+sum);
        //out.flush();
        
       /* s=new BigInteger( s.toString() );
        
     //  char ch[]=Long.toBinaryString(sum).toCharArray();
       
     char ch[]=s.toString(2).toCharArray();
     
      // out.println("ch: "+Arrays.toString(ch));
       //out.flush();
     
    //   out.println(21&1);
      // out.flush();
       
     //  int n=ch.length-1;
       
       //out.println("n: "+n);
       //out.flush();
       
       //long su=0;
       
       for(char i: ch){
           
           if(i=='1'){
               
               ans++;
          
         //       su+=(long)Math.pow( 2,Integer.valueOf( String.valueOf(n) ) );
               
           }
        
           //n--;
        
       }
       
       //out.println(su);
      // out.flush();
       
       if(ans==1 || ans==2){
           
           out.println("Y");
           out.flush();
           
       }else{
           
           out.println("N");
           out.flush();
           
       }*/
       
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
2 2 5 3


*/

/*

1
42


*/

/*

5
3 1 4 1 5


*/

/*

7
0 0 1 2 3 4 5


*/

/*

10
100000 200000 300000 400000 500000 600000 700000 800000 900000 100000

*/