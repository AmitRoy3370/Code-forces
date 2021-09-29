import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Shifting_Sort {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n,testCases;
    
    static int a[],b[];
    
      static class Node{
    
    long data;
        
    Node next;

        public Node(long data) {
        
            this.data = data;
        
            this.next=null;
            
        }
        
    }
    
    static class LinkedList{
        
        Node head=null;
        Node tail=null;
        
        int len;

        public LinkedList() {
        
            len=0;
            
        }
       
        void addNode(long data){
            
                   Node newNode = new Node(data);    
              
        if(head == null) {    
          
            head = newNode;    
            tail = newNode;    
        }    
        else {    
           
            tail.next = newNode;    
              
            tail = newNode;    
        }    
            
        len++;
        
        }
        
        void addFront(long data){
            
            len++;
            
            Node node=new Node(data);
            
            if(head==null){
                
                head=node;
                tail=node;
                
            }else{
                
                node.next=head;
                
               // tail=node;
                
                head=node;
                
            }
            
        }
        
        long front(){
            
            return this.head.data;
            
        }
     
        void display() {    
        
            
        Node current = head;    
            
        if(head == null) {    
              
            return;    
        }    
        
        
        while(current != null) {    
               
            out.print(current.data + " ");    
            out.flush();
            current = current.next;    
        }    
        System.out.println();    
    }    
        
        int size(){
            
            return len;
            
        }
        
    }
    
    static void merge(int a[],int left,int right,int mid){
        
        int n1=mid-left+1,n2=right-mid;
        
        int L[]=new int[n1];
        
        int R[]=new int[n2];
        
        for(int i=0;i<n1;i++){
            
            L[i]=a[left+i];
            
        }
        
        for(int i=0;i<n2;i++){
            
            R[i]=a[mid+1+i];
            
        }
        
        int i=0,j=0,k=left;
        
        while(i<n1 && j<n2){
            
            if( L[i]<=R[j] ){
                
                a[k]=L[i];
                
                i++;
                
            }else{
                
                a[k]=R[j];
                
                j++;
                
            }
            
            k++;
            
        }
        
        while(i<n1){
            
            a[k]=L[i];
            
            i++;
            
            k++;
            
        }
        
        while(j<n2){
            
            a[k]=R[j];
            
            j++;
            k++;
            
        }
        
    }
    
    static void sort(int a[],int left,int right){
        
        if(left>=right){
            
            return;
            
        }
        
        int mid=(left+right)/2;
        
        sort(a,left,mid);
        
        sort(a,mid+1,right);
        
        merge(a,left,right,mid);
        
    }
    
    static void solve(){
        
        sort(b,1,n);
    
        /*for(int i: b){
            
            out.print(i+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();*/
        
        LinkedList list=new LinkedList();
        
        for(int i=1;i<n;i++){
            
            if(a[i]!=b[i]){
            
            int ans=0;
            
            for(int j=i+1;j<=n;j++){
                
                if(b[i]==a[j]){
                    
                    ans=j;
                    break;
                    
                }
                
            }
            
            list.addNode(i);
            
            list.addNode(ans);
            
            list.addNode(ans-(i));
            
            for(int j = ans;j>i;j--){
                    
                a[j] = a[j-1];
                
            }
            
            a[i]=b[i];
            
            }
            
        }
        
        int i=0;
        
        out.println(list.size()/3 );
        out.flush();
        
        while( list.head!=null ){
            
            if(i%3==0){
                
                out.println();
                out.flush();
                
            }else{
                
                out.print(" " );
                out.flush();
                
            }
            
            out.print(list.head.data);
            out.flush();
            
            list.head=list.head.next;
            
            i++;
            
        }
        
        out.println();
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n+1];
            
            b=new int[n+1];
            
            for(int i=1;i<=n;i++){
                
                a[i]=in.nextInt();
                
                b[i]=a[i];
                
            }
            
            solve();
            
        }
        
        in.close();
        
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

4
2
2 1
3
1 2 1
4
2 4 1 3
5
2 5 1 4 3


*/

/*

1
5
2 5 1 4 3


*/