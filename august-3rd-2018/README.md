## Dropwizards
### Generate a new Dropwizard project
- From the terminal / cmd, navigate to where you want to create your project, then run:
```java
mvn archetype:generate \
        -DarchetypeGroupId=io.dropwizard.archetypes \
        -DarchetypeArtifactId=java-simple \
        -DarchetypeVersion=1.0.2
```

When it asks you for the PROJECT NAME, please put in your desired APPLICATION's Name in `UpperCamelCase` (for example: MyApp)

- After that, add this in pom.xml file under <dependencies>:
```java
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.2.11</version>
</dependency>
<dependency>
     <groupId>com.sun.xml.bind</groupId>
     <artifactId>jaxb-core</artifactId>
     <version>2.2.11</version>
</dependency>
<dependency>
     <groupId>com.sun.xml.bind</groupId>
     <artifactId>jaxb-impl</artifactId>
     <version>2.2.11</version>
</dependency>
<dependency>
     <groupId>javax.activation</groupId>
     <artifactId>activation</artifactId>
     <version>1.1.1</version>
</dependency>
```
