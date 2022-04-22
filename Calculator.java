package week1.day2;

public class Calculator {
	public static void main(String[] args) {

		Calculator no = new Calculator();
		
		int addno = no.add(568, 860, 980);
		System.out.println(addno);
		
		int subno = no.sub(698, 502);
		System.out.println(subno);
		
		double mulno = no.mul(58975, 56987);
		System.out.println(mulno);
		
		float divno = no.div(98456f, 3258f);
		System.out.println(divno);
		

	}

	public int add(int num1, int num2, int num3) {
		int addno = num1 + num2 + num3;
		return addno;
	}

	public int sub(int num1, int num2) {
		int subno = num1 - num2;
		return subno;
	}

	public double mul(double num1, double num2) {
		double mulno = num1 * num2;
		return mulno;
	}

	public float div(float num1, float num2) {
		float divno = num1 / num2;
		return divno;
	}
}
