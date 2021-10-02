package week1day1;

public class Fibonacciseries {

	public static void main(String[] args) {

		int count = 8;
		int F1 = 0;
		int F2 = 1;
		int Sum;

		System.out.println(F1);

		for (int i = 1; i < count; i++) {
			Sum = F1 + F2;
			System.out.println(Sum);
			F1 = F2;
			F2 = Sum;

		}

	}

}
