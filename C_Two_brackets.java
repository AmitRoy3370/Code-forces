
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Two_brackets {

    static int testCases;
    
    static char ch[];
    
    static void solve(){
        
        Stack first=new Stack();
        
        Stack thrid=new Stack();
        
        int ans=0;
        
        for(char i: ch){
           
            switch (i) {
                case '(':
                    first.add(i);
                    break;
                case '[':
                    thrid.add(i);//out.println("third: "+thrid.toString()+" len: "+thrid.size());
                    break;
                case ')':
                    if( !first.isEmpty() && first.top()=='(' ){
                        
                        ans++;
                        
                        first.pop();
                        
                    }   break;
                case ']':
                    if( !thrid.isEmpty() && thrid.top()=='[' ){
                        
                        ans++;
                        
                        thrid.pop();
                        
                    }   break;
                default:
                    break;
            }
            
        }
        
        out.println( ans );
        out.flush();
        
    }
    
       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            ch=in.nextLine().toCharArray();
        
            solve();
            
        }
        
      //  solve();
        
    }
    
    static class Node{
        
        char data;
        
        Node node;

        public Node(char data) {
        
            this.data = data;
        
            this.node=null;
            
        }

        public char getData() {
            return data;
        }

        public void setData(char data) {
            this.data = data;
        }

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }

        @Override
        public String toString() {
            return  data + " ";
        }
        
    }
    
    static class Stack{
        
        int len;
        
        Node node;

        public Stack() {
        
            len=0;
            
            node=null;
            
        }
        
        int size(){
            
            return len;
            
        }
        
        boolean isEmpty(){
            
            return len==0;
            
        }
        
        void add(char data){
            
            Node temp=new Node(data);
            
            temp.setNode(node);
            
            node=temp;
            
            len++;
            
        }
        
        char pop(){
            
            if( isEmpty() ){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            char data=this.node.getData();
            
            node=node.getNode();
            
            len--;
            
            return data;
            
        }
        
        char top(){
            
             if( isEmpty() ){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            return node.getData();
            
        }
        
        @Override
        public String toString(){
            
            return node.toString();
            
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
/*

5
()
[] ()
([)]
)] ([
) [(]


*/