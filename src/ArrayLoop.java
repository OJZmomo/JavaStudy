import java.util.Arrays;

public class ArrayLoop {
	public static void main(String[] args) {
		//±éÀúÊý×é
		int[] ns= {1,4,9,16,25};
		for (int i : ns) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(ns));
		
		//Á·Ï°
		int[] ms= {1,5,9,15,20};
		for (int i = ms.length-1; i >=0; i--) {
			System.out.println(ms[i]);
		}
	}
}
