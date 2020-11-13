import java.util.Scanner;

public class FlowInputOut {
	public static void main(String[] args) {
		System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
        
        double d = 12900000;
        System.out.println(d);
        System.out.printf("%.2f\n", d);
        
        int n =12345000;
        System.out.printf("n=%d,hex=%08x", n,n);
        
        
        //输入
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name=scanner.nextLine();
        System.out.print("Input your age: ");
        int age=scanner.nextInt();
        System.out.printf("Hi,%s,you are %d\n", name,age);
        
        //练习
        Scanner scanner2=new Scanner(System.in);
        System.out.println("输入上次考试成绩: ");
        int score1=scanner2.nextInt();
        System.out.println("输入本次考试成绩: ");
        int score2=scanner2.nextInt();
        double r=(double) (score2-score1)/score2*100;
        String b=r>0?"提高":"降低";
        System.out.printf("成绩"+b+"的百分比：%.2f\n", Math.abs(r));
	}
}
