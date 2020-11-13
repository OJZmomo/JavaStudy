
public class BasicInterger {
	public static void main(String[] args) {
		//四则运算
		int i = (100+200)*(99-88);
		int n=7*(5+(i-9));
		int x = n/i;
		int y = n%i;
		System.out.println(i);
		System.out.println(n);
		System.out.println(x);
		System.out.println(y);
		
		//自增自减
		int a=3300;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		int c = 100+(++a);
		System.out.println(c);
		
		//移位运算
		int o = 7;
		int p=o<<1;
		int q=o>>1;
		System.out.println(p);
		System.out.println(q);
		
		//位运算
		int u=167776589;
		int v=167776500;
		System.out.println(u&v);
		
		//类型自动提升与强制转型
		short s = 1234;
		int f = 123456;
		int e = s+f;
		System.out.println(e);
		
		int i1=1234567;
		short s1=(short)i1;
		System.out.println(s1);
		int i2=12345678;
		short s2=(short)i2;
		System.out.println(s2);
		
		
		//练习
		int t=100;
		int sum=(100+1)*100/2;
		System.out.println(sum);
	}
}
