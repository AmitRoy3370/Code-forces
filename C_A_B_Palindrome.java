
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_A_B_Palindrome
{
    
      static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,a,b;
    static String s;

static boolean isPalindrome(char[] c) {
        int n = c.length;
        for(int i=0; i<n/2; i++) {
            if(c[i] != c[n-i-1]) return false;
        }
        return true;
    }

static void solve(){
    
    int count[]=new int[2];
    
    char []ch=s.toCharArray();
  
    int n=ch.length;
    
    for(int i=0;i<=n/2;i++){
        
        if( ch[i]!='?' && ch[n-i-1]=='?' ){
            
            ch[n-i-1]=ch[i];
            
        }else if( ch[i]=='?' && ch[n-i-1]!='?' ){
            
            ch[i]=ch[n-i-1];
            
        }
        
    }
    
    for(int i=0;i<ch.length;i++ ){
        
        if( ch[i]=='?' ){
            
            continue;
            
        }
        
        count[ ch[i]-'0' ]++;
        
    }
    
  
    for(int i=0;i<=n/2;i++ ){
        
        if( ch[i]=='?' && ch[n-i-1]=='?' ){
            
            int add= 1 + ((i!=n-i-1)? 1 : 0);
            
            if(count[0] + add <= a) {
                        ch[i] = '0';
                        ch[n-i-1] = '0';
                        count[0] += add;
                    }else {
                        ch[i] = '1';
                        ch[n-1-i] = '1';
                        count[1] += add;
                    }
            
        }
        
    }
    
    if( count[0]==a && count[1]==b && isPalindrome(ch) ){
        
        for(char i: ch){
            
            out.print(i);
            out.flush();
            
        }
        
        out.println();
        out.flush();
        
    }else{
        
        out.println(-1);
        out.flush();
        
    }
    
}
    
	public static void main(String[] amit) throws IOException {
	
	 testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            a=in.nextInt();
            b=in.nextInt();
            
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

1
4 4
01?????0

*/

/*

9
4 4
01?????0
3 3
??????
1 0
?
2 2
0101
2 2
01?0
0 1
0
0 3
1?1
2 2
?00?
4 3
??010?0

*/

/*

1
1 0
?

*/

/*

1
0 3
1?1

*/

/*

1
4 3
??010?0

*/

/*

1
2 2
0101

*/

/*

1
7 12
??00?101??1?0?100??

*/

/*

1
2 11
110??1?1???11

*/

/*

1
2 7
??1010???

*/

/*

1
0 7
111?111

*/

/*

1
1 6
111?111

*/

/*

1
4 6
??????????

*/

/*

1
4 4
?1100110

*/

/*

1
4 4
????????

*/

/*

1
2 11
110??1?1???11

*/

/*

1
3 1 
1??1

*/

/*

1
0 3
?1?

*/

/*

1
3 3
10????

*/

/*

1
3 4
10?????

*/

/*

1
3 4
01???10

*/

/*

1
3 6
???1?1011

*/