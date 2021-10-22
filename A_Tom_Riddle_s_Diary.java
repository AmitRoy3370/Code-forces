import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class A_Tom_Riddle_s_Diary{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		int n=in.nextInt();
		
		String s[]=new String[n+1];
		
		int ans=0;
		
		Set<String> set=new HashSet<>();
		
		for(int i=1;i<=n;i++){
			
			s[i]=in.next();
			
			if( set.contains(s[i]) ){
				
				System.out.println("YES");
				
			}else{
				
				System.out.println("NO");
				
			}

           set.add(s[i]);

		}
		
//		System.out.println(ans);
		
	}
	
}

/*

9
liyzmbjwnzryjokufuxcqtzwworjeoxkbaqrujrhdidqdvwdfzilwszgnzglnnbogaclckfnbqovtziuhwvyrqwmskx
liyzmbjwnzryjokufuxcqtzwworjeoxkbaqrujrhdidqdvwdfzilwszgnzglnnbogaclckfnbqovtziuhwvyrqwmskx
liyzmbjwnzryjokufuxcqtzwworjeoxkbaqrujrhdidqdvwdfzilwszgnzglnnbogaclckfnbqovtziuhwvyrqwmskx
hrtm
ssjqvixduertmotgagizamvfucfwtxqnhuowbqbzctgznivehelpcyigwrbbdsxnewfqvcf
hyrtxvozpbveexfkgalmguozzakitjiwsduqxonb
wcyxteiwtcyuztaguilqpbiwcwjaiq
wcyxteiwtcyuztaguilqpbiwcwjaiq
bdbivqzvhggth


*/