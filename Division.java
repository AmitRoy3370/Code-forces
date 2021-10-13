import java.util.Scanner;

public class Division{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,a,b,testCases;
	
	static void solve(){
		
		if( isPrime(n) ){
			
			if(n%2==0){
			
			System.out.println(a);
			
			}else{
				
				System.out.println(b);
				
			}
			
			return;
			
		}
		
	int even=0,odd=0;
		
		while(n%2==0){
			
			n/=2;
			
			even++;
			
		}
		
		for(int i=3;i*i<=n;i+=2){
			
			while(n%i==0){
				
				n/=i;
				
				odd++;
				
			}
			
		}
		
		if(n!=1 && (n&1)>=1 ){
        
		odd++;
        
		}
    
	int ans=0;
	
    if(a>=0&&b>=0){
        
		ans=a*even+b*odd;
    
	}else if(a<0 && b>=0){
     
	 ans=b*odd+(even>0?a:0);

     }else if(a>=0 && b<0){
      
	  if(even>0){

            ans=a*even;

	  }else{
            
			ans=b;
			
	  }
			
      }
		
		System.out.println(ans);
		
	}
	
	public static void main(String [] args){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=in.nextInt();
			
			b=in.nextInt();
			
			solve();
			
		}
		
	}
	
		static boolean isPrime(long x){
			
			for(long i=2;i<=(long)Math.sqrt(x);i++ ){
				
				if(x%i==0){
					
					return false;
					
				}
				
			}
			
			return true;
			
		}
		
}