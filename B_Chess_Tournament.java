import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_Chess_Tournament {

     static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases,n;
    
  static char a[];  
  
  static void solve(){
      
     /* List<Integer> no_loss=new ArrayList<>();
      
      List<Integer> one_win=new ArrayList<>();
      
      for(int i=0;i<n;i++){
          
          if(a[i]=='1'){
              
              no_loss.add(i);
              
          }else{
          
              one_win.add(i);
          
      }
          
      }
      
      char [][]ans=new char[n+10][n+10];
      
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
            
                ans[i][j]='-';
        
            }
        
        }
      
           if(one_win.size()<=2 && one_win.size()>0){
           
               //cout<<"NO\n";
        
               out.println("NO");
               out.flush();
               
               return;
               
           }
        
               if(no_loss.size()>0)
           
                   for(int i=0;i<n;i++){
                   
                       for(int j=0;j<no_loss.size();j++){
                       
                           ans[no_loss.get(j)][i]='=';
                       
                           ans[i][no_loss.get(j)]='=';
                      
                           ans[i][i]='x';
                    }
                    // arr[no_loss[i+1]][no_loss[i]]='=';
                }
            if(one_win.size()>0){
                
                ans[one_win.get(one_win.size()-1) ][one_win.get(0)]='+';
                
                for(int i=0;i<one_win.size()-1;i++){
                    // cout<<one_win[i]<<" "<<one_win[i+1]<<endl;
                    ans[one_win.get(i)][one_win.get(i+1)]='+';
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                {
                    out.print(ans[i][j]);
                    out.flush();
                }
                
                out.println();
                out.flush();
                
            }*/
        
           
      List<Integer> Hated=new ArrayList<>();
      
      char ans[][]=new char[n+10][n+10];
      
      for(int i=0;i<n+10;i++){
          
          for(int j=0;j<n+10;j++){
              
              ans[i][j]='.';
              
          }
          
      }
      
      int count_2=0;
      
    //  out.println( new String(a) );
      //out.flush();
      
      for(int i=0;i<n;i++){
          
          if(a[i]=='2'){
              
              count_2++;
              
          }
          
          if(a[i]=='2'){
              
              Hated.add(i);
              
          }
          
      }
      
    //  out.println("count_2: "+count_2);
      //out.flush();
      
      if(count_2<=2 && count_2>0   ) {
            
          out.println("NO");
          out.flush();
          
          return;
          
        }
      
      out.println("YES");
      out.flush();
      
      for(int i=0;i<n;i++) {
                
          if(a[i]=='1') {
                  
                    for(int j=0;j<n;j++) {
                        
                        ans[i][j]='=';
          
                        ans[j][i]='=';
                    
                    }
                
          }
         
      }
      
   //   out.println("size: "+Hated.size());
     // out.flush();
      
       for(int i=0;i<Hated.size();i++) {
              
           for(int j=0;j<Hated.size();j++) {
           
               if(i==j){
                    
                        continue;
                    
                    }
                    if(ans[Hated.get(i) ][Hated.get(j) ]=='.') {
                        
                        ans[Hated.get(i)][Hated.get(j) ] ='=';
                    
                        ans[Hated.get(i)][Hated.get(j) ] = '=';
                    
                    }
                
                }
                if(i==Hated.size()-1) {
                
                    ans[Hated.get(i)][Hated.get(0)]='+';
                    
                    ans[Hated.get(0)][Hated.get(i)]='-';
                
                }
                else{
                    
                    ans[Hated.get(i)][Hated.get(i+1)]='+';
                
                    ans[Hated.get(i+1)][Hated.get(i)]='-';
                
                }
            }
      
       for(int i=0;i<n;i++) {
                
           ans[i][i]='X';
               
                for(int j=0;j<n;j++) {
                    //cout <<Answer[i][j];
                    
                    out.print(ans[i][j]);
                    out.flush();
                    
                }
                
                out.println();
                out.flush();
                
            }
       
  }
  
    public static void main(String[] amit) throws IOException {
        
      testCases=in.nextInt();
        
      for(int t=0;t<testCases;t++){
          
          n=in.nextInt();
          
          a=in.next().toCharArray();
          
          solve();
          
      }
      
      in.close();
      
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

3
3
111
2
21
4
2122


*/

/*

1
3
111

*/

/*

1
2
21

*/

/*

1
4
2122

*/