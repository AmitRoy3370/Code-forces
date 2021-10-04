import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Ternary_String{
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int testCases,n;

static char a[];

static class Node<T>{
	
	T data;
	
	Node<T> next;
	
	public Node(T data){
		
		this.data=data;
		
		this.next=null;
		
	}
	
	public void setData(T data){
		
		this.data=data;
		
	}
	
	public void setNext(Node<T> next){
		
		this.next=next;
		
	}
	
	public T getData(){
		
		return this.data;
		
	}
	
	public Node<T> getNext(){
		
		return this.next;
		
	}
	
}

static class Stack<T>{
	
	Node<T> node;
	
	int len;
	
	public Stack(){
		
		this.node=null;
		
		len=0;
		
	}
	
	boolean isEmpty(){
		
		return len==0;
		
	}
	
	int size(){
		
		return len;
		
	}
	
	public void push(T data){
		
		Node<T> temp=new Node<>(data);
		temp.setNext(node);
		
		node=temp;
		
		len++;
		
	}
	
T top(){
	
	if( isEmpty() ){
		
		throw new ArrayIndexOutOfBoundsException();
		
	}
	
	return this.node.getData();
	
}
	
	T pop(){
		
		if( isEmpty() ){
			
			throw new ArrayIndexOutOfBoundsException();
			
		}
		
		T remove=this.node.getData();
		
		this.node=this.node.getNext();
		
		len--;
		
		return remove;
		
	}
	
	void print(){
		
		Node<T> temp=node;
		
		while( temp!=null ){
			
			out.print( temp.data+" " );
			out.flush();
			
			temp=temp.next;
			
		}
		
		out.println();
		out.flush();
		
	}
	
}

static void solve(){
	
	int one=-1,two=-1,three=-1;
	
	long ans=Long.MAX_VALUE;
	
	for(int i=0;i<n;i++){
		
		if( a[i]-'0'==1 ){
			
			one=i;
			
		}else if(a[i]-'0'==2){
			
			two=i;
			
		}else{
			
			three=i;
			
		}
		
		if( one!=-1 && two!=-1 && three!=-1 ){
			
			int min =Math.min( Math.min(one,two),three );
			int max =Math.max( Math.max(one,two),three );
			
			ans=Math.min(ans,max-min+1 );
			
		}
		
	}
	
	if(ans!=Long.MAX_VALUE){
	
	out.println(ans);
	out.flush();
	
	}else{
		
		out.println(0);
		out.flush();
		
	}
	
	/*Stack<Integer> one=new Stack<>();
	
	Stack<Integer> two=new Stack<>();
	
	Stack<Integer> three=new Stack<>();
	
        long ans=Long.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            
            switch (a[i]-'0') {
                case 1:
                    one.push(i);
                    break;
                case 2:
                    two.push(i);
                    break;
                case 3:
                    three.push(i);
                    break;
                default:
                    break;
            }
            
            if( !one.isEmpty() && !two.isEmpty() && !three.isEmpty() ){
                
                int max=Math.max( Math.max( one.top(),two.top() ),three.top() );
                int min=Math.min( Math.min( one.top(),two.top() ),three.top() );
                
                int maximum=-1,minimum=-1;
                
                if( max==one.top() ){
                    
                    maximum=one.pop();
                    
                }else if(max==two.top()){
                    
                    maximum=two.pop();
                    
                }else if( max==three.top() ){
                    
                    maximum=three.pop();
                    
                }
                
                if( !one.isEmpty() && min==one.top() ){
                    
                    minimum=one.pop();
                    
                }else if( !two.isEmpty() && min==two.top()){
                    
                    minimum=two.pop();
                    
                }else if( !three.isEmpty() && min==three.top() ){
                    
                    minimum=three.pop();
                    
                }
                
                if( maximum!=-1 && minimum!=-1 ){
                
                ans=Math.min(ans,maximum-minimum+1 );
                
                }
                
            }
            
        }
        
        if(ans!=Long.MAX_VALUE){
        
        out.println( ans );
        out.flush();
        
        }else{
            
            out.println(0);
            out.flush();
            
        }*/
        
	/*int dp[][]=new int[n][3];
	
	//0 for 1
	//1 for 2
	//2 for 3
	
	for(int i=0;i<n;i++){
		
		if( a[i]-'0'==1 ){
			
			if(i==0){
			
			dp[i][0]++;
			
			}else{
				
				dp[i][0]+=dp[i-1][0]+1;
				
			}
			
			if(i!=0){
				
				dp[i][1]=dp[i-1][1];
				dp[i][2]=dp[i-1][2];
				
			}
			
		}else if( a[i]-'0'==2 ){
			
			if(i==0){
			
			dp[i][1]++;
			
			}else{
				
				dp[i][1]+=dp[i-1][1]+1;
				
			}
			
			if(i!=0){
				
				dp[i][0]=dp[i-1][0];
				dp[i][2]=dp[i-1][2];
				
			}
			
		}else if(a[i]-'0'==3){
			
			if(i==0){
			
			dp[i][2]++;
			
			}else{
				
				dp[i][2]+=dp[i-1][2]+1;
				
			}
			
			if( i!=0 ){
				
				dp[i][0]=dp[i-1][0];
				dp[i][1]=dp[i-1][1];
				
			}
			
		}
		
	}
		
	long ans=Long.MAX_VALUE;
	
	for(int i=0;i<n;i++){
		
		int last=-1;
		
		if( a[i]-'0'==1 ){
			
			one.push(i);
			
			last=1;
			
		}else if( a[i]-'0'==2 ){
			
			two.push(i);
			
			last=2;
			
		}else if( a[i]-'0'==3 ){
			
			three.push(i);
			
			last=3;
			
		}
		
		if( dp[i][0]>=1 && dp[i][1]>=1 && dp[i][2]>=1 ){
			
		if( !one.isEmpty() && !two.isEmpty() && !three.isEmpty() ){	
			
			int min=Math.min( Math.min( one.top(),two.top() ),three.top() );
            int max=-1; 
        			
	    if( last==1 ){
		
		if( !one.isEmpty() ){
			
			max= one.pop();
			
		}
				
		}else if(last==2){
			
	
		if( !two.isEmpty() ){
			
			max= two.pop();
			
		}
			
		}else if(last==3){
			
	
		if( !three.isEmpty() ){
			
			max=three.pop();
			
		}
			
		}
			
			ans=Math.min( ans,max-min+1 );
			
			if( !one.isEmpty() && min==one.top() ){
				
				one.pop();
				
			}else if( !two.isEmpty() && min==two.top() ){
				
				two.pop();
				
			}else if( !three.isEmpty() && min==three.top() ){
				
				three.pop();
				
			}
			
		}else{
			
			break;
			
		}
			
		}
		
	}
	
	if( ans!=Long.MAX_VALUE  ){
	
	if(ans==n+1){
		
		out.println(0);
		out.flush();
		
		return;
		
	}
	
	out.println(ans);
	out.flush();
	
	}else{
		
		out.println(0);
		out.flush();
		
	}*/
	
}

	public static void main(String[] amit) throws IOException{
		
	testCases=in.nextInt();	
		
		for(int t=0;t<testCases;t++){
			
			a=in.next().toCharArray();
			
			n=a.length;
			
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

12
11111122222222222223
122222222222222222333
33333333331111111122
11111111133333333333333332
111111111123333333333
1
2
3
12
23
123
1111111111111111211111111111111111111111111111111113

*/

/*

7
123
12222133333332
112233
332211
12121212
333333
31121


*/

/*

1
111222333123

*/

/*

1
12222133333332

*/

/*

1
112233123

*/

/*

1
11111122222222222223

*/

/*

1
31121

*/

/*

1
12121212121222113

*/

/*

1
1111111111111111111111123

*/