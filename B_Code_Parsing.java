import java.util.Scanner;

public class B_Code_Parsing{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static char a[];
	
	public static void main(String [] amit){
		
		a=in.next().toCharArray();
		
		n=a.length;
		
		if(n==1){
			
			System.out.print(a[0]);
			
			return;
			
		}
		
		int x=0,y=0;
		
		StringBuilder ans=new StringBuilder();
		
		for(char i: a){
			
			if(i=='x'){
				
				++x;
				
			}else{
				
				++y;
				
			}
			
		}
		
		if(x==y){
			
			//System.out.print("");
			
		}else if(x>y){
			
			x-=y;
			
			while(x-->0){
				
				//System.out.print('x');
				
				ans.append('x');
				
			}
			
		}else{
			
			y-=x;
			
			while(y-->0){
				
				//System.out.print('y');
				
				ans.append('y');
				
			}
			
		}
		
		System.out.print(ans);
		
		/*StringBuilder ans=new StringBuilder();
		
		for(int i=0;i<n;i++){
			
			if( i+1<n && ((a[i]=='x' && a[i+1]=='y') || (a[i]=='y' && a[i+1]=='x')) ){
				
				i++;
				
			}else{
				
				ans.append(a[i]);
				
			}
			
		}
		
		if( !(a[n-1]=='y' && a[n-2]=='x') || !( a[n-1]=='x' && a[n-2]=='y' ) ){
			
		//	ans.append(a[n-1]);
			
		}
		
		System.out.println(ans);*/
		
	}
	
}

//xyyxyyyyyxxxxxxxyxyxyyxyyxyyxxyxyxyxxxyxxy
//yxyyxyyx