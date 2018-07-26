package JUnit;

public class SimpleCalc {

	private final int first;
	private final int second;
	
	
	public SimpleCalc(int one, int two) {
		first = one;
		second = two;
	}

	public int division() {
		int d = first / second;
		return (int) d;
	}
	
	
	public int multiplication(){
		int m = first * second;
		return (int) m;
	}

	public int addition(){
		int a = first + second;
		return (int) a;
	}

	public int subtraction(){
		int s = first - second;
		return (int) s;
	}
}
