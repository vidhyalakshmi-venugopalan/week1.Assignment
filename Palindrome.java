package week1.day2;

public class Palindrome {
public void palindrome(String str) {
	String revstr= "";
	for (int i = str.length()-1; i>=0; i--) {
	 revstr = revstr + str.charAt(i); 
	}
	if (str.equalsIgnoreCase(revstr)) {
		System.out.println("The given string " + str + " is a Palindrome");
	}
		else {
			System.out.println("The given string " + str + "is not a Palindrome");
		}
		}
	public static void main(String[] args) {
		String str = "madam";
		Palindrome pal = new Palindrome ();
		pal.palindrome(str);

	}

}
