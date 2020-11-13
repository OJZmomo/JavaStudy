import java.util.Scanner;

public class FlowIf {
	public static void main(String[] args) {
		int n=70;
		if (n >= 90) {
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
		System.out.println("End");
		
		//判断浮点类型
		double x=1-9.0/10;
		if (Math.abs(x-0.1)<0.00001) {
			System.out.println("x is 0.1");
		}else {
			System.out.println("x is not 0.1");
		}
		
		//判断引用类型相等
		String s1="hello";
		String s2="HELLO".toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		if (s1==s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		if (s1.equals(s2)) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		//练习
		Scanner scanner=new Scanner(System.in);
		System.out.println("体重(kg)：");
		double a=scanner.nextDouble();
		System.out.println("身高(m)：");
		double b=scanner.nextDouble();
		double BMI=a/(b*b);
		System.out.println(BMI);
		if (BMI<18.5) {
			System.out.println("过轻");
		}else if (BMI<25) {
			System.out.println("正常");
		}else if (BMI<28) {
			System.out.println("过重");
		}else if (BMI<32) {
			System.out.println("肥胖");
		}else {
			System.out.println("非常肥胖");
		}
		
	}
}
