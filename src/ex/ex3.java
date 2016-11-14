package ex;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * Author: 105021062 鄭雅韵
 */
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int data[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				data[i][j] = scn.nextInt();
			}
		}
		System.out.println(var2(n,data));
		System.out.println(std2(var2(n,data)));

	}
	

	

	public static double var2(int n,int g[][]) {
		double x=0;
		double y=0;
		double sum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
		x=x+g[i][j];
		}
		}
		y=x/(n*n);
		for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			sum=((g[i][j]-y)*(g[i][j]-y))/(n*n)+sum;
			}
		}
		
		
		
		return sum;
		
	}

	public static double std2(double s) {
		return Math.sqrt(s);
	}
}
