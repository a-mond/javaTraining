//백준 10950
//재업로드
package javaTraining;

import java.util.Scanner;

public class back10950 {
	
	public static void main(String[] args) {
		
		int t;
		int a,b;
		Scanner scan=new Scanner(System.in);
		
		t=scan.nextInt();
		
		for(int i=0; i<t; i++) {
			a=scan.nextInt();
			b=scan.nextInt();
			int sum=a+b;
			System.out.println(sum);
		}
	}
}
 