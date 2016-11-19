package hw;
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		fun();
	}
	public static void fun(){
		Scanner scn = new Scanner(System.in);
		String test = scn.next();
		char[ ] data = test.toCharArray();
		for(int i=data.length-1;i>=0;i--){
			System.out.print(data[i]);

	}
	}

}
