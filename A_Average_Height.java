
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Average_Height {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,testCases;
    
    static long a[];
    
    static class Node{
        
        long data;
        
        Node next;

        public Node(long data) {
        
            this.data = data;
        
            this.next=null;
            
        }

        public long getData() {
            return data;
        }

        public void setData(long data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" + "data=" + data + '}';
        }
        
    }
    
    static class Stack{
        
        int len;
        
        Node node;

        public Stack() {
        
            len=0;
            
            node= null;
            
        }

        boolean isEmpty(){
            
            return len==0;
            
        }
        
        void push(long data){
            
            Node top=new Node(data);
            
            top.setNext(node);
            
            node=top;
            
            len++;
            
        }
        
        long pop() throws ArrayIndexOutOfBoundsException {
            
            if( isEmpty() ){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            long res=this.getNode().getData();
            
            this.node=this.getNode().getNext();
            
            len--;
            
            return res;
            
        }
        
        public int getLen() {
            return len;
        }

        public void setLen(int len) {
            this.len = len;
        }

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }

        @Override
        public String toString() {
        
            return  String.valueOf(node.getData()) ;
        
        }
               
    }
    
    static void solve(){
        
        Stack even=new Stack();
        
        Stack odd=new Stack();
        
        for(long i: a){
            
            if( i%2==0 ){
                
                even.push(i);
                
            }
       
            if( i%2!=0 ){
                
                odd.push(i);
                
            }
            
        }
        
        StringBuilder sb=new StringBuilder();
        
       while( !odd.isEmpty() ){
           
           try{
               
               sb.append(odd.pop()).append(" ");
               
           }catch(ArrayIndexOutOfBoundsException e){
               
               break;
               
           }
           
       }
        
       while( !even.isEmpty() ){
           
           try{
               
               sb.append(even.pop()).append(" ");
               
           }catch(ArrayIndexOutOfBoundsException e){
               
               break;
               
           }
           
       }
       
       out.println(sb.toString().trim());
       
       out.flush();
       
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

4
3
1 1 2
3
1 1 1
8
10 9 13 15 3 16 9 13
2
18 9

*/

