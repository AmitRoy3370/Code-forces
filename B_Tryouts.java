import java.util.Scanner;

public class B_Tryouts {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] amit) {
        
        int n=in.nextInt();
        
        boolean a[][]=new boolean[28][28];
        
       for(int i=0;i<n;i++){
           
           int x=in.nextInt();
           int y=in.nextInt();
           
           a[x][y]=true;
           
       }
        
       int ans=0;
       
       for(int i=1;i<=25;i++){
           
           for(int j=1;j<=25;j++){
               
               if( a[i][j] && a[i-1][j] && a[i+1][j] && a[i][j+1] && a[i][j-1] ){
                   
                 ans++;  
                   
               }
               
           }
           
       }
       
        System.out.println(ans);
       
    }
    
}
/*

8
1 2
2 1
2 2
2 3
3 1
3 2
3 3
4 2


*/

/*

3
1 2
3 4
5 6

*/