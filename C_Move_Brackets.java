
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Move_Brackets {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static String s;
    
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

        @Override
        public String toString() {
            return "Node{" + "data=" + data + ", next=" + next + '}';
        }
        
    }
    
    static class Stack<T>{
        
        Node<T> node;
        
        int len;

        public Stack() {
        
            len=0;
            
            node=null;
            
        }
        
        boolean isEmpty(){
            
            return len==0;
            
        }
        
        void push(T data){
            
            Node<T> top = new Node<>(data);
            
            top.setNext(node);
            
            node=top;
            
            len++;
            
        }
        
        T pop() throws ArrayIndexOutOfBoundsException {
            
            if( isEmpty() ){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            T res=node.getData();
            
            node=node.getNext();
            
            len--;
            
            return res;
            
        }
        
        int size(){
            
            return len;
            
        }

        @Override
        protected Stack<T> clone() throws CloneNotSupportedException {
        
            try{
            
            Stack<T> copy= (Stack<T>)super.clone(); //To change body of generated methods, choose Tools | Templates.
        
            return copy;
            
            }catch(CloneNotSupportedException e){
                
                return this;
                
            }
            
        }
        
    }
    
    static void solve(){
        
        Stack<Character> unWanted=new Stack<>();
        
        Stack<Character> stack=new Stack<>();
        
        char ch[]=s.toCharArray();
        
        for(int i=0;i<ch.length;i++){
            
            if( stack.isEmpty() && ch[i]==')' ){
                
                unWanted.push(ch[i]);
                
            }else if( ch[i]=='(' ){
                
                stack.push(ch[i]);
                
            }else if( !stack.isEmpty() && ch[i]==')' ){
                
                try{
                
                stack.pop();
              //  unWanted.pop();
                
                }catch(ArrayIndexOutOfBoundsException e){
                    
                    break;
                    
                }
                
            }
            
        }
        
        out.println((unWanted.size()));
        
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
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

4
2
)(
4
()()
8
())()()(
10
)))((((())

*/

/*

1
10
)))((((())

*/