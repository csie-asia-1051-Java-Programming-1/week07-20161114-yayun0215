package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021062 鄭雅韵
 */
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int data[]=new int[n];		
		for(int i=0;i<n;i++){
			data[i]=scn.nextInt();
		}
		
		System.out.println();
		System.out.println(std(var(n,data)));

	}

	public static double var(int n,int g[]) {
		double x=0;
		double y=0;
		double sum=0;
		for(int j=0;j<n;j++){
		x=x+g[j];
		}
		y=x/n;
		for(int j=0;j<n;j++){
			sum=((g[j]-y)*(g[j]-y))/n+sum;
			}
		
		
		
		return sum;
		
	}
	public static double std(double s){
		return Math.sqrt(s);
	}

}
