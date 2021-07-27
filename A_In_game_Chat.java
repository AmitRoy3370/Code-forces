import java.util.Scanner;

public class A_In_game_Chat{

static Scanner in=new Scanner(System.in);

static int testCases,n;

static String s;

static void solve(){

char a[]=s.toCharArray();

int i=n-1,count=0;

while(i>=0 && a[i]==')' ){

i--;

count++;

}

if( count>n-count || n==count ){

System.out.println("YES");

}else{

System.out.println("NO");

}

}

public static void main(String[] amit){

testCases=in.nextInt();

for(int t=0;t<testCases;t++){

n=in.nextInt();

s=in.next();

solve();

}

}

}
