//september long challenge
//import java.util.Scanner;
//
//public class codechef {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		int a,b,c,d,e;
//		while(n-->0) {
//			a = sc.nextInt();
//			b = sc.nextInt();
//			c = sc.nextInt();
//			d = sc.nextInt();
//			e = sc.nextInt();
//			
//			if((a+b)<=d && (c<=e) ){
//					System.out.println("YES");		
//			}else if((a+c)<=d && (b<=e)) {
//					System.out.println("YES");
//			}else if((b+c)<=d && (a<=e)) {
//					System.out.println("YES");
//			}else {
//				System.out.println("NO");
//			}
//		}
//	}
//
//}


/*********************september 2021 long challenge-2nd program*************/

//import java.util.*;
//
//public class codechef{

//	
//	public static void main(String args[]) {
//		
//		Scanner sc = new Scanner(System.in);
//		int t=sc.nextInt();
//		int n,a,b;
//		String s;
//		while(t-->0) {
//			n = sc.nextInt();
//			a = sc.nextInt();
//			b = sc.nextInt();
//			s = sc.next();
//			int z = 0;
//			for(int i=0;i<n;i++) {
//				if(s.charAt(i)=='0') {
//					z=z+1;
//				}
//			}
//			
//			System.out.println((z*a)+((n-z)*b));
//		}
//		
//		
//	}
//}

/*********************september 2021 long challenge-3rd program*************/

//import java.util.*;
//
//public class codechef{
//
//	
//	public static void main(String args[]) {
//		
//		Scanner sc = new Scanner(System.in);
//		int t=sc.nextInt();
//		int n;
//		int od_posi;
//        while(t-->0) {
//        	n = sc.nextInt();
//        	if(n%2!=0) {
//        		od_posi = (n/2)+1;
//        	}else {
//        		od_posi = n/2;
//        	}
//        	int a;
//        	int c=0;
//        	for(int i=0;i<n;i++) {
//        		a=sc.nextInt();
//        		if(a%2==0) {
//        			c+=1;
//        		}
//        	}
//        	
//        	int ans = Math.abs(od_posi-c);
//        	System.out.println(n-ans);
//        }
//
//
//	}
//	
//}


