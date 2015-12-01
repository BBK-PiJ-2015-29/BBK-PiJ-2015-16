package basics;

//Use the default method. 
class DefaultMethodDemo {
	public static void main(String args[]) {

		MyIF obj = new MyIFImpl();

		// Can call getNumber(), because it is explicitly
		// implemented by MyIFImp:
		System.out.println(obj.getNumber());

		// Can also call getString(), because of default
		// implementation:
		System.out.println(obj.getString());
	}
}