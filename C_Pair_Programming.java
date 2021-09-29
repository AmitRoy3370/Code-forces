import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Pair_Programming{
	
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n,testCases,m,k;
    
	static int a[],b[];
	
	   static class Node<T>{
    
    T data;
        
    Node next;

        public Node(T data) {
        
            this.data = data;
        
            this.next=null;
            
        }
        
    }
    
    static class LinkedList<T>{
        
        Node<T> head=null;
        Node<T> tail=null;
        
        void addNode(T data){
            
                   Node<T> newNode = new Node<>(data);    
              
        if(head == null) {    
          
            head = newNode;    
            tail = newNode;    
        }    
        else {    
           
            tail.next = newNode;    
              
            tail = newNode;    
        }    
            
        }
        
        void addFront(T data){
            
            Node<T> node=new Node<T>(data);
            
            if(head==null){
                
                head=node;
                tail=node;
                
            }else{
                
                node.next=head;
                
               // tail=node;
                
                head=node;
                
            }
            
        }
        
        T front(){
            
            return this.head.data;
            
        }
     
        void display() {    
            
        Node<T> current = head;    
            
        if(head == null) {    
              
            return;    
        }    
        
        while(current != null) {    
               
            out.print(current.data + " ");    
            out.flush();
            current = current.next;    
        }    
        out.println();
        out.flush();		
    }    
        
    }
	
	static void solve(){
		
		LinkedList<Integer> list=new LinkedList<>();
		
		int i=0,j=0;
		
		while( i<n || j<m ){
			
			if( i<n && a[i]==0 ){
				
				list.addNode(0);
				
				i++;
				k++;
				
			}else if( j<m && b[j]==0 ){
				
				list.addNode(0);
				
				j++;
				k++;
				
			}else if(i<n && a[i]<=k){
				
				list.addNode( a[i++] );
				
			}else if(j<m && b[j]<=k){
				
				list.addNode( b[j++] );
				
			}else{
				
				out.println(-1);
				out.flush();
				
				return;
				
			}
			
		}
		
		list.display();
		
	}
	
	public static void main(String[] amit) throws IOException{
		
		testCases=in.nextInt();
		
	for(int t=0;t<testCases;t++){
		
		k=in.nextInt();
		
		n=in.nextInt();
		
		m=in.nextInt();
		
		a=new int[n];
		
		b=new int[m];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		for(int i=0;i<m;i++){
			
			b[i]=in.nextInt();
			
		}
		
		solve();
		
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