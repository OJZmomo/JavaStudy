import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
		//冒泡排序
		int[] ns= {28,12,89,73,65,18,96,50,8,36};
		System.out.println(Arrays.toString(ns));
		for (int i = 0; i < ns.length-1; i++) {
			for (int j = 0; j < ns.length-i-1; j++) {
				if(ns[j]>ns[j+1]) {
					int tmp=ns[j];
					ns[j]=ns[j+1];
					ns[j+1]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(ns));
		
		//数组方法
		int[] ns1= {28,12,89,73,99,18,96,50,8,1};
		Arrays.sort(ns1);
		System.out.println(Arrays.toString(ns1));
		
		//练习
		int[] ns2= {5,22,1,68,20,99,35,7,26,75};
		System.out.println(Arrays.toString(ns2));
		
		for (int i = 0; i < ns2.length-1; i++) {
			for (int j = 0; j < ns2.length-i-1; j++) {
				if (ns2[j]<ns2[j+1]) {
					int temp=ns2[j];
					ns2[j]=ns2[j+1];
					ns2[j+1]=temp;
				}
			}
		}
		
		 System.out.println(Arrays.toString(ns2));
	}
}
