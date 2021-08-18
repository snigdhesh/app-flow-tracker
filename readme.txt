How to use spring-boot app as dependency to another spring-boot app?
reference: https://www.baeldung.com/spring-boot-dependency

How to pick list of strings from application.yml and use it in pojo?
reference: https://www.baeldung.com/spring-boot-yaml-list

Important points:
- without follwing plugin, you can make spring-boot project as dependency in local - This is the key point.
 <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                  <executions>
                      <execution>
                          <id>repackage</id>
                          <configuration>
                              <classifier>exec</classifier>
                          </configuration>
                      </execution>
                  </executions>
            </plugin>
        </plugins>


- App-flow-tracker don't have to be up and running. Just add this dependency and dependency will do that job.

todo:
- pick multiple headers from props file
- set them to MDC.
- make this code available on artifactory and test it as dependency.
- work on rest-template customizer

enhancements todo:
- Make this annotation based. For example: You should be able to add app-flow-tracker with an annotation like @EnableAppFlowTracking.
- We should not break any consumer interceptors.
- See how to handle above execution plugin, while deployments. If we enable that, deployment fails.
- Make this library compatible with web-client, not only for restTemplate.