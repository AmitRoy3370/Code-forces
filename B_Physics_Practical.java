import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class B_Physics_Practical {

    static int n;
    
    static long a[];
    
    public static void main(String[] amit) throws FileNotFoundException, IOException {
        
        File input=new File("input.txt");
        
        File output=new File("output.txt");
        
        BufferedWriter bw;
        try (PrintWriter pw = new PrintWriter(output)) {
            bw = new BufferedWriter(pw);
            Scanner in=new Scanner(input);
            int index=0;
            while(in.hasNextLine()){
                
                if( index==0 ){
                    
                    n=Integer.parseInt(in.nextLine());
                    
                    a=new long[n];
                    
                }else{
                    
                    String s[]=in.nextLine().split(" ");
                    
                    for(int i=0;i<n;i++){
                        
                        a[i]=Long.parseLong(s[i]);
                        
                    }
                    
                    break;
                    
                }
                
                index++;
                
            }   sort(a,0,n-1);
            int ans=Integer.MAX_VALUE,i=0,j=0;
        
            while( i<n ){
                
                if( a[j]*2>=a[i] ){
                    
                    i++;
                    ans=Math.min(ans,n-i+j);
                    
                }else{
                
                //i++;
                j++;
                
                }
                
            }   pw.print(ans);
        }
        bw.close();
        
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
	
}
/*

10
39 9 18 13 6 16 47 15 1 24

*/