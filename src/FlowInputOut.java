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
        
        
        //����
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name=scanner.nextLine();
        System.out.print("Input your age: ");
        int age=scanner.nextInt();
        System.out.printf("Hi,%s,you are %d\n", name,age);
        
        //��ϰ
        Scanner scanner2=new Scanner(System.in);
        System.out.println("�����ϴο��Գɼ�: ");
        int score1=scanner2.nextInt();
        System.out.println("���뱾�ο��Գɼ�: ");
        int score2=scanner2.nextInt();
        double r=(double) (score2-score1)/score2*100;
        String b=r>0?"���":"����";
        System.out.printf("�ɼ�"+b+"�İٷֱȣ�%.2f\n", Math.abs(r));
	}
}
