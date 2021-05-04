
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Morning_Jogging {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,m,testCases;
    
    static long a[][];
    
    static boolean vis[][];
    
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
        protected Node<T> clone() throws CloneNotSupportedException {
        
            try{
            
            Node<T> copy=(Node<T>) super.clone(); //To change body of generated methods, choose Tools | Templates.
        
            return copy;
            
            }catch(CloneNotSupportedException e){
                
                return this;
                
            }
            
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
            
            this.node=null;
            
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
        
        boolean isEmpty(){
            
            return len==0;
            
        }
        
        void push(T data){
            
            Node<T> top=new Node<>(data);
            
            top.setNext(node);
            
            node=top;
            
            len++;
            
        }
        
        T pop() throws ArrayIndexOutOfBoundsException {
            
            if(isEmpty()){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            T res=this.getNode().getData();
            
            this.node=this.getNode().getNext();
            
            len--;
            
            return res;
            
        }
        
        T peek() throws ArrayIndexOutOfBoundsException {
            
            if(isEmpty()){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            return this.getNode().getData();
            
        }
        
        T get(int index) throws ArrayIndexOutOfBoundsException, CloneNotSupportedException {
            
            if(isEmpty()){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            Node<T> copy=this.getNode().clone();
            
             int g=0;
           
             while(copy!=null){
                 
                 if( g==index ){
                     
                     return copy.getData();
                     
                 }
                 
                 copy=copy.getNext();
                 
                 g++;
                 
             }
            
            return null;
            
        }

        @Override
        protected Stack<T> clone() throws CloneNotSupportedException {
        
            try{
            
            Stack<T> copy=(Stack<T>) super.clone(); //To change body of generated methods, choose Tools | Templates.
        
            return copy;
            
            }catch(CloneNotSupportedException e){
                
                return this;
                
            }
            
        }
        
        void print(){
            
            Node<T> copy=this.getNode();
            
            while(copy!=null){
                
                out.print(copy.getData()+" ");
                
                out.flush();
                
                copy=copy.getNext();
                
            }
            
            out.println();
            out.flush();
            
        }
        
         T pop_at(int index){
            
            if( isEmpty() ){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            if(index==0){
                
                pop();
                
               // return null;
     //   System.exit(0);
              // System.gc();
               
            }/*else if(index==len-1){
             
                Node<T> n=this.getNode();
                
                while(n.next!=null){
                    
                    n=n.getNext();
                    
                }
                
                n.next=null;
                
                len--;
                
            }*/else{
             
            Node<T> n1=null;
            
            Node<T> n=this.getNode();
            
            for(int i=0;i<index-1;i++){
                
                n=n.getNext();
                
            }
            
            T res=n.getData();
            
            n1=n.getNext();

try{
            
            n.next=n1.getNext();
            
            this.setLen(len-1);
    
}catch(Exception e){
    
    
}
            
            return res;
            
            }
            
            return null;
            
        }
        
        @Override
        public String toString(){
            
            return this.getNode().toString();
            
        }
        
    }
    
    static void util(int k){
        
        int a1=-1,b=-1;
        
        long min=Long.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                
            if(!vis[i][j] && min>=a[i][j] ){
                
                min=a[i][j];
                a1=i;
                b=j;
                
            }
                
            }
            
        }
        
        vis[a1][k]=true;
        
        long temp=a[a1][b];
        a[a1][b]=a[a1][k];
        a[a1][k]=temp;
        
    }
    
    static void solve(){
        
        for(int i=0;i<n;i++){
            
            sort(a[i],0,a[i].length-1);
            
        }
        
      // long ans[][]=new long[n][m];
     
       vis=new boolean[n][m];
       
       for(int i=0;i<m;i++){
           
           util(i);
           
       }
       
        for(long i[]:a ){
            
            for(long j: i){
                
                out.print(j+" ");
                out.flush();
                
            }
            
            out.println();
            out.flush();
            
        }
        
    }
    
    static class element<T>{
        
        T data;
        int i,j;
       
    }
    
    public static void main(String[] amit) throws IOException {
            
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            m=in.nextInt();
            
            a=new long[n][m];
            
            for(int i=0;i<n;i++){
                
                for(int j=0;j<m;j++){
                    
                    a[i][j]=in.nextLong();
                    
                }
                
            }
            
            solve();
            
        }
        
    }
    
    static void merge(long mat[],int left,int right,int mid){
        
        int n1=mid-left+1,n2=right-mid;
        
        long L[]=new long[n1];
        long R[]=new long[n2];
        
        for(int i=0;i<n1;i++){
            
            L[i]=mat[left+i];
            
        }
        
        for(int i=0;i<n2;i++){
            
            R[i]=mat[mid+1+i];
            
        }
        
        int i=0,j=0,k=left;
        
        while(i<n1 && j<n2){
            
            if(L[i]<=R[j]){
                
                mat[k]=L[i];
                i++;
                
            }else{
                
                mat[k]=R[j];
                j++;
                
            }
            
            k++;
            
        }
        
        while(i<n1){
            
            mat[k]=L[i];
            
            i++;
            k++;
            
        }
        
        while(j<n2){
            
            mat[k]=R[j];
            
            j++;
            k++;
            
        }
        
    }
    
    static void sort(long mat[],int left,int right){
        
        if(left>=right){
            
            return;
            
        }
        
        int mid=(left+right)/2;
        
        sort(mat,left,mid);
        
        sort(mat,mid+1,right);
        
        merge(mat,left,right,mid);
        
    }
    
     static class Scanner {
        
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
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
    }
    
}
/*

2
2 3
2 3 4
1 3 5
3 2
2 3
4 1
3 5


*/

/*

1
2 3
2 3 4
1 3 5

*/