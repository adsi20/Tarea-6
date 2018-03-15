package mx.itam.lambdaExample;

public class LambdaRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> System.out.println("In a lambda expression!");
		r.run();
	}

}
