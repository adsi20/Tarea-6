mvn package
java -jar lambdaExample/proxy-0.0.1-SNAPSHOT.jar
mvn exec:java -Dexec.mainClass="mx.itam.lambdaExample.LambdaRunnable"