
public class BasicCharString {
	public static void main(String[] args) {
		//字符串连接
		String s1="Hello";
		String s2="Java";
		String s=s1+" "+s2+"!";
		System.out.println(s);
		
		//多行字符串
		String ss="""
				Hello World!
				This is the first Java
				""";
		System.out.println(ss);
		
		//不可变特性
		String sss="hello";
		String t=sss;
		sss="world";
		System.out.println(sss);
		System.out.println(t);
		
		
		//练习
		int a=72;
		int b=105;
		int c=65281;
		String r=""+(char)a+(char)b+(char)c;
		System.out.print(r);
	}
}
