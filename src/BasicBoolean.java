
public class BasicBoolean {
	public static void main(String[] args) {
		//��·����
		boolean b=5<3;
		boolean result = b&&(5/0>0);
		System.out.println(result);
		
		//��Ԫ�����
		int n=-100;
		int x=n>=0?n:-n;
		System.out.println(x);
		
		//��ϰ
		int age=7;
		boolean isPrimaryStudent=age>=6&&age<=12?true:false;
		System.out.println(isPrimaryStudent?"Yes":"No");
	}
}
