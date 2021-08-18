# How to use app-flow-tracker library?

Add following dependency to pom.xml
```
<dependency>
    <groupId>com.manasni</groupId>
    <artifactId>app-flow-tracker</artifactId>
    //<version>[1.0.0,)</version>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

add following on main method.  
`@ComponentScan({"com.manasni.*"})`

**Example**  
```
@ComponentScan({"com.manasni.*"})
@SpringBootApplication
public class ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.example.ExampleApplication.class, args);
    }
}
```
Where **com.manasni** is groupId from dependency we added.


