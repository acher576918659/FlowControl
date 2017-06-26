package tw.aaa.myproject.FlowControl;

import java.util.Random;

public class NestedIf {

	public static void main(String[] args) {
		int a = -50;
		if (a >= 0) {
			System.out.println(a + " is positive.");
			if (a % 2 == 0) {
				System.out.println(a + " is even.");
			} else {
				System.out.println(a + " is odd.");
			}
		} else {
			System.out.println(a + " is negative.");
			if (a % 2 == 0) {
				System.out.println(a + " is even.");
			} else {
				System.out.println(a + " is odd.");
			}
		}

	}
}
