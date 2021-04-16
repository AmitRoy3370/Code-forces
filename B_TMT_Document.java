
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class B_TMT_Document {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static String s;
    
    static void solve(){
        
        char a[]=s.toCharArray();
        
        boolean vis[]=new boolean[a.length];
        
        List<Integer> t=new ArrayList<>();
        
        List<Integer> m=new ArrayList<>();
        
       for(int i=0;i<a.length;i++){
           
           if( a[i]=='T' ){
               
               t.add(i);
               
           }else if( a[i]=='M' ){
               
               m.add(i);
               
           }
           
       }
        
       int ta[]=new int[t.size()];
       
       int ma[]=new int[m.size()];
       
       int index=0;
       
       for(int i: t){
           
           ta[index++]=i;
           
       }
       
       index=0;
       
       for(int i: m){
           
           ma[index++]=i;
           
       }
       
       Arrays.sort(ta);
       
       Arrays.sort(ma);
        
       //out.println("ta: "+Arrays.toString(ta));
     
       //out.flush();
     
        //out.println("ma: "+Arrays.toString(ma));
     
       //out.flush();
       
       if( ta.length==0 || ma.length==0 ){
           
           out.println("NO");
           out.flush();
           
           return;
           
       }
       
       if( ta.length!=ma.length*2 ){
           
           out.println("NO");
           
           out.flush();
           
           return;
           
       }
       
       if( ma[0]<ta[0] ){
           
           out.println("NO");
           
           out.flush();
           
           return;
           
       }
       
       int count=0,count1=0,c=0;
       
      for(int i=0;i<ta.length;i++){
          
          try{
          
          if( ma[c]>ta[i] ){
              
              count++;
              
              c++;
              
          }
          
          }catch(Exception e){
              
              break;
              
          }
          
      }
       
      c=0;
      
      for(int i=0;i<ta.length;i++){
          
          try{
          
          if( ma[c]<ta[i] ){
              
              count1++;
              
              c++;
              
          }
          
          }catch(Exception e){
              
              break;
              
          }
          
      }
      
    //   out.println("count: "+count+" count1: "+count1);
       
       out.flush();
       
       if( count!=ma.length ){
           
           out.println("NO");
           
           out.flush();
           
           return;
           
       }
       
       if( count1!=ma.length ){
           
            out.println("NO");
           
           out.flush();
           
           return;
           
       }
       
       out.println("YES");
       out.flush();
       
       /*for(int i=0;i<ta.length-1;i++){
           
           if( !vis[i] ){
               
               int mis=-1;
               
               for(int j=0;j<ma.length;j++){
                   
                   if( !vis[j] ){
                       
                       if( ta[i]>ma[j] ){
                           
                           vis[j]=true;
                          
                           mis=ma[j];
                           
                           break;
                           
                       }
                       
                   }
                   
               }
               
               if(mis!=-1){
               
               for(int j=i+1;j<=ta.length-1;j++){
                   
                   if( !vis[j] ){
                       
                       if( ta[j]>mis ){
                           
                           vis[j]=true;
                           
                           break;
                           
                       }
                       
                   }
                   
               }
               
               }
               
           }
           
       }
       
      // out.println("vis: "+Arrays.toString(vis));
       
       //out.flush();
       
       for(boolean i: vis){
           
           if( !i ){
               
               out.println("NO");
               
               out.flush();
               
               return;
               
           }
           
       }
       
       out.println("YES");
       
       out.flush();*/
       
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            s=in.next();
            
            solve();
            
        }
        
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
3
TMT
3
MTT
6
TMTMTT
6
TMTTTT
6
TTMMTT

*/

/*

1
6
TMTMTT

*/