import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;
//import java.util.List;
//import java.util.ArrayList;

public class C_Equalize{

	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n;

static char a[],b[];

/*static class missing{
	
	int index;
	char missingCharA,missingCharB;
	
	public missing(int index,char missingCharA,char missingCharB){
		
		this.index=index;
		this.missingCharA=missingCharA;
		this.missingCharB=missingCharB;
		
	}
	
}*/

static class Node<T>{
    
    T data;
    
    Node<T> next;

        public Node(T data) {
        
            this.data = data;
    
            this.next=null;
            
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    
}

static class Stack<T>{
    
    Node<T> node;
    
    int len;
    
    public Stack(){
        
        len=0;
        
        this.node=null;
        
    }
    
    void push(T data){
        
        Node<T> temp=new Node<>(data);
        
        temp.setNext(node);
        
        node=temp;
        
        len++;
        
    }
    
    boolean isEmpty(){
        
        return len==0;
        
    }
    
    T pop(){
        
        if( isEmpty() ){
            
            throw new ArrayIndexOutOfBoundsException();
            
        }
        
        T data=this.node.getData();
        
        len--;
      
        this.node=this.node.getNext();
    
        return data;
        
    }
        
    T peek(){
        
        if( isEmpty() ){
            
            throw new ArrayIndexOutOfBoundsException();
            
        }
        
        return this.node.getData();
        
    }
    
int size(){
    
    return len;
    
}
    
}

static void solve(){
	
	if(n==1){
		
		if( a[0]==b[0] ){
			
			out.println(0);
			out.flush();
			
		}else{
			
			out.println(1);
			out.flush();
			
		}
		
		return;
		
	}
	
	Set<Character> setA=new HashSet<>();
	
	Set<Character> setB=new HashSet<>();
	
	for(char i: a){
		
		setA.add( i );
		
	}
	
for(char i: b){
	
	setB.add(i);
	
}
	
	if( setA.size()==1 || setB.size()==1 ){
		
		int ans=0;
		
		for(int i=0;i<n;i++){
			
			if(a[i]!=b[i]){
				
				ans++;
				
			}
			
		}
		
		out.println(ans);
		out.flush();
		
		return;
		
	}
	
    Stack<Integer> zeros=new Stack<>();
    
    Stack<Integer> ones=new Stack<>();
    
    for(int i=0;i<n;i++){
        
        if( a[i]=='0' && a[i]!=b[i] ){
            
            zeros.push(i);
            
        }else if(a[i]=='1' && a[i]!=b[i] ){
            
            ones.push(i);
            
        }
        
    }
    
    Stack<Integer> one=new Stack<>();
    
    Stack<Integer> zero=new Stack<>();
    
	//out.print("one: ");
	//out.flush();
	
    while( !ones.isEmpty() ){
            
    one.push(ones.pop());
        
		//out.print( one.peek()+" " );
		//out.flush();
		
    }
    
	//out.println();
	//out.flush();
	
	//out.print("zero's: ");
	//out.flush();
	
    while( !zeros.isEmpty() ){
        
        zero.push(zeros.pop());
        
		//out.print( zero.peek()+" " );
		//out.flush();
		
    }
    
	if( one.isEmpty() || zero.isEmpty() ){
		
		int ans1=0;
		
		for(int i=0;i<n;i++){
			
			if(a[i]!=b[i]){
				
				ans1++;
				
			}
			
		}
		
		out.println(ans1);
		out.flush();
		
		return;
		
	}
	
	//out.println();
	//out.flush();
	
    int dp[][]=new int[n][2];
    
    //0 for the fliping
    //1 for the swaping
    
    if(a[0]!=b[0]){
        
        dp[0][0]=1;
        
        if( b[0]=='1' ){
        
		try{
		
        dp[0][1]=Math.abs( one.peek() );
        
		}catch(Exception e){
			
			dp[0][1]=dp[0][0];
			
		}
		
        //one.pop();
        
        }else{
            
			try{
			
            dp[0][1]=Math.abs( zero.peek() );
            
			}catch(Exception e){
				
				dp[0][1]=dp[0][0];
				
			}
			
        //    zero.pop();
            
        }
        
		if( dp[0][0]<dp[0][1] ){
		
        a[0]=b[0];
        
		}else{
			
			if( b[0]=='1' ){
				
				if( !one.isEmpty() ){
				
				one.pop();
				
				}
				
			}else if(b[1]=='0'){
				
				if( !zero.isEmpty() ){
					
					zero.pop();
					
				}
				
			}
			
			char temp=a[0];
			a[0]=a[dp[0][1] ];
			a[ dp[0][1] ]=temp;
			
			//out.println( "a: "+new String(a)+" dp[0][1]: "+dp[0][1] );
			//out.flush();
			
			//dp[1][0]=dp[0][0];
			//dp[1][1]=dp[0][1];
			
		}
		
    }
    
    for(int i=1;i<n;i++){
        
        if( a[i]==b[i] ){
            
            dp[i][0]=dp[i-1][0];
            dp[i][1]=dp[i-1][1];
            
			//if they are equal copy the value's from the previous
			
			/*try{
				
				//out.println("one: "+one.peek()+" i: "+i+" a[i]: "+a[i] );
				//out.flush();
				
				//out.println("zero: "+zero.peek()+" i: "+i+" a[i]: "+a[i] );
				//out.flush();
				
			}catch(Exception e){
				
				
			}*/
			
            if( !one.isEmpty()  && one.peek()==i){
                
                one.pop();
                
				//out.println("I am here");
				//out.flush();
				
            }else if( !zero.isEmpty()  && zero.peek()==i){
                
                zero.pop();
                
            }
            
//if they are in the stack we remove them			
			
        }else{
            
            if(a[i]=='0'){
                
                
                if( !zero.isEmpty() ){
                
                   // zero.pop();
                
                }
                
            }else{
            
                if( !one.isEmpty() ){
                
            //one.pop();
                
                }
            
            }
            
            dp[i][0]=Math.min(dp[i-1][0], dp[i-1][1] )+1;
            
            dp[i][1]=Math.min( dp[i-1][0],dp[i-1][1] );
            
            int index=-1;
            
            if(b[i]=='1'){

if( !one.isEmpty() ){
                
                dp[i][1]+=Math.abs(one.peek()-i);
                
                 index=one.pop();
     
                 
}else{
    
    dp[i][1]=dp[i-1][1];
    
}
            }else if( b[i]=='0' ){
               
                if( !zero.isEmpty() ){
                
                dp[i][1]+=Math.abs( zero.peek()-i );

                index=zero.pop();
                
                }else{
                    
                    dp[i][1]=dp[i-1][1];
                    
                }
                
            }
            
            if( dp[i][0]>dp[i][1] ){
                
                a[i]=b[i];
                
            }else{
                
                if(index!=-1){
                
                char temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                
                }else{
                
                    a[i]=b[i];
                
            }
                
            }
            
        }
         
if(i==n-1){
	
	try{
		
		if( dp[n-1][0]!=dp[n-2][0] && dp[n-1][1]==dp[n-2][1] ){
			
			dp[n-1][1]=dp[n-1][0];
			
		}else if( dp[n-1][1]!=dp[n-2][1] && dp[n-1][0]==dp[n-2][0] ){
			
			dp[n-1][0]=dp[n-1][1];
			
		}
		
	}catch(Exception e){
		
		
	}
	
}
		 
    }
    
	/*for(int i[]:dp){
		
		for(int j: i){
			
			out.print(j+" ");
			out.flush();
			
		}
		
		out.println();
		out.flush();
		
	}*/
	
	/*if( !one.isEmpty() ){
		
		dp[n-1][0]+=one.pop();
		
	}else if( !zero.isEmpty() ){
		
		dp[n-1][0]+=zero.pop();
		
	}*/
	
//	out.println( "a: "+new String(a)+"\nb: "+new String(b)+"\na info: "+one.size()+"\nb info: "+zero.size() );
	//out.flush();
	
     out.println( Math.min(dp[n-1][0],dp[n-1][1]) );
        out.flush();
    
//}
	
}

	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		
		a=in.next().toCharArray();
		
		b=in.next().toCharArray();
		
		in.close();
	
	int ans=0;
	
for(int i=0;i<n;i++){
	
	if(a[i]!=b[i]){
	
	if(i!=n-1 && a[i]==b[i+1] && a[i+1]==b[i] ){
		
		ans++;
		
		i++;
		
	}else{
		
		ans++;
		
	}
	
	}
	
}
	
	out.println(ans);
	out.flush();
	
//		solve();
		
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
100
001


*/

/*

4
0101
0011


*/

/*

8
10001001
01101110

*/

/*

15
101010101010101
010101010101010

*/

/*

7
1110001
0000001

*/

/*

19
1111010011111010100
1010000110100110110

*/
