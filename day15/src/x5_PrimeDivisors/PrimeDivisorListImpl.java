package x5_PrimeDivisors;

import java.util.LinkedList;

public class PrimeDivisorListImpl implements PrimeDivisorList {

	private LinkedList<Integer> list = new LinkedList<Integer>();
		
	@Override
	public void add(Integer i) {
		if(i == null) {
			throw new NullPointerException("No Null in this list");
		}
		if(!isPrime(i)) {
			throw new IllegalArgumentException("No non-primes in this list");
		}
		list.offer(i);
	}

	@Override
	public Integer remove() {
		Integer result = list.poll();
		return result;
	}

	@Override
	public String toString() {
		int total = 0;
		Integer a = remove();
		Integer b = remove();
		if (a == null) {
			return "List is empty";
		}
		String result = "[ " + a;
		total = a;
		while(b != null) {
			if (b != a) {
				result = result + " * " + b;
				total = total * b;
			}

			int count = 1;
			while (b == a) {
				count++;
				total = total * b;
				a = b;
				b = remove();
			}
			if(count > 1) {
				result = result + "^" + count;
			} else {
				a = b;
				b = remove();
			}	
		}
		return result + " = " + total + " ]";
	}
	
	private boolean isPrime(Integer n) {
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
