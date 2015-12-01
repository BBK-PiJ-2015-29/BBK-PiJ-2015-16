package eight;

class EmptyArrayException extends Exception {
	private static final long serialVersionUID = 1L;

	EmptyArrayException() {
		super("Array Empty");
	}
}