
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A_Gratitude {

         static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static class counting implements Comparable<counting> {
        
        String s;
        
        int count,index;

        public counting(String s, int count,int index) {
            this.s = s;
            this.count = count;
            this.index=index;
        }

        @Override
        public int compareTo(counting t) {
     //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
     if( this.count>t.count ){
         
         return -1;
         
     }else if(this.count<t.count){
         
         return 1;
         
     }else if(this.count==t.count){
         
         if(this.index>t.index){
             
             return -1;
             
         }else if(this.index<t.index){
             
             return 1;
             
         }else{
             
             return 0;
             
         }
         
     }
     
        return 0;
            
        }
      
        @Override
        public String toString(){
            
            return s;
            
        }
        
    }
    
    static int n,k;
    
    static counting a[];
    
    static Map<String,Integer> map=new HashMap<>();
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        k=in.nextInt();
        
        String lists[]=new String[3*n];
        
        for(int i=0;i<3*n;i++){
            
            lists[i]=in.nextLine().trim();
            
        }
            
        Map<String,Integer> pos=new HashMap<>();
        
        for(int i=0;i<3*n;i++){
            
            pos.put(lists[i], i+1);
            
        }
        
       /* for(int i=0;i<=(n*3)/2;i++){
            
            String temp=lists[i];
            lists[i]=lists[(3*n)-i-1];
            lists[ (3*n)-i-1 ]=temp;
            
        }*/
        
        for(int i=0;i<n*3;i++){
            
         //  String s=in.nextLine().trim();
           
         String s=lists[i];
         
           if( map.containsKey(s) ){
               
               map.put(s, map.get(s)+1);
               
           }else{
               
               map.put(s, 1);
               
           }
           
        }
        
        //out.println( "map: "+map.toString() );
        //out.flush();
        
        a=new counting[map.size()];
        
        int index=0;
        
        for(String i: map.keySet()){
            
            a[index++]=new counting(i,map.get(i),pos.get(i) );
            
        }
        
        Arrays.sort(a);
        
        /*for(counting i: a){
            
            out.println(i.toString()+" "+i.count+" "+i.index);
            out.flush();
            
        }*/
        
       for(int i=0;i<Math.min( a.length,k );i++){
           
           out.println(a[i].toString());
           out.flush();
           
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
    }
    
    
}
/*

2 2
Supportive parents
Being able to solve a hard problem
Good food
Fun game with friends
Good food
Being healthy


*/