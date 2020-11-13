
public class FlowFor {
	public static void main(String[] args) {
		int[] ns= {1,4,9,16,25};
		int sum = 0;
		for (int i = 0; i < ns.length; i++) {
			sum=sum+ns[i];
		}
		System.out.println(sum);
		
		//练习1
		int[] ns1= {1,4,9,16,25};
		for (int i = ns1.length-1; i >= 0; i--) {
			System.out.println(ns1[i]);
		}
		
		//练习2
		int[] ns2= {1,4,9,16,25};
		int sum2=0;
		for (int i : ns2) {
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
		//练习3
		double pi=0;
		for(int i=1;i<=1000000;i++) {
			if (i%2!=0) {
				pi+=1.0/(i*2-1);
			}else {
				pi+=-1.0/(i*2-1);
			}
		}
		pi=pi*4;
		System.out.println(pi);
	}
}
