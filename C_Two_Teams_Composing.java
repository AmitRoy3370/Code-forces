import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class C_Two_Teams_Composing{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int testCases,n;
	
	public static void main(String[] amit) throws IOException {
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
n=in.nextInt();		
		
		long a[]=new long[n];
		
		Map<Long,Integer> map=new HashMap<>();
		
		Set<Long> set=new HashSet<>();
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
			map.put(a[i],0);
			
			set.add(a[i]);
			
		}
			
			for(int i=0;i<n;i++){
				
				map.put(a[i],map.get(a[i])+1 );
				
			}
	
List<Integer> list=new ArrayList<>();
	
			for (Map.Entry<Long, Integer> entry : map.entrySet()) {
//    Integer k = entry.getKey();
//    String v = entry.getValue();
  //  System.out.println("key: " + k + ", value: " + v);

list.add( entry.getValue() );

}

int max=Collections.max(list);
			
			if(set.size()==max ){
				
				out.println(max-1);
				out.flush();
				
			}else if(set.size()>max ){
				
				out.println(max);
				out.flush();
				
			}else{
				
				out.println( set.size() );
				out.flush();
				
			}
			
		//	out.println( Math.max(Math.min(max-1,n),Math.min(max,n-1)  ) );
			//out.flush();
			
		}
		
	}
	
	static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
	
}