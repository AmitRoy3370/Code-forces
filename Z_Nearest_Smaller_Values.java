
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Z_Nearest_Smaller_Values {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(new OutputStreamWriter( System.out ));
    
    static class Stack<T>{
        
        class Node<T>{
            
            T data;
            
            Node next;

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

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }

            @Override
            public String toString() {
                return  data + " ";
            }
            
        }
        
        int len;
        
        Node node;

        public Stack() {

            len=0;
            
            node=null;
            
        }

boolean isEmpty(){
    
    return len==0;
    
}        

int size(){
    
    return len;
    
}

void push(T data){
    
    Node<T> temp=new Node<>(data);
    
    temp.setNext(node);
    
    node=temp;
    
    len++;
    
}

T peek(){
    
    return (T) this.node.data;
    
}

T pop() throws ArrayIndexOutOfBoundsException {
    
    if( isEmpty() ){
        
        throw new ArrayIndexOutOfBoundsException();
        
    }
 
    T data=(T) node.data;
    
    this.node=node.getNext();
    
    len--;
    
    return data;
    
}

    }
    
    public static void main(String[] amit) throws IOException {
        
        int n=in.nextInt();
        
        long a[]=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<n;i++){
            
            while(!stack.isEmpty() && a[ stack.peek() ]>=a[i] ){
                
                stack.pop();
                
            }
            
            if(stack.isEmpty()){
                
                out.print(0+" ");
                out.flush();
                
            }else{
                
                out.print( (stack.peek()+1) +" ");
                out.flush();
                
            }
            
            stack.push(i);
            
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
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
    }
    
}
/*

8
2 5 1 4 8 3 2 5


*/