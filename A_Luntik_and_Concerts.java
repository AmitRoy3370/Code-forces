import java.util.Scanner;

public class A_Luntik_and_Concerts {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] args) {

int testCases=in.nextInt();
        
for(int i=0;i<testCases;i++){

        if(  (in.nextInt()*1+in.nextInt()*2+in.nextInt()*3)%2==0 ){
            
            System.out.println(0);
            
        }else{
            
            System.out.println(1);
            
        }
      
}
        
    }
    
}
