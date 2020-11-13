
public class BasicFloat {
	public static void main(String[] args) {
		double x = 1.0/10;
		double y=1-9.0/10;
		System.out.println(x);
		System.out.println(y);
		
		//类型提升
		int n=5;
		double d=1.2+24.0/n;//参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型
		System.out.println(d);
		
		double d1 =1.2+24/n;
		System.out.println(d1);
		
		//练习
		double a=1.0;
		double b=3.0;
		double c=-4.0;
		//求平方根 --一元二次方程
		double r1=0;
		double r2=0;
		
		r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
		r2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
		System.out.println(r1);
		System.out.println(r2);
	}
}
