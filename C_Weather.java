
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C_Weather {

    public static void main(String[] amit) throws FileNotFoundException, IOException {
        
        File file=new File("input.txt");
        
        File ans=new File("output.txt");
 
        PrintWriter pw=new PrintWriter(ans);
        
        BufferedWriter out=new BufferedWriter( pw );
        
        Scanner in=new Scanner(file);
        
        int n = 0,i=0;
        
        int a[] = null;
        
        while(in.hasNextLine()){
            
            if( i==0 ){
                
                n=Integer.parseInt(in.nextLine());
                
                a=new int[n];
                
            }else{
             
               // if(  ){
                
                String s[]=in.nextLine().split(" ");
                
                if( s==null || s.length<=0 ){
                    
                    break;
                    
                }
                
                for(int j=0;j<n;j++){
                    
                    try{
                    
                    a[j]=Integer.parseInt(s[j]);
                    
                    }catch(NumberFormatException e){
                        
                        break;
                        
                    }
                    
                }
                
                //}
                
            }
            
            i++;
            
        }
        
        int L[]=new int[n+2];
        
        int R[]=new int[n+2];
        
        int index=n-1;
        
       for(int j=1;j<=n;j++){
           
           L[j]=L[j-1]+(a[j-1]>=0?1:0);
           
       }
              
       for(int j=n;j>=1;j--){
           
           R[j]=R[j+1]+(a[j-1]<=0?1:0);
           
       }
       
        int min=Integer.MAX_VALUE;
        
       /* for(int j: L){
            
            System.out.print(j+" ");
          //  out.flush();
            
        }
        
        System.out.println();
        
        for(int j: R){
            
            System.out.print(j+" ");
          //  out.flush();
            
        }
        
        System.out.println();*/
        
        for(int j=1;j<n;j++){
            
            min=Math.min( min,L[j]+R[j+1] );
            
        }
        
        pw.print(min);
        
        pw.close();
        out.close();
        
     //   System.out.println("min: "+min);
        
    }
    
}
