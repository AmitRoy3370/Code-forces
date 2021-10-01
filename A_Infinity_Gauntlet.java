import java.util.Scanner;

public class A_Infinity_Gauntlet{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static boolean visit[]=new boolean[6];
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		for(int i=0;i<n;i++){
			
			String s=in.next();
			
			if( s.equals("purple") ){
				
				visit[0]=true;
				
			}else if( s.equals( "red" ) ){
				
				visit[1]=true;
				
			}else if( s.equals("green") ){
				
				visit[2]=true;
				
			}else if( s.equals("blue") ){
				
				visit[3]=true;
				
			}else if( s.equals("orange") ){
				
				visit[4]=true;
				
			}else if( s.equals("yellow") ){
				
				visit[5]=true;
				
			}
			
		}
		
		int count=0;
		
		StringBuilder ans=new StringBuilder();
		
		for(int i=0;i<6;i++){
			
			if( i==0 && !visit[i] ){
				
				ans.append("Power").append("\n");
				
				count++;
				
			}else if(i==1 && !visit[i]){
				
				count++;
				
				ans.append("Reality").append("\n");
				
			}else if(i==2 && !visit[i]){
				
				count++;
				
				ans.append( "Time" ).append("\n");
				
			}else if(i==3 && !visit[i] ){
				
				count++;
				
				ans.append("Space").append("\n");
				
			}else if(i==4 && !visit[i]){
				
				count++;
				
				ans.append("Soul").append("\n");
				
			}else if(i==5 && !visit[i] ){
				
				count++;
				
				ans.append("Mind").append("\n");
				
			}
			
		}
		
		System.out.println(count);
		System.out.println(ans);
		
	}
	
}