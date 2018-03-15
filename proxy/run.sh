mvn package
java -jar target/proxy-0.0.1-SNAPSHOT.jar
mvn exec:java -Dexec.mainClass="mx.itam.proxy.ProxyPatternDemo"