package mx.itam.factory;

public class FábricaDeFiguras {
		
		   
		   public Figura getFigura(String TipoDeFigura){
		      if(TipoDeFigura == null){
		         return null;
		      }		
		      if(TipoDeFigura.equalsIgnoreCase("Círculo")){
		         return new Círculo();
		         
		      } else if(TipoDeFigura.equalsIgnoreCase("Cuadrado")){
		         return new Cuadrado();
		         
		      } else if(TipoDeFigura.equalsIgnoreCase("Triángulo")){
		         return new Triángulo();
		      }
		      
		      return null;
		   }
		}

