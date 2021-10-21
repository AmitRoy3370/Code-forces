import java.util.Scanner;

public class A_Vasya_And_Password{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static char a[];
	
	static void solve(){
		
		int upper=0,lower=0,digit=0;
		
		for(char i: a){
			
			if( Character.isUpperCase(i) ){
				
				upper++;
				
			}else if( Character.isLowerCase(i) ){
				
				lower++;
				
			}else{
				
				digit++;
				
			}
			
		}
		
		if( digit==0 ){
			
			int max=Math.max(upper,lower);
			
			if(max==upper){
				
				for(int i=0;i<n;i++){
					
					if( Character.isUpperCase(a[i]) ){
						
						a[i]='4';
						
						break;
						
					}
					
				}
		        
                digit++; 
				
			}else{
				
				for(int i=0;i<n;i++){
					
					if( Character.isLowerCase(a[i]) ){
						
						a[i]='4';
						
						break;
						
					}
					
				}
				
				digit++;
				
			}
			
		} if(upper==0){
			
			int max=Math.max(digit,lower);
			
			if(max==lower){
				
				for(int i=0;i<n;i++){
					
					if( Character.isLowerCase(a[i]) ){
						
						a[i]='A';
						
						break;
						
					}
					
				}
				
				upper++;
				
			}else{
				
				for(int i=0;i<n;i++){
					
					if( Character.isDigit(a[i]) ){
						
						a[i]='A';
						
						break;
						
					}
					
				}
				
				upper++;
				
			}
			 
		} if(lower==0) {
			
			int max=Math.max(digit,upper);
			
			if(max==upper){
				
				for(int i=0;i<n;i++){
					
					if( Character.isUpperCase(a[i]) ){
						
						a[i]='a';
						
						break;
						
					}
					
				}
				
				lower++;
				
			}else{
				
				for(int i=0;i<n;i++){
					
					if( Character.isDigit(a[i]) ){
						
						a[i]='a';
						
						break;
						
					}
					
				}
				
				lower++;
				
			}
			
		} if( upper==0 && digit==0 ){
			
			a[0]='A';
			a[1]='4';
			
		} if(lower==0 && digit==0){
			
			a[0]='a';
			a[1]='4';
			
		} if(upper==0 && lower==0){
			
			a[0]='A';
			a[1]='a';
			
		}
		
		System.out.println( new String(a) );
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			a=in.next().toCharArray();
			
			n=a.length;
			
			solve();
			
		}
		
	}
	
}