package mx.itam.factory;

public class FactoryPatternDemo {

		   public static void main(String[] args) {
		      FábricaDeFiguras FábricaDeFiguras = new FábricaDeFiguras();

		    
		      Figura Figura1 = FábricaDeFiguras.getFigura("Círculo");

		      
		      Figura1.dibuja();

		      Figura Figura2 = FábricaDeFiguras.getFigura("Cuadrado");

		    
		      Figura2.dibuja();

		     
		      Figura Figura3 = FábricaDeFiguras.getFigura("Triángulo");

		      
		      Figura3.dibuja();
		   }
		}

