
Create and run the legacy (non-di) code as follows:
```
// Create jar file
jar cfm legacy/Legacy.jar legacy/META-INF/MANIFEST.MF legacy/Controller.class legacy/ISender.class legacy/clients legacy/services

// Execute jar
java -jar legacy/Legacy.jar
```

Create and run the dependency injection code as follows:
```
// Create jar file
jar cfm di/DependencyInjected.jar di/META-INF/MANIFEST.MF di/Controller.class di/MessageClient.class di/injectors di/services

// Execute jar
java -jar di/DependencyInjected.jar
```