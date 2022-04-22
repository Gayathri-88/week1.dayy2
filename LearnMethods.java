package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {

		LearnMethods obj = new LearnMethods();
		obj.printCarName();
		obj.getCarRegNumber();
		int reg = obj.getCarRegNumber();
		System.out.println(reg);
		obj.getCarVariant();
		System.out.println(obj.getCarVariant());
		long mul = obj.multiplyTwoNumbers(987456L, 3216549L);
		System.out.println(mul);
	}

	public void printCarName() {

		System.out.println("Hyundai Creta");
	}

	public int getCarRegNumber()
	{
		int regnumber = 5566;
		return regnumber;
	}

	public String getCarVariant() {

		return "Petrol";
	}

	public long multiplyTwoNumbers(long a, long b) {

		return a*b;
	}
}
