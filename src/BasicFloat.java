
public class BasicFloat {
	public static void main(String[] args) {
		double x = 1.0/10;
		double y=1-9.0/10;
		System.out.println(x);
		System.out.println(y);
		
		//��������
		int n=5;
		double d=1.2+24.0/n;//�������������������һ�������ͣ���ô���Ϳ����Զ�������������
		System.out.println(d);
		
		double d1 =1.2+24/n;
		System.out.println(d1);
		
		//��ϰ
		double a=1.0;
		double b=3.0;
		double c=-4.0;
		//��ƽ���� --һԪ���η���
		double r1=0;
		double r2=0;
		
		r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
		r2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
		System.out.println(r1);
		System.out.println(r2);
	}
}
