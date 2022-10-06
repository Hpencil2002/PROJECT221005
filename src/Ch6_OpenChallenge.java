import java.util.Scanner;

public class Ch6_OpenChallenge {
	static String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String line = scanner.nextLine();
			if (line.equals(";"))
				break;
			sb.append(line);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		
		int cnt[] = new int[26];
		String res = readString().toLowerCase();
		
		for (int i = 0; i < res.length(); i++)
			if (res.charAt(i) >= 'a' && res.charAt(i) <= 'z')
				cnt[(int)(res.charAt(i) - 'a')] += 1;
		
		System.out.println();
		System.out.println("히스토그램을 그립니다.");
		for (int i = 0; i < 26; i++) {
			System.out.print((char)(i + 'a'));
			for (int j = 0; j < cnt[i]; j++)
				System.out.print("-");
			System.out.println();
		}
	}

}
