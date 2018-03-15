package mx.itam.visitor;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final Car car = new Car();

	        car.accept(new CarElementPrintVisitor());
	        car.accept(new CarElementDoVisitor());

	}

}
