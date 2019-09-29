package javaTraining;

import java.util.Scanner;
public class back1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(); //과목 개수
		int s[]=null;
		int f[]=null;
		int m;
		int sum = 0;
		double avg;


		for(int i=0; i<n; i++) {
			s[i]=scan.nextInt();
			m=s[0];
			for(int j=0; j<n; j++) {
				if(m<=s[j])
					m=s[j];
			}
			f[i]=s[i]/m*100;
			sum+=f[i];
		}
		avg=sum/n;
		System.out.println(avg);
	}
}
