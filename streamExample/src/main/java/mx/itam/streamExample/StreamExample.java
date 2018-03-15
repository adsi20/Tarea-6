package mx.itam.streamExample;
import java.util.*;
public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList <String>();
		names.add("Paco");
		names.add("Dany");
		names.add("Pablo");
		
		double d=names.stream()
		         .mapToInt(name->name.length())
		         .average()
		         .getAsDouble();
		System.out.println("The average is " + d);
	
	
		String s = names.stream()
		.reduce("",(n1,n2) ->
		    {
			if (n1.length() > n2.length())
				return n1;
			else
				return n2;
		    }
		);
		System.out.println("longest Name: " + s);
		}
}


