import java.util.Scanner;

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}
class StringStack implements Stack {
	private int size;
	private int index;
	private String [] StackArray;
	
	public StringStack(int size) {
		this.size = size;
		StackArray = new String[size];
		this.index = -1;
	}
	public int length() {
		return index + 1;
	}
	public int capacity() {
		return StackArray.length;
	}
	public String pop() {
		if (index == -1)
			return null;
		return StackArray[index--];
	}
	public boolean push(String val) {
		if (index + 1 < size) {
			index += 1;
			StackArray[index] = val;
			return true;
		}
		else
			return false;
	}
}

public class Ch5_Q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = scanner.nextInt();
		StringStack stack = new StringStack(size);
		
		while (true) {
			System.out.print("문자열 입력 >> ");
			String val = scanner.next();
			if (val.equals("그만"))
				break;
			if (!stack.push(val))
				System.out.println("스택이 꽉 차서 푸시 불가!");
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for (int i = 0; i < stack.capacity(); i++)
			System.out.print(stack.pop() + " ");
	}

}
