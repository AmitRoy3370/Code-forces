
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A_King_Moves {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static Map<Character,Integer> map=new HashMap<>();
    
    static char ch[]={'a','b','c','d','e','f','g','h'};
    
    public static void main(String[] amit) throws IOException {
        
        for(int i=0;i<ch.length;i++){
            
            map.put(ch[i], i);
            
        }
        
        char c[]=in.next().toCharArray();
        
        int coloumn=map.get( c[0] );
        
        int raw=Integer.valueOf( String.valueOf(c[1]) )-1;
        
       // out.println("raw: "+raw+" coloumn: "+coloumn);
        //out.flush();
        
        int ans=0;
        
       boolean b[][]=new boolean[8][8];
        
       try{
       
       if( !b[raw+1][coloumn] ){
           
           ans++;
           
       }
       
       }catch(ArrayIndexOutOfBoundsException e){
           
           
       }
       
       try{
       
       if( !b[raw-1][coloumn] ){
           
           ans++;
           
       }
       
       }catch(ArrayIndexOutOfBoundsException e){
           
           
       }
       
       try{
       
       if( !b[raw][coloumn+1] ){
           
           ans++;
           
       }
       
       }catch(ArrayIndexOutOfBoundsException e){
           
           
       }
       
       try{
       
       if( !b[raw][coloumn-1] ){
           
           ans++;
           
       }
       
       }catch(ArrayIndexOutOfBoundsException e){
           
           
       }
       
       try{
       
       if( !b[raw+1][coloumn-1] ){
           
           ans++;
           
       }
       
       }catch(ArrayIndexOutOfBoundsException e){
           
           
       }
       
       try{
       
       if( !b[raw+1][coloumn+1] ){
           
           ans++;
           
       }
       
       }catch(ArrayIndexOutOfBoundsException e){
           
           
       }
       
       try{
       
       if( !b[raw-1][coloumn-1] ){
           
           ans++;
           
       }
       
       }catch(ArrayIndexOutOfBoundsException e){
           
           
       }
       
       try{
       
       if( !b[raw-1][coloumn+1] ){
           
           ans++;
           
       }
       
       }catch(ArrayIndexOutOfBoundsException e){
           
           
       }
       
       out.println(ans);
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
                
                st=new StringTokenizer(in.readLine());
                
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
        
    }
    
}
//e4
