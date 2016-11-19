package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int z=scn.nextInt();
		System.out.println("最小公倍數: "+lcm(x, y, z));
		
		

	}

	public static int lcm(int q,int w ,int e) {
		int sum = 1;
		while(true){
			if(sum%q==0 && sum%w==0 && sum%e==0){
				break;
			}else{
				sum=sum+1;
			}
		}
		return sum;
		
	}

}
