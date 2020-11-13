
public class ArrayShell {
	public static void main(String[] args) {
		for (String arg : args) {
			if ("-name".equals(arg)) {
				System.out.println("kiefer");
				break;
			}
		}
	}
}
