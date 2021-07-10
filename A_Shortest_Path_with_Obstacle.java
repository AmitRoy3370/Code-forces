import java.util.Scanner;

public class A_Shortest_Path_with_Obstacle{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,xa,xb,xf,ya,yb,yf;
	
	public static void main( String[] amit ){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			xa=in.nextInt();
			ya=in.nextInt();
			xb=in.nextInt();
			yb=in.nextInt();
			xf=in.nextInt();
			yf=in.nextInt();
			
			int ans=0;
			
			ans+=Math.abs(xa-xb)+Math.abs(ya-yb);
			
			if( ( xa==xf && xf==xb )  ){
				
				int minY=Math.min( ya,yb );
				int maxY=Math.max( ya,yb );
				
				if( yf>minY && yf<maxY ){
					
					ans+=2;
					
				}
				
			}else if( ya==yf && yb==yf ){
				
				int minX=Math.min( xa,xb );
				int maxX=Math.max( xa,xb );
				
				if( xf>minX && xf<maxX ){
					
					ans+=2;
					
				}
				
			}else{
				
				
				
			}
			
			System.out.println(ans);
			
		}
		
	}
	
}