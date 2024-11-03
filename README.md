# DistributedSystemsBackend Learnings

### Better coding practices
1. Always ignore field dependency injections, it makes unit testing difficult and has other disadvantages.
Instead @Autowire dependencies using constructor.


### Databases for Spring Boot Application
1. You can use MongoDB cluster by following tutorial here @https://www.mongodb.com/resources/products/compatibilities/spring-boot
2. Starting from Spring 2.4, you can now import a config/env file manually into your application.prop file.
This will help you declare secret keys and passwords such as mongodb uri, etc to be stored in an .env file which is to
be ignored from .git commits and then can this env variable can be referenced in the application.prop file.
The way to do it is to create a .env file in the root folder. Then add this statement in the application.prop file:
<code> spring.config.import=optional:file:.env[.properties] </code>.
Refer for more info: @https://www.surly.dev/articles/how-to-use-env-files-with-spring-boot
3. 