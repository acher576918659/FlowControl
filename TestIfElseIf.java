package tw.aaa.myproject.FlowControl;

public class TestIfElseIf {

	public static void main(String[] args) {
		int a = 2;
		int leap = 2004;
		if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
			System.out.println(a + "month has 31 days.");
		} else if (a == 4 || a == 6 || a == 9 || a == 11) {
			System.out.println(a + "month has 30 days.");
		} else if (a == 2) {// Lab:leap year
			if (leap%400==0||leap%4==0&&leap%100!=0) {
				System.out.println(a + "month has 29 days.");
			} else {
				System.out.println(a + "month has 28 days.");
			}
		} else {
			System.out.println("Invalid Month.");
		}

		System.out.println("test");
	}
}
