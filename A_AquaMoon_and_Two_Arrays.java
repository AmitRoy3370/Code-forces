
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class A_AquaMoon_and_Two_Arrays {

           static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases,n;
    
    static int a[];
    static int b[];
    
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
        
        if(L[i]<=R[j]){
            
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
    
    static class pair{
        
        int i,j;

        public pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
        
        @Override
        public String toString(){
            
            return i+" "+j;
            
        }
        
    }
    
    static void solve(){
        
        int sumA=0,sumB=0;
        
        for(int i=0;i<n;i++){
            
            sumA+=a[i];
            sumB+=b[i];
            
        }
        
        if(sumA!=sumB){
            
            out.println(-1);
            out.flush();
            
            return;
            
        }
       
        Queue<Integer> less=new LinkedList<>();
        Queue<Integer> more=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            
            if(a[i]>b[i]){
                
                more.add(i+1);
                
            }else if(b[i]>a[i]) {
                
                less.add(i+1);
                
            }
            
        }
        
        List<pair> list=new ArrayList<>();
        
        while(!less.isEmpty()){
            
           int i=more.poll(),j=less.poll();
            
        list.add(new pair(i,j));
           
        --a[i-1];
        ++a[j-1];
        
        if(a[i-1]>b[i-1]){
            
            more.add(i);
            
        } if(a[j-1]<b[j-1]){
            
            less.add(j);
            
        }
        
        }

out.println(list.size());
out.flush();
        
list.stream().map((i) -> {
    out.println(i.toString());
                   return i;
               }).forEachOrdered((_item) -> {
                   out.flush();
               });

    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
    
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n];
            b=new int[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
            }
            
            for(int i=0;i<n;i++){
                
                b[i]=in.nextInt();
                
            }
            
            solve();
            
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
        
    }
    
}
/*

4
4
1 2 3 4
3 1 2 4
2
1 3
2 1
1
0
0
5
4 3 2 1 0
0 1 2 3 4


*/

/*

1
5
4 3 2 1 0
0 1 2 3 4

*/

/*

1
4
1 2 3 4
3 1 2 4

*/