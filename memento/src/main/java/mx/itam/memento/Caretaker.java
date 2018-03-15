package mx.itam.memento;
import java.util.List;
import java.util.ArrayList;
public class Caretaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();
		 
        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        savedStates.add(originator.saveToMemento());
        originator.set("State3");
       
        savedStates.add(originator.saveToMemento());
        originator.set("State4");
 
        originator.restoreFromMemento(savedStates.get(1));  
	}

}
