package week1.day2;

public class CharOccurance {
	public void findCharOccurance(String str) {
		int count=0;
		for (int i = 0; i< str.length(); i ++)
		 {
		if (str.charAt(i) == 'e') {
			 count = count + 1;
		}
	}
		System.out.println("The occurance of e is " + count);
	}
	public static void main(String[] args) {
		String str = "welcome to chennai";		
		CharOccurance charact = new CharOccurance();
		charact.findCharOccurance(str);
			}

}
