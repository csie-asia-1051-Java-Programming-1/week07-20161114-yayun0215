package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		int a=m-n;
		System.out.println(c(m)/(c(n)*c(a)));

	}
	public static int c(int d){
		int sum=1;
		for(int i=1;i<=d;i++){
			sum=sum*i;
		}
		return sum;

	}

}
