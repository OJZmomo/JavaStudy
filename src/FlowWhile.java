
public class FlowWhile {
	public static void main(String[] args) {
		//while循环来累加1到100
		int sum=0;
		int n=1;
		while (n<=100) {
			sum +=n;
			n++;
		}
		System.out.println(sum);
		
		//练习
		int s=0;
		int m=20;
		int m1=100;
		while (m<=m1) {
			s=s+m;
			m++;
		}
		System.out.println(s);
	}
}
