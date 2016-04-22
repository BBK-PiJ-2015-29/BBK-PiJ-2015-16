package q7;

public class MyString extends String {

//	WHICH WILL NOT COMPILE AS CAN NOT EXTEND SOMETHING THAT IS FINAL
//  MyString.java:1: error: cannot inherit from final String
//  public class MyString extends String {
//                              ^
//  1 error

	private String text;
	
	public MyString(String text) {
		super(text);
	}

	public void printEven() {
		System.out.println("Hello, here are the even letters: ");
		for (int i = 0; i < this.text.length(); i = i + 2) {
			System.out.println(" " + this.text.charAt(i));
		}
	}

}



