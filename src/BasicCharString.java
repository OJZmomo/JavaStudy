
public class BasicCharString {
	public static void main(String[] args) {
		//�ַ�������
		String s1="Hello";
		String s2="Java";
		String s=s1+" "+s2+"!";
		System.out.println(s);
		
		//�����ַ���
		String ss="""
				Hello World!
				This is the first Java
				""";
		System.out.println(ss);
		
		//���ɱ�����
		String sss="hello";
		String t=sss;
		sss="world";
		System.out.println(sss);
		System.out.println(t);
		
		
		//��ϰ
		int a=72;
		int b=105;
		int c=65281;
		String r=""+(char)a+(char)b+(char)c;
		System.out.print(r);
	}
}
