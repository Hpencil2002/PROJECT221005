class Point5 {
	int x, y;
	
	public Point5(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		Point5 p = (Point5)obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class EqualsEx {

	public static void main(String[] args) {
		Point5 a = new Point5(2, 3);
		Point5 b = new Point5(2, 3);
		Point5 c = new Point5(3, 4);
		
		if (a == b)
			System.out.println("a == b");
		if (a.equals(b))
			System.out.println("a is equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");
	}

}
