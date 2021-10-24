import java.util.Scanner;
import java.util.Arrays;

public class B_Photo_to_Remember{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static int photoSet[][];
	
	static class element implements Comparable<element> {
		
		int ai,index;
		
		public element(int ai,int index){
			
			this.ai=ai;
			this.index=index;
			
		}
		
		public int compareTo(element t){
			
			return this.ai-t.ai;
			
		}
		
	}
	
    public static void main(String [] amit){
		
		n=in.nextInt();
		
		photoSet=new int[n][2];
		
		int totalWeidth[]=new int[n];
		
	    element Height[]=new element[n];
		
		int sum=0;
		
		for(int i=0;i<n;i++){
			
			photoSet[i][0]=in.nextInt();
			
			photoSet[i][1]=in.nextInt();
			
			sum+=photoSet[i][0];
			
			totalWeidth[i]=sum;
			
			Height[i]=new element(photoSet[i][1],i);
			
		}
		
		Arrays.sort(Height);
		
		for(int i=0;i<n;i++){
			
			int weidth,height=Integer.MIN_VALUE;
			
			if( i!=Height[n-1].index ){
				
				height=Height[n-1].ai;
				
			}else{
				
				height=Height[n-2].ai;
				
			}
			
			weidth=sum-photoSet[i][0];
			
			System.out.print( (weidth*height)+" " );
			
		}
		
	}
	
}