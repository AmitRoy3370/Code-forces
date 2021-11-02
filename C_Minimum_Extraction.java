import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class C_Minimum_Extraction {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases,n;
    
    static long a[];
    
    static void solve(){
        
        if(n==1){
            
            out.println(a[0]);
            out.flush();
            
            return;
            
        }
        
        sort(a,0,n-1);
  
        /*for(long i: a){
            
            list.add(i);
            
        }*/
        
        Stack stack=new Stack();
        
        Stack second=new Stack();
        
        /*for(long i: a){
            
            stack.push(i);
            
        }*/
        
      //  Collections.sort(list);
        
        for(int i=0;i<n/2;i++){
            
            long temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
            
        }
        
        /*for(int i=n-2;i>=0;i-=2){
            
            second.push(a[i]);
            
        }*/
        
        /*for(long i: a){
            
            out.print(i+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();*/
        
        List<Long> list=new ArrayList<>();
  
        //Stack stack=new Stack();
        
        /*for(long i: a){
            
            list.add(i);
            
        }*/
        
      
        for(long i: a){
            
            list.add(i);
            
            stack.push(i);
            
        }
        
        long ans=stack.top();
        
        long distance=ans;
        
        int size=list.size();
        
        //int index=0;
        
        long arr[]=new long[n];
       
        int index=0;
        
       for(long i: list){
           
           arr[index++]=i;
           
       } 
        
       index=n-2;
       
        while(size>1){
            
            //long secondMin=list.get(size-2);
            
            long secondMin=arr[index--];
            
           // long secondMin=second.pop();
            
            //long temp=list.get(index+1);
            
            secondMin-=distance;
            
            ans=Math.max(ans,secondMin);
            
            distance+=secondMin;
            
            //list.remove(stack.pop() );
           
            stack.pop();
         
            size=stack.size();
            
        }
        
        out.println(ans);
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
               
    static long gcd(long a, long b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
	
   static void merge(long a[],int left,int right,int mid){
        
        int n1=mid-left+1,n2=right-mid;
        
        long L[]=new long[n1];
        
        long R[]=new long[n2];
        
        for(int i=0;i<n1;i++){
            
            L[i]=a[left+i];
            
        }
        
        for(int i=0;i<n2;i++){
            
            R[i]=a[mid+1+i];
            
        }
        
        int i=0,j=0,k1=left;
        
        while(i<n1 && j<n2){
            
            if( L[i]<=R[j] ){
                
                a[k1]=L[i];
                
                i++;
                
            }else{
                
                a[k1]=R[j];
                
                j++;
                
            }
            
            k1++;
            
        }
        
        while(i<n1){
            
            a[k1]=L[i];
            
            i++;
            
            k1++;
            
        }
        
        while(j<n2){
            
            a[k1]=R[j];
            
            j++;
            k1++;
            
        }
        
    }
    
    static void sort(long a[],int left,int right){
        
        if(left>=right){
            
            return;
            
        }
        
        int mid=(left+right)/2;
        
        sort(a,left,mid);
        
        sort(a,mid+1,right);
        
        merge(a,left,right,mid);
        
    }
	
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
        
    }
    
    static class Stack{
        
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
        
        void push(long data){
            
            Node temp=new Node(data);
            
            temp.setNext(node);
            
            node=temp;
            
            len++;
            
        }
        
        long top(){
            
            if( isEmpty() ){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            return this.node.getData();
            
        }
        
        long pop(){
            
            if( isEmpty() ){
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
            
            long data=this.node.getData();
            
            this.node=this.node.getNext();
            
            len--;
            
            return data;
            
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

8
1
10
2
0 0
3
-1 2 0
4
2 10 1 7
2
2 3
5
3 2 -4 -2 0
2
-1 1
1
-2


*/

/*

1
4
2 10 1 7

*/

/*

1
5
3 2 -4 -2 0

*/