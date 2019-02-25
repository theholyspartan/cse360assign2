package cse360assign2;

public class TestMain {

	public static void main(String[] args) {
		Calculator test = new Calculator();
		test.add(4);
		test.subtract(2);
		test.multiply(-2);
		test.divide(0);
		
		System.out.println(test.getTotal());
		System.out.println(test.getHistory());

	}

}
