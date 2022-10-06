import java.util.Scanner;

public class Ch6_Q7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print(">>");
			String a = scanner.nextLine();
			if (a.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			String s[] = a.split(" ");
			int n = s.length;
			System.out.println("어절 개수는 " + n);
		}
	}

}
