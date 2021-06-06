
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

public class B_Obtaining_the_String {

        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static String s,t;
   
    static char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    static List<Integer> list=new ArrayList<>();
    
    static Map<Character,Integer> S=new HashMap<>();
    
    static Map<Character,Integer> T=new HashMap<>();
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        s=in.next();
        t=in.next();
        
       for(int i=0;i<26;i++){
           
           S.put(ch[i], 0);
        
           T.put(ch[i],0);
           
       }
          
       for(int i=0;i<n;i++){
           
           S.put(s.charAt(i),S.get(s.charAt(i))+1);
           
             T.put(t.charAt(i),T.get(t.charAt(i))+1);
           
       }
       
     for(int i=0;i<26;i++){
         
         if( !Objects.equals(S.get(ch[i]), T.get(ch[i])) ){
             
             out.println(-1);
             out.flush();
             
             return;
             
         }
         
     }
        
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        
   int index=0,count=0;
        
   while(index<n-1){
       
       int pos=0;
       
       if(a[index]!=b[index]){
           
           for(int j=index;j<n;j++){
               
               if(a[j]==b[index]){
                   
                   pos=j;
                   
                   break;
                   
               }
               
           }
           
           list.add(pos);
           
           char temp=a[pos];
           a[pos]=a[pos-1];
           a[pos-1]=temp;
           
           index=0;
           count=0;
           
       }else{
           
           index++;
           
           count++;
           
           if(count==n){
               
               break;
               
           }
           
       }
       
   }
   
        out.println(list.size());
        out.flush();
        
        list.stream().map((i) -> {
            out.print(i+" ");
                return i;
            }).forEachOrdered((_item) -> {
                out.flush();
            });
        
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

6
abcdef
abdfec


*/

/*

50
aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyz
zyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeeddccbbaa

*/