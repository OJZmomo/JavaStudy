import java.util.Scanner;

public class FlowSwitch {
	public static void main(String[] args) {
		int option=99;
		switch (option) {
		case 1: {
			System.out.println("Selected 1");
            break;
		}
		case 2: {
			System.out.println("Selected 2");
            break;
		}
		case 3: {
			System.out.println("Selected 3");
            break;
		}
		default:
			System.out.println("Not selected");
			break;
		}
		
		//switch表达式
		String fruit="apple";
		switch (fruit) {
		case "apple"->System.out.println("Selected apple");
		case "pear"->System.out.println("Selected pear");
		case "mango"->{
			System.out.println("Selected mango");
			System.out.println("Good choice!");
		}
		default->System.out.println("No fruit selected");
		}
		
		//返回值
		String fruit1="orange";
		int opt=switch(fruit1) {
			case "apple"->1;
			case "pear","mango"->2;
			default->{
				int code = fruit1.hashCode();
				yield code;
			}
		};
		System.out.println("opt="+opt);
		
		
		//练习
		System.out.println("请输入值：1.剪刀 2.石头 3.布");
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		int random=(int)(Math.random()*3+1);
		System.out.println(random);
		switch (i) {
			case 1-> {
				switch(random) {
					case 1->System.out.println("平局");
					case 2->System.out.println("输了");
					case 3->System.out.println("赢了");
				}
			}
			case 2-> {
				switch(random) {
					case 1->System.out.println("赢了");
					case 2->System.out.println("平局");
					case 3->System.out.println("输了");
				}
			}
			case 3-> {
				switch(random) {
					case 1->System.out.println("输了");
					case 2->System.out.println("赢了");
					case 3->System.out.println("平局");
				}
			}
			default->
				throw new IllegalArgumentException("Unexpected value: " + i);
		}
	}
}
