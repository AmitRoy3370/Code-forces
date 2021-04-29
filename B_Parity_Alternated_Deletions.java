
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Parity_Alternated_Deletions {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static long a[];
    
    //static List<Long> even=new ArrayList<>();
    
    //static List<Long> odd=new ArrayList<>();
    
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
        public String toString(){
            
            return String.valueOf(data);
            
        }
        
    }
    
    static class Stack<T>{
        
        int len;
        Node<T> node;

        public Stack() {
        
            len=0;
            node=null;
            
        }

        public Node<T> getNode() {
            return node;
        }

        public void setNode(Node<T> node) {
            this.node = node;
        }
        
        int size(){
            
            return len;
            
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
        
        T peek(){
            
            if(isEmpty()){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            return this.node.getData();
            
        }
        
        T pop(){
            
            if(isEmpty()){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            T res=this.node.getData();
            
            this.node=this.node.getNext();
            
            len--;
            
            return res;
            
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
            
            return this.node.toString();
            
        }
        
    }
    
    static Stack<Long> evenStack=new Stack<>();
    
    static Stack<Long> oddStack=new Stack<>();
    
    static Stack<Long> sort(Stack<Long> input){
        
        Stack<Long> temp=new Stack<>();
        
        while(!input.isEmpty()){
            
            long tmp;
            
            try{
            
             tmp=input.pop();
            
            }catch(ArrayIndexOutOfBoundsException e){
                
                break;
                
            }
            
            while( temp.size()>0 && temp.peek()>tmp ){
                
                input.push(temp.pop());
                
            }
            
            temp.push(tmp);
            
        }
        
        return temp;
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
            if( a[i]%2==0 ){
                
          //      even.add(a[i]);
                
                evenStack.push(a[i]);
                
            }else{
                
            //    odd.add(a[i]);
                
                oddStack.push(a[i]);
                
            }
            
        }
        
       // Collections.sort(even);
        
        //Collections.sort(odd);
        
        Stack<Long> sortedEven=sort(evenStack);
        
        Stack<Long> sortedOdd=sort(oddStack);
        
        long sum=0;
        
        while( sortedEven.size()>0 && sortedOdd.size()>0 ){
            
            sortedEven.pop();
            sortedOdd.pop();
            
        }
        
        if(sortedEven.size()>0){
            
            sortedEven.pop();
            
        }
        
        if( sortedOdd.size()>0 ){
            
            sortedOdd.pop();
            
        }
        
        while( !sortedEven.isEmpty() ){
            
            try{
            
            sum+=sortedEven.pop();
            
            }catch(ArrayIndexOutOfBoundsException e){
                
                break;
                
            }
            
        }
        
        while(!sortedOdd.isEmpty()){
            
            try{
            
            sum+=sortedOdd.pop();
            
            }catch(ArrayIndexOutOfBoundsException e){
                
                break;
                
            }
            
        }
        
        out.println(sum);
        out.flush();
        
/*        while(even.size()>0 && odd.size()>0){
            
            even.remove(0);
            odd.remove(0);
            
        }
        
        if(even.size()>0){
            
            even.remove(0);
            
        }
        
        if( odd.size()>0 ){
            
            odd.remove(0);
            
        }
        
        sum = even.stream().map((i) -> i).reduce(sum, (accumulator, _item) -> accumulator + _item);
        
         sum = odd.stream().map((i) -> i).reduce(sum, (accumulator, _item) -> accumulator + _item);
        
         out.println(sum);
         out.flush();*/
         
    }
 
      static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
    
}
/*

5
1 5 7 8 2


*/

/*

6
5 1 2 4 6 3


*/

/*

2
1000000 1000000


*/