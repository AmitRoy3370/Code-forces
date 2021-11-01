import java.util.Scanner;

public class A_Ahahahahahahahaha{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static int a[];
	
	static void solve(){
				
		/*if(n==2){
			
			if( a[0]==a[1] ){
				
				System.out.println(2+"\n"+a[0]+" "+a[1]);
				
			}else{
				
				System.out.println( 1+"\n"+a[0] );
				
			}
			
			return;
			
		}*/
		
		int evenSum=0,oddSum=0;
		
		for(int i=1;i<=n;i++){
			
			if(i%2==1){
				
				oddSum+=a[i];
				
			}else{
				
				evenSum+=a[i];
				
			}
			
		}
		
		if(evenSum==oddSum){
			
			System.out.println(n);
			
			for(int i=1;i<=n;i++){
				
				System.out.print(a[i]+" ");
				
			}
			
			System.out.println();
			
			return;
			
		}
		
		int one=0,zero=0;
		
		for(int i: a){
			
			if(i==1){
				
				one++;
				
			}else{
				
				zero++;
				
			}
			
		}
		
		if(one>zero){
			
			if( (one%2)==1 ){
				
				--one;
				
			}
			
			System.out.println(one);
			
			for(int i=1;i<=one;i++){
				
				System.out.print(1+" ");
				
			}
			
			System.out.println();
			
		}else{
			
			System.out.println(n/2);
			
			for(int i=0;i<n/2;i++){
				
				System.out.print(0+" ");
				
			}
			
			System.out.println();
			
		}
		
		/*Stack even=new Stack();
		
		Stack odd=new Stack();
		
		Stack evenCopy=new Stack();
		
		Stack oddCopy=new Stack();
		
		long sumEven=0,sumOdd=0;
		
		for(int i=1;i<=n;i++){
			
			if(i%2==0){
				
				if( a[i]>=1 ){
				
				even.push(a[i]);
				
				evenCopy.push(a[i]);
				
				sumEven+=a[i];
				
				}
				
			}else{
				
				if(a[i]>=1){
				
				odd.push(a[i]);
				
				oddCopy.push(a[i]);
				
				sumOdd+=a[i];
				
				}
				
			}
			
		}
		
		if( sumEven==sumOdd ){
			
			System.out.println(n);
			
			for(int i=1;i<=n;i++){
				
				System.out.print(a[i]+" ");
				
			}
			
			System.out.println();
			
		}else{
			
			long difference=Math.abs( sumEven-sumOdd );
			
			//System.out.println("difference: "+difference);
			
			//System.out.println("sumEven: "+sumEven);
			
			//System.out.println("sumOdd: "+sumOdd);
			
			long newSumEven=0,newSumOdd=0,ans=0;
			
			for(int i=1;i<=n;i++){
				
				if(i%2==1){
					
					if( !oddCopy.isEmpty() && a[i]!=0 ){
						
						//System.out.print( even.pop()+" " );
						
						oddCopy.pop();
						
						ans++;
						
					}else if(a[i]==0){
						
						//System.out.print( 0+" " );
						
						ans++;
						
					}else{
						
						break;
						
					}
					
					newSumOdd+=a[i];
					
				}else{
					
					if( !evenCopy.isEmpty() && a[i]!=0 ){
						
						//System.out.print(odd.pop()+" ");
						
						evenCopy.pop();
						
						ans++;
						
					}else if(a[i]==0){
						
						//System.out.print(a[i]+" ");
						
						ans++;
						
					}else{
						
						break;
						
					}
					
					newSumEven+=a[i];
					
				}
				
				if(   newSumEven!=0 && newSumEven==newSumOdd ){
					
					break;
					
				}
				
			}
			
		//	System.out.println("newSumEven: "+newSumEven);
			//System.out.println("newSumOdd: "+newSumOdd );
			
			System.out.println(ans);
			
			newSumEven=0;
			newSumOdd=0;
			
			for(int i=1;i<=n;i++){
				
				if(i%2==1){
					
					if( !odd.isEmpty() && a[i]!=0 ){
						
						System.out.print( odd.pop()+" " );
						
						//ans++;
						
					}else if(a[i]==0){
						
						System.out.print( 0+" " );
						
						//ans++;
						
					}else{
						
						break;
						
					}
					
					newSumOdd+=a[i];
					
				}else{
					
					if( !even.isEmpty() && a[i]!=0 ){
						
						System.out.print(even.pop()+" ");
						
						//ans++;
						
					}else if(a[i]==0){
						
						System.out.print(a[i]+" ");
						
						//ans++;
						
					}else{
						
						break;
						
					}
					
					newSumEven+=a[i];
					
				}
				
				if(  newSumEven!=0 && newSumEven==newSumOdd ){
					
					break;
					
				}
				
			}
			
			System.out.println();
			
			/*for(int i: a){
				
				
			}
			
		}*/
		
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
	
	static class Node{
		
		int data;
		
		Node next;
		
		public Node(int data){
			
			this.data=data;
			this.next=null;
			
		}
		
	}
	
	static class Stack{
		
		int len;
		
		Node node;
		
		public Stack(){
			
			len=0;
			
			node=null;
			
		}
		
	    int size(){
			
			return len;
			
		}
		
		boolean isEmpty(){
			
			return len==0;
			
		}
		
		void push(int data){
			
			Node temp=new Node(data);
			
			temp.next=node;
			
			node=temp;
			
			len++;
			
		}
		
		int pop(){
			
			if( isEmpty() ){
				
				throw new ArrayIndexOutOfBoundsException();
				
			}
			
			int data=node.data;
			
			node=node.next;
			
			len--;
			
			return data;
			
		}
		
	}
	
}