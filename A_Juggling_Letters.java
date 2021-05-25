import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class A_Juggling_Letters{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,testCases;
	
	public static void main(String[] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
		
		n=in.nextInt();
		
		Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
           String s=in.next();
           for(int j=0;j<s.length();j++){
             map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            }
        }boolean flag=true;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
          if(entry.getValue()%n!=0){flag=false;break;}
        }
        System.out.println(flag?"YES":"NO");
		
	}
		
	}
	
}