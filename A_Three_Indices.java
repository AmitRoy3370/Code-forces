
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Three_Indices {

    static int testCases,n;
    
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int p[];
    
    static class Element implements Comparable<Element> {
    
    int element,position;

        public Element(int element, int position) {
            this.element = element;
            this.position = position;
        }

        @Override
        public int compareTo(Element t) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        return this.element-t.element;
        
        }
        
    @Override
        public String toString(){
        
        return this.element+" "+this.position;
            
        }
        
    }
    
    static void solve(){
    
    Element element[]=new Element[n];
        
    for(int i=0;i<n;i++){
    
   element[i]=new Element(p[i],i);
        
    }
   
   Arrays.sort(element);
    
   Stack<Element> stack=new Stack<>();
   
   for(Element i: element){
   
       stack.push(i);
       
   }
   
   int i1=-1,j1=-1,k1=-1;
   
   while(!stack.isEmpty()){
   
       try{
       
           i1=-1;
           j1=-1;
           k1=-1;
           
       int index=stack.pop().position;
   
       j1=index;
       
       int el=p[index];
       
       for(int i=index-1;i>=0;i--){
       
           if( p[i]<el ){
           
               i1=i;
               
               break;
               
           }
       
       }
       
       for(int i=index+1;i<n;i++){
       
           if(el>p[i]){
           
               k1=i;
           
               break;
               
           }
           
       }
       
       if(i1!=-1 && j1!=-1 && k1!=-1){
       
           out.println("YES");
           out.flush();
           
           out.println((i1+1)+" "+(j1+1)+" "+(k1+1));
           out.flush();
       
           return;
           
       }
       
       }catch(ArrayIndexOutOfBoundsException e){
       
           break;
       
       }
       
   }
   
   out.println("NO");
   out.flush();
   
    }
   
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
        
            n=in.nextInt();
            
            p=new int[n];
            
            for(int i=0;i<n;i++){
            
                p[i]=in.nextInt();
                
            }
    
            solve();
            
        }
        
    }
   
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
    
    return String.valueOf(this.getData().toString());
        
    }
    
    }
    
    static class Stack<T>{
    
    Node<T> node;
        
    int len;

        public Stack() {
    
            len=0;
           
            this.node=null;
            
        }
    
        boolean isEmpty(){
            
            return len==0;
            
        }
    
        int size(){
        
        return len;
            
        }

        public Node<T> getNode() {
            return node;
        }

        public void setNode(Node<T> node) {
            this.node = node;
        }
    
        void push(T data){
        
            Node<T> top=new Node<>(data);
        
            top.setNext(node);
            
            node=top;
            
            len++;
            
        }
        
        T pop(){
        
        if(isEmpty()){
        
            throw new ArrayIndexOutOfBoundsException();
        
        }
            
        T res=this.getNode().getData();
        
        this.node=this.getNode().getNext();
        
        len--;
        
        return res;
        
        }
        
        T top(){
            
            if(isEmpty()){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            return this.getNode().getData();
            
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

3
4
2 1 4 3
6
4 6 1 2 5 3
5
5 3 1 2 4


*/