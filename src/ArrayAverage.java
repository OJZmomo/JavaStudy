import java.util.Arrays;

public class ArrayAverage {
	public static void main(String[] args) {
		//二维数组
		int[][] ns= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		System.out.println(ns.length);
		int[] arr0=ns[0];
		System.out.println(arr0.length);
		
		//打印二维数组
		System.out.println(Arrays.deepToString(ns));
		
		//练习
		int[][] scores= {
				{82,90,91},
				{68,72,64},
				{95,91,89},
				{67,52,60},
				{79,81,85}
		};
		
		double average=0;
		double total=0;
		int count=0;
		for (int[] is : scores) {
			for (int is2 : is) {
				total+=is2;
				count+=1;
			}
		}
		average=total/count;
		System.out.println(average);
	}
}
