import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch6_Q7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print(">>");
			String a = scanner.nextLine();
			if (a.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(a, " ");
			int n = st.countTokens();
			System.out.println("어절 개수는 " + n);
		}
	}

}
