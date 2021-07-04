
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Infectious_Letters {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[] amit) throws IOException {
        
        int n;
        
        n=in.nextInt();
        
        char ch[]=in.next().toCharArray();
        
  /*      int lastA=-1,ans=0;
             
        for(int i=0;i<n;i++){
            
            if(ch[i]=='a'){
                
                if(ch[i-1]=='b'){
                    
                    ans++;
                    
                }else if(ch[i-1]!='a'){
                    
                    if(lastA==-1){
                        
                        ans+=(i-1);
                        
                        lastA=i;
                        
                    }else{
                        
                        ans+=Math.abs(i-lastA-1);
                        
                        lastA=Math.abs(i-lastA-1);
                        
                    }
                    
                }else{
                    
                    lastA=i;
                    
                    ans++;
                    
                }
                
               // lastA=i;
                
                if(i+1<n && ch[i+1]=='b'){
                    
                   ans++;
                
         //           ch[i+1]='a';
                    
                    lastA=i+1;
                    
                }
                
                else if( i+1<n && ch[i+1]!='a'  ){
                    
                    ch[i+1]='a';
                    
                    ans++;
                    
                    lastA=i+1;
                    
                }
                
            }
            
        }
        
        out.println(ans);
        out.flush();
        
        out.println(ch);
        out.flush();*/
        
  int left=0,extra=0;
  
 /* if( n>1 && ch[0]==ch[1] && ch[0]=='a' ){
      
      extra++;
      
  }*/
  
 //boolean visited[]=new boolean[n];
 
  for(int i=0;i<n;i++){
      
  if( i+1<n && ch[i]=='a' && ch[i+1]!='a' ){
      
      if( i+1<n && ch[i+1]!='b'){
       
         // out.println("increase for "+ch[i]+" and "+ch[i+1]);
          //out.flush();
          
          ch[i+1]='a';
          
   //       visited[i+1]=true;
     //     visited[i]=true;
          
          left++;
       
      }else{
          
       //   visited[i]=true;
          
     //     out.println("increase for "+ch[i]+" and "+ch[i+1]);
       //   out.flush();
       
          left++;
          
      }
      
  }else if(i+1<n && ch[i]=='a' && ch[i+1]=='a' ) {
     
      left++;
      
  }    
      
  }
  
  int right=0;
  
  for(int i=n-1;i>=1;i--){
      
      if( ch[i]=='a' && ch[i-1]!='a' ){
          
          if(ch[i-1]!='b'){
              
              ch[i-1]='a';
              
              right++;
              
          }else{
              
     //         right++;
              
          }
          
      }
      
     /* if( i!=0 && !visited[i] && ch[i]=='b' && ch[i-1]=='a' ){
          
       //   right++;
          
      }*/
      
  }
  
 // out.println(ch);
  //out.flush();
  
  int ans=0;
  
  for(char i: ch){
      
      if(i=='a'){
          
          ans++;
          
      }
      
  }
  
  //out.println( (left+right+extra) );
  //out.flush();
  
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
/*

15
bbbacxdbxyabxab


*/

/*

5
bbbbb


*/

/*

5
aabcc


*/