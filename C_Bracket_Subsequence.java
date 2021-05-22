
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Bracket_Subsequence {

      static class Node<T>{
        
        T data;
        
        Node node;

        public Node(T data) {
        
            this.data = data;
        
            this.node=null;
            
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }
        
    }
    
    static class Stack<T>{
        
        int length;
        
        Node node;

        public Stack() {
        
            length=0;
            
            node=null;
            
        }
        
        public void push(T data){
            
            Node top=new Node(data);
            
            top.setNode(node);
            
            node=top;
            
            length++;
            
        }
        
        public boolean isEmpty(){
            
            return length==0;
            
        }
        
        public T pop() throws ArrayIndexOutOfBoundsException {
            
            if( isEmpty() ){
                
             //   System.out.println("got exception");
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            T res=(T) node.getData();
            
            node=node.getNode();
            
            length--;
            
            return res;
            
        }
        
        public T peek(){
            
            if( isEmpty() ){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            return (T) node.getData();
            
        }
        
        public int size(){
            
            return length;
            
        }
        
    }

static Scanner in=new Scanner();
    
static PrintWriter out=new PrintWriter(System.out);

static int n,m;

static Stack<Character> stack=new Stack<>();

    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        m=in.nextInt();
        
        int count=0,count1=0;
        
        StringBuilder sb=new StringBuilder();
        
        char [] ch=in.next().toCharArray();
        
        for(char i: ch){
            
            if(i=='(' && count<m/2 ){
                
                stack.push(i);
                
                sb.append(i);
                
                count++;
                
            }else if( i==')' && count1<m/2) {
                
                stack.pop();
                
                sb.append(i);
                
                count1++;
                
            }
            
        }
        
        out.print(sb.toString());
        out.flush();
        
    }
 
     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
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

6 4
()(())


*/

/*

8 8
(()(()))


*/