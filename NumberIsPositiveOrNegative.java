package week1.day2;

public class NumberIsPositiveOrNegative {
	public void validateNum (int num) {
		if (num<0) {
			System.out.println("The Number is Negative");
		}	
		else if(num>0) {
			System.out.println("The Number is Positive");
	}
		else {
			System.out.println("The Number is neither Negative or Positive");
		}
	}
	public static void main(String[] args) {
		int num = 35;
		NumberIsPositiveOrNegative validate = new NumberIsPositiveOrNegative();
		validate.validateNum(num);
	}

}
