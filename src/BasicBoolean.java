
public class BasicBoolean {
	public static void main(String[] args) {
		//短路运算
		boolean b=5<3;
		boolean result = b&&(5/0>0);
		System.out.println(result);
		
		//三元运算符
		int n=-100;
		int x=n>=0?n:-n;
		System.out.println(x);
		
		//练习
		int age=7;
		boolean isPrimaryStudent=age>=6&&age<=12?true:false;
		System.out.println(isPrimaryStudent?"Yes":"No");
	}
}
