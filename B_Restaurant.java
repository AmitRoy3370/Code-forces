import java.util.Arrays;
import java.util.Scanner;

public class B_Restaurant {

    static Scanner in=new Scanner(System.in);
    
    static class Restrurent implements Comparable<Restrurent> {
        
        long start,end;

        public Restrurent(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Restrurent t) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if( this.end>t.end ){
            
            return 1;
            
        }else if( this.end<t.end ){
            
            return -1;
            
        }
        
        return 0;
        
        }

        @Override
        public String toString() {
            return "Restrurent{" + "start=" + start + ", end=" + end + '}';
        }
        
    }
    
    public static void main(String[] amit) {
        
        int n=in.nextInt();
        
        Restrurent a[]=new Restrurent[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=new Restrurent(in.nextLong(),in.nextLong());
            
        }
        
        Arrays.sort(a);
        
        /*for(Restrurent i: a){
            
            System.out.println(i.toString());
            
        }*/
        
        int ans=1;
        
        for(int i=0;i<n-1;i++){
            
            int index=i;
            
            while( i+1<n && a[index].end>=a[i+1].start ){
                
             //   index++;
                
                i++;
                
            }
            
         //   System.out.println("i: "+i+" "+a[i].start+" "+a[index].end);
            
            if( i>=n ){
                
                break;
                
            }
            
            if( i+1<n && a[index].end<=a[i+1].start ){
           
               // System.out.println(a[index].end+" "+a[i+1].start);
                
                ans++;
                
            }
            
        }
        
        System.out.println(ans);
        
    }
    
}
/*

2
7 11
4 7


*/

/*

5
1 2
2 3
3 4
4 5
5 6


*/

/*

6
4 8
1 5
4 7
2 5
1 3
6 8


*/