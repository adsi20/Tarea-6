mvn package
java -jar memento/proxy-0.0.1-SNAPSHOT.jar
mvn exec:java -Dexec.mainClass="mx.itam.memento.Caretaker"