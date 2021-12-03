package week1.day2;

public class ConvertNegativeToPositiveNumber {

	public int convert (int num) {
		if (num<0) {
			return num * -1;
		}
		else {
			return num;
		}

	}
	public static void main(String[] args) {
		int num = -40;
		ConvertNegativeToPositiveNumber conv = new ConvertNegativeToPositiveNumber();
		int result = conv.convert(num);
		System.out.println("The number " + num + " is converted to " + result);

	}

}
