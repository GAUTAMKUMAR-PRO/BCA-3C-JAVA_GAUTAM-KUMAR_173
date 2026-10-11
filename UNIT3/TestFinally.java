public class TestFinally {
	public static void main(String [] args) {
		try {
			System.out.println("student opening database connection...");
			int data = 20/5;
			System.out.println("Data calculated: " + data);
			
		} catch (ArithmeticException e) {
			System.out.println("Exception caught.");
			
		} finally {
			System.out.println("FINNALY BLOCK: Closing student's database connection guaranteed!");
		}
	}
}
