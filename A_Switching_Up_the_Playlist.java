
import java.util.Scanner;


public class A_Switching_Up_the_Playlist {

    static Scanner in=new Scanner(System.in);
    
    static int n;
    
    static class Node<T>{
        
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
            return "Node{" + "data=" + data + '}';
        }
        
    }
    
    static class Stack<T>  {
        
        int len;
        
        Node<T> node;

        public Stack() {
        
            len=0;
            
            node=null;
            
        }

        boolean isEmpty(){
            
            return len==0;
            
        }
        
        void push(T data){
            
            Node<T> top=new Node<>(data);
            
            top.setNext(node);
            
            node=top;
            
            len++;
            
        }
        
        T pop() throws Exception{
            
            if( isEmpty() ){
                
                throw new Exception("The stack is empty");
                
            }
            
            T res=this.getNode().getData();
            
            node=node.getNext();
         
            len--;
            
            return res;
            
        }
        
        public int getLen() {
            return len;
        }

        public void setLen(int len) {
            this.len = len;
        }

        public Node<T> getNode() {
            return node;
        }

        public void setNode(Node<T> node) {
            this.node = node;
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
        
        @Override
        public String toString(){
            
            return String.valueOf(this.getNode().getData());
            
        }
        
    }
    
    static Stack<String> stack=new Stack<>();
    
    public static void main(String[] amit) throws Exception {
        
        n=in.nextInt();
        
        for(int i=0;i<n;i++){
            
            stack.push(in.next());
            
        }
        
        while( !stack.isEmpty() ){
            
            try{
            
            System.out.println( stack.pop() );
            
            }catch(Exception e){
                
                break;
                
            }
            
        }
        
    }
    
}
/*

3
BohemianRhapsody
HookedOnAFeeling
CountryRoads

*/