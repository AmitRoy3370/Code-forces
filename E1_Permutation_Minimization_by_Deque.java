import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class E1_Permutation_Minimization_by_Deque {
 
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n,testCases;
    
    static long a[];
    
    static class Node{
    
    long data;
        
    Node next;

        public Node(long data) {
        
            this.data = data;
        
            this.next=null;
            
        }
        
    }
    
    static class LinkedList{
        
        Node head=null;
        Node tail=null;
        
        void addNode(long data){
            
                   Node newNode = new Node(data);    
              
        if(head == null) {    
          
            head = newNode;    
            tail = newNode;    
        }    
        else {    
           
            tail.next = newNode;    
              
            tail = newNode;    
        }    
            
        }
        
        void addFront(long data){
            
            Node node=new Node(data);
            
            if(head==null){
                
                head=node;
                tail=node;
                
            }else{
                
                node.next=head;
                
               // tail=node;
                
                head=node;
                
            }
            
        }
        
        long front(){
            
            return this.head.data;
            
        }
     
        void display() {    
        
            
        Node current = head;    
            
        if(head == null) {    
              
            return;    
        }    
        
        
        while(current != null) {    
               
            out.print(current.data + " ");    
            out.flush();
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    }
    
    static void solve(){
        
      LinkedList list=new LinkedList();
       
      list.addNode(a[0]);
      
      for(int i=1;i<n;i++){
          
          if( list.front()>a[i] ){
              
              list.addFront(a[i]);
              
          }else{
              
              list.addNode(a[i]);
              
          }
          
      }
      
     list.display();
      
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextLong();
                
            }
            
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

5
4
3 1 2 4
3
3 2 1
3
3 1 2
2
1 2
2
2 1


*/