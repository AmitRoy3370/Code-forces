import java.util.Scanner;

public class B_Our_Tanya_is_Crying_Out_Loud{
	
	static Scanner in=new Scanner(System.in);
	
	static long n,k,a,b;
	
	public static void main(String [] amit){
		
		n=in.nextLong();
		
		k=in.nextLong();
		
		a=in.nextLong();
		
		b=in.nextLong();
		
		long cost=0;
		
		long x=(n-1)*a;
		
		if(k==1){
			
			System.out.print(x);
			
	    }else{
			
			long y=0;
			
			 while(n>1){
        
                if(n%k==0){
                    if(b*k<=n*a*(k-1))  y+=b;
                    else y+=(long)(n-n/k)*a;
                    n/=k;
                }
                else{
                    long rem=(n<k?(n-1):n%k);
                    n-=rem;
                    y+=rem*a;
                }
            }
			
			System.out.println( Math.min(x,y) );
			
		}
		
	}
	
}