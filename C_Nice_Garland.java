import java.util.Scanner;
public class C_Nice_Garland{
	static Scanner in=new Scanner(System.in);
	String s[]={"RGB","RBG","BRG","BGR","GRB","GBR"};
	
	void main(){
		int n=in.nextInt(),count=0,min=n,ans=5;
		String t=in.next();
		for(int i=0;i<6;i++){
			for(int j=0;j<t.length();j++){
				if(t.charAt(j)!=s[i].charAt(j%3)) count++;
			}
			if(count<min){
				ans=i;min=count;
			}
			count=0;
		}
		System.out.println(min);
		for(int i=0;i<n;i++) System.out.print(s[ans].charAt(i%3));
	}
	public static void main(String[] args) {
		//System.out.println((new q()).main());
		(new C_Nice_Garland()).main();
	}
}