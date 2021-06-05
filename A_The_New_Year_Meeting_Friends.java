
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class A_The_New_Year_Meeting_Friends {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] amit) {
        
        List<Integer> list=new ArrayList<>();
        
        int a[]={in.nextInt(),in.nextInt(),in.nextInt()};
        
        for(int i=0;i<a.length-1;i++){
            
            for(int j=i+1;j<a.length;j++){
                
                list.add(Math.abs(a[i]-a[j]));
                
            }
            
        }
        
        Collections.sort(list,Collections.reverseOrder());
        
        System.out.println(list.get(0));
        
    }
    
}
