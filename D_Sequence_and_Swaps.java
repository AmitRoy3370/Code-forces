import java.util.Scanner;

public class D_Sequence_and_Swaps{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,testCases;
	
	static long x;
	
	static long a[];
	
	static void solve(){
		
		//best cases
		
		//1. if array is already sorted
		
		long copy[]=new long[n];
		
		for(int i=0;i<n;i++){
			
			copy[i]=a[i];
			
		}
		
		sort(copy,0,n-1);
		
		boolean yes=true;
		
		for(int i=0;i<n;i++){
			
			if( a[i]!=copy[i] ){
				
				yes=false;
				
				break;
				
			}
			
		}
		
		if(yes){
			
			System.out.println(0);
			
			return;
			
		}
		
		//2. if the array is not sorted and no value in the array is greater than the x
		
		boolean already=false;
		
		for(long i: a){
			
			if( (i>x) ){
				
				already=true;
				
				break;
				
			}
			
		}
		
		if( !already ){
			
			System.out.println(-1);
			
			return;
			
		}
		
		//3. if the value of the n is 2
		
		if(n==2){
			
			if( a[1]>=a[0] ){
				
				//if the array is already sorted
				
				System.out.println(0);
				
			}else if( a[0]<x && a[1]<x && a[1]<a[0] ){
				
				//if the array is not sorted but no value in the array is greater than x
				
				System.out.println(-1);
				
			}else if( a[0]>x && a[1]<a[0] && a[1]<x ){
				
				System.out.println(-1);
				
			}else{
				
				//other wise by any possible single movement make the array sorted
				
				System.out.println(1);
				
			}
			
			return;
			
		}
		
		//4. if the size of the array is only 1
		
		if(n==1){
			
			System.out.println(0);
			
			return;
			
		}
		
		//worst cases
		
		int ans=0;
		
		for(int i=0;i<n;i++){
			
			yes=true;
			
			for(int j=0;j<n-1;j++){
			
			   if(a[j]>a[j+1]){
				
				//System.out.println(ans);
				    
					yes=false;
				
				    break;
				
			   }
			
			}
			
			if(yes){
				
				System.out.println(ans);
				
				return;
				
			}
			
			if( a[i]>x ){
				
				long k=x;
				x=a[i];
				a[i]=k;
				
				ans++;
				
			}
			
		}
		
		for(int i=0;i<n;i++){
			
			copy[i]=a[i];
			
		}
		
		sort(copy,0,n-1);
		
		yes=false;
		
		for(int i=0;i<n;i++){
			
			if( a[i]!=copy[i] ){
				
				yes=true;
				
				break;
				
			}
			
		}
		
		if(yes){
			
			System.out.println(-1);
			
		}else{
			
			System.out.println(ans);
			
		}
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			x=in.nextLong();
			
			a=new long[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextLong();
				
			}
			
			solve();
			
		}
		
	}
	
static void merge(long a[],int left,int right,int mid){
	
	int n1=mid-left+1,n2=right-mid;
	
	long L[]=new long[n1];
	
	long R[]=new long[n2];
	
	for(int i=0;i<n1;i++){
		
		L[i]=a[left+i];
		
	}
	
	for(int i=0;i<n2;i++){
		
		R[i]=a[mid+1+i];
		
	}
	
	int i=0,j=0,k=left;
	
	while(i<n1 && j<n2){
		
		if(L[i]<=R[j]){
			
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

static void sort(long a[],int left,int right){
	
	if(left>=right){
		
		return;
		
	}
	
	int mid=(left+right)/2;
	
	sort(a,left,mid);
	
	sort(a,mid+1,right);
	
	merge(a,left,right,mid);
	
}
	
}