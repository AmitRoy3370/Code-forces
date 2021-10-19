import java.util.Scanner;

public class D_Diverse_Garland{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static char a[];
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		a=in.next().toCharArray();
		
		int change=0;
		
		String s="BRG";
		
		for(int i=0;i<n-1;i++){
			
			if( a[i]==a[i+1] ){
				
				if(i+2>=n){
					
					change++;
					
					boolean v[]=new boolean[3];
				    
                    v[ s.indexOf( a[i] ) ]=true;					

                    for(int i1=0;i1<2;i1++){
						
						if( !v[i1] ){
							
							a[i+1]=s.charAt(i1);
							
						}
						
					} 
					
				}else{
				
				boolean b[]=new boolean[3];
				
				b[ s.indexOf( a[i] ) ]=true;
				b[ s.indexOf( a[i+2] ) ]=true;
				
				for(int i1=0;i1<3;i1++){
					
				   if( !b[i1] ){
					   
					   a[i+1]=s.charAt(i1);
					   
				   }
					
				}
				
				change++;
				
			}
			
		}
		
		}
		
		System.out.println(change);
		
		System.out.println( new String(a) );
		
	}
	
}

