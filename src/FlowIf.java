import java.util.Scanner;

public class FlowIf {
	public static void main(String[] args) {
		int n=70;
		if (n >= 90) {
            System.out.println("����");
        } else if (n >= 60) {
            System.out.println("������");
        } else {
            System.out.println("�ҿ���");
        }
		System.out.println("End");
		
		//�жϸ�������
		double x=1-9.0/10;
		if (Math.abs(x-0.1)<0.00001) {
			System.out.println("x is 0.1");
		}else {
			System.out.println("x is not 0.1");
		}
		
		//�ж������������
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
		
		//��ϰ
		Scanner scanner=new Scanner(System.in);
		System.out.println("����(kg)��");
		double a=scanner.nextDouble();
		System.out.println("���(m)��");
		double b=scanner.nextDouble();
		double BMI=a/(b*b);
		System.out.println(BMI);
		if (BMI<18.5) {
			System.out.println("����");
		}else if (BMI<25) {
			System.out.println("����");
		}else if (BMI<28) {
			System.out.println("����");
		}else if (BMI<32) {
			System.out.println("����");
		}else {
			System.out.println("�ǳ�����");
		}
		
	}
}
