import java.util.Scanner;

public class C_Restoring_Permutation{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static int a[];
	
	static void solve(){
	
	boolean visit[]=new boolean[2*n+1];
	
	for(int i: a){
		
		visit[i]=true;
		
	}
	
	int b[]=new int[2*n+1];
		
		for(int i=1;i<=n;i++){
			
			b[2*i-1]=a[i];
			
			int j=a[i]+1;
			
			boolean get=false;
			
			for(j=a[i]+1;j<=2*n;j++){
				
				if( !visit[j] ){
			
get=true;
			
					visit[j]=true;
					
					break;
					
				}
				
			}
			
		if(!get){
			
			System.out.println(-1);
			
			return;
			
		}	
			
			//if( !visit[ 2*i-1 ] ){
			
			//visit[2*i-1]=true;
			
            b[2*i]=j;		
		
			//}
		
		}
		
		//sort(b,1,b.length-1 );
		
		for(int i=1;i<=2*n;i++){
			
			System.out.print(b[i]+" ");
			
		}
		
		System.out.println();
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new int[n+1];
			
			for(int i=1;i<=n;i++){
				
				a[i]=in.nextInt();
				
			}
			
			solve();
			
		}
		
	}
	
		
   static void merge(int a[],int left,int right,int mid){
        
        int n1=mid-left+1,n2=right-mid;
        
        int L[]=new int[n1];
        
        int R[]=new int[n2];
        
        for(int i=0;i<n1;i++){
            
            L[i]=a[left+i];
            
        }
        
        for(int i=0;i<n2;i++){
            
            R[i]=a[mid+1+i];
            
        }
        
        int i=0,j=0,k=left;
        
        while(i<n1 && j<n2){
            
            if( L[i]<=R[j] ){
                
                a[k]=L[i];
                
                i++;
                
            }else{
                
                a[k]=R[j];
                
                j++;
                
            }
            
            k++;
            
        }
        
        while(i<n1){
            
            a[k]=L[i];
            
            i++;
            
            k++;
            
        }
        
        while(j<n2){
            
            a[k]=R[j];
            
            j++;
            k++;
            
        }
        
    }
    
    static void sort(int a[],int left,int right){
        
        if(left>=right){
            
            return;
            
        }
        
        int mid=(left+right)/2;
        
        sort(a,left,mid);
        
        sort(a,mid+1,right);
        
        merge(a,left,right,mid);
        
    }
	
}
/*

5
1
1
2
4 1
3
4 1 3
4
2 3 4 5
5
1 5 7 2 8


*/

/*

1
4
2 3 4 5

*/

/*

1
3
4 1 3

*/