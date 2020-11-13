import java.util.Scanner;

public class FlowDoWhile {
	public static void main(String[] args) {
		
		//练习
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input m:");
		int m=scanner.nextInt();
		System.out.println("Input n:");
		int n=scanner.nextInt();
		do {
			sum+=m;
			m++;
		} while (m<=n);
		System.out.println(sum);
	}
}
