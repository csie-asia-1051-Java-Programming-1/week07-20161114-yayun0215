package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021062 鄭雅韵
 */
public class ex4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.print(fun(n));
		}
	public static int fun(int v1){
		if(v1==1){
			return v1;
		}
		else{
			
		return v1*fun(v1-1);
		
	}
	
			
		


	}

}
